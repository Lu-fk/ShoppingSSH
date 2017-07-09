package org.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import org.model.Comodity;
import org.model.User;
import org.model.Cart;
import org.model.CartId;

import org.service.spService;
import org.service.cartService;


import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class spAction extends ActionSupport{	
	private Comodity c;
	private spService spservice;
	private cartService cartservice;
	
	//����ע��
	public void setCartservice(cartService cartservice){
		this.cartservice=cartservice;
	}
	public cartService getCartservice(){
		return cartservice;
	}	
	
	public void setSpservice(spService spservice){
		this.spservice=spservice;
	}
	public spService getSpservice(){
		return spservice;
	}
	
	//��ʾ������Ʒ��Ϣ
	public String execute() throws Exception{
		List list=spservice.findAll();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("list",list);
		return SUCCESS;
	}
	
	//��id��ʾ��Ʒ��ϸ��Ϣ
	public String detail() throws Exception{
		Map request=(Map)ActionContext.getContext().get("request");
		
		HttpServletRequest request1 = ServletActionContext.getRequest();
		
		int id= Integer.parseInt(request1.getParameter("id"));
		
		if(id>0){
			Comodity detail = spservice.findById(id);		
			request.put("dedail", detail);		
			return SUCCESS;		
		}
		else{
			 return ERROR;
		}
	}
	
	//��ӵ����ﳵ
	public String addToCart() throws Exception{
		//��ȡ������Ʒid��������Ʒ��Ϣ
		HttpServletRequest request = ServletActionContext.getRequest();		
		int id= Integer.parseInt(request.getParameter("id"));
		Comodity como = spservice.findById(id);
		//���ҹ��ﳵid
		Map session=(Map)ActionContext.getContext().getSession();
		User loger=(User)session.get("log");
		List list=cartservice.findCart(loger.getCount(),loger.getId());
		if(list!=null){
			for(int i=0;i<list.size();i++){
				Cart c=(Cart)list.get(i);
				if(id==c.getId().getSid()){
					int num=c.getNum();
					num++;
					double price=c.getPrice();
					double nprice=c.getNprice();
					nprice=price+nprice;
					c.setNprice(nprice);
					c.setNum(num);
					cartservice.updateCart(c);
					request.setAttribute("buyMessage", "��ӳɹ�");
					return SUCCESS;
				}
			}
		}
		//û���ظ���Ʒ�Ͳ���
		Cart cart = new Cart();
		CartId Cid = new CartId();
		Cid.setUid(loger.getId());
		Cid.setGid(loger.getCount());
		Cid.setSid(id);
		cart.setId(Cid);
		cart.setName(como.getName());
		cart.setNum(1);
		cart.setPrice(como.getPrice());
		cart.setNprice(como.getPrice());
		spservice.addCart(cart);
		request.setAttribute("buyMessage", "��ӳɹ�");
		return SUCCESS;
	
	}
}
