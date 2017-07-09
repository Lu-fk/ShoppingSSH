package org.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.model.Dd;
import org.model.User;
import org.service.cartService;
import org.service.orderService;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;

public class orderAction extends ActionSupport{
	private orderService orderservice;
	private cartService cartservice;
	
	public void setOrderservice(orderService orderservice){
		this.orderservice=orderservice;
	}
	public orderService getOrderservice(){
		return orderservice;
	}
	
	public void setCartservice(cartService cartservice){
		this.cartservice=cartservice;
	}
	public cartService getCartservice(){
		return cartservice;
	}
	
	
	public String execute() throws Exception{
		Map session=(Map)ActionContext.getContext().getSession();		
		User loger=(User)session.get("log");
		List list=orderservice.getOrder(loger.getId());
		if(list!=null){
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("list",list);
			return SUCCESS;
		}else{
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("buyMessage", "您还没有订单！再去商城逛逛吧！");
			return ERROR;
		}
	}
	
	public String delete() throws Exception{
		Map session=(Map)ActionContext.getContext().getSession();		
		User loger=(User)session.get("log");
		HttpServletRequest request = ServletActionContext.getRequest();		
		int id= Integer.parseInt(request.getParameter("did"));
		Dd dd=orderservice.find(id,loger.getId());
		orderservice.delete(dd);
		return SUCCESS;
	}
	
	public String Ddetail() throws Exception{
		Map session=(Map)ActionContext.getContext().getSession();		
		User loger=(User)session.get("log");
		HttpServletRequest request = ServletActionContext.getRequest();		
		int id= Integer.parseInt(request.getParameter("did"));
		
		Dd dd = orderservice.find(id,loger.getId());
		Map request1=(Map)ActionContext.getContext().get("request");
		request1.put("dd", dd);
		
		List list = cartservice.findCart(dd.getGId(),loger.getId());
		request1.put("carts",list);
		
		return SUCCESS;
	}
}
