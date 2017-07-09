package org.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.service.cartService;

import org.model.Cart;
import org.model.User;
import org.model.Dd;
import org.model.DdId;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;

public class cartAction extends ActionSupport{
	private Cart cart;
	private cartService cartservice;
	
	public void setCartservice(cartService cartservice){
		this.cartservice=cartservice;
	}
	public cartService getCartService(){
		return cartservice;
	}
	
	//搜索购物车信息
	public String execute() throws Exception{
		Map session=(Map)ActionContext.getContext().getSession();		
		User loger=(User)session.get("log");
		if(loger==null){
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("tipMessage", "您的登陆已过期");
			return "logerror";
		}
		List list=cartservice.findCart(loger.getCount(),loger.getId());		
		if(list!=null){
			double sum=0;
			for(int i=0;i<list.size();i++){
				Cart c=(Cart)list.get(i);
				sum+=c.getNprice();
			}
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("cart", list);
			request.put("sum", sum);
			return SUCCESS;
		}else{
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("buyMessage", "购物车里空空如也~~去商店逛逛吧！");
			return ERROR;
		}
		
	}
	
	//增加数量
	public String addnum() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();		
		int sid= Integer.parseInt(request.getParameter("id"));
		Map session=(Map)ActionContext.getContext().getSession();		
		User loger=(User)session.get("log");
		
		Cart c=cartservice.findOne(sid,loger.getCount(),loger.getId());
		
		int n = c.getNum();
		double nprice=c.getNprice();
		double price=c.getPrice();
		nprice+=price;
		n++;
		c.setNum(n);
		c.setNprice(nprice);
		cartservice.updateCart(c);
		return SUCCESS;
	}
	
	//减少数量
	public String subnum() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();		
		int sid= Integer.parseInt(request.getParameter("id"));
		Map session=(Map)ActionContext.getContext().getSession();		
		User loger=(User)session.get("log");
		
		Cart c=cartservice.findOne(sid,loger.getCount(),loger.getId());
		
		int n = c.getNum();
		if(n!=1){
			n--;
			c.setNum(n);
			double nprice=c.getNprice();
			double price=c.getPrice();
			nprice-=price;
			c.setNprice(nprice);
			cartservice.updateCart(c);
			return SUCCESS;
		}else{
			cartservice.delete(c);
			return SUCCESS;
		}
	}
	
	//结账
	public String buy() throws Exception{
		Map session=(Map)ActionContext.getContext().getSession();
		User loger=(User)session.get("log");		
		
		Dd order = new Dd();
		order.setGId(loger.getCount());
		
		DdId  ddid= new DdId();
		ddid.setDId(loger.getCount());
		ddid.setUId(loger.getId());
		
		order.setId(ddid);
		
		order.setTime(new Date());
		HttpServletRequest request = ServletActionContext.getRequest();
		double sum= Double.parseDouble(request.getParameter("sum"));					
		order.setNprice(sum);
		
		int count=loger.getCount();
		count++;
		loger.setCount(count);
		cartservice.addCount(loger);
		
		cartservice.buy(order);
		
		session.put("log", loger);
		
		return SUCCESS;
	}	
}
