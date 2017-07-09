package org.service.imp;

import org.dao.dlDao;
import org.model.User;
import org.service.dlService;


public class dlServiceManage implements dlService{
	private dlDao dl;
	public void setDl(dlDao dl){
		this.dl=dl;
	}
	
	public User checkLogin(String name,String psw){
		return dl.check(name, psw);
	}
	
	public void register(User user){
		dl.register(user);
	}
	
	public boolean findID(String name){
		return dl.findID(name);
	}
}
