package org.service.imp;

import java.util.List;

import org.dao.spDao;
import org.model.Comodity;
import org.model.Cart;
import org.service.spService;

public class spServiceManage implements spService{
	private spDao sp;
	public void setSp(spDao sp){
		this.sp=sp;
	}
	
	public Comodity findById(int id){
		return sp.findById(id);
	}
	public List findAll(){
		return sp.findAll();
	}
	public void addCart(Cart cart){
		sp.addCart(cart);
	}
}
