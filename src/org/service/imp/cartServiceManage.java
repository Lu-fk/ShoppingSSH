package org.service.imp;

import java.util.List;
import org.dao.cartDao;
import org.model.Cart;
import org.model.Dd;
import org.model.User;

import org.service.cartService;

public class cartServiceManage implements cartService{
	public cartDao cd;
	public void setCd(cartDao cd){
		this.cd=cd;
	}
	
	public List findCart(int gid,int uid){
		return cd.findCart(gid,uid);
	}
	
	public void updateCart(Cart cart){
		cd.update(cart);
	}
	
	public Cart findOne(int sid,int gid,int uid){
		return cd.findOne(sid,gid,uid);
	}
	
	public void delete(Cart cart){
		cd.delete(cart);
	}
	
	public void buy(Dd order){
		cd.buy(order);
	}
	
	public void addCount(User user){
		cd.addCount(user);
	}
}
