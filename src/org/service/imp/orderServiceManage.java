package org.service.imp;

import java.util.List;

import org.service.orderService;
import org.dao.orderDao;
import org.model.Dd;

public class orderServiceManage implements orderService{
	private orderDao od;
	public void setOd(orderDao od){
		this.od=od;
	}
	
	public List getOrder(int uid){
		return od.getOrder(uid);
	}
	
	public void delete(Dd dd){
		od.delete(dd);
	}
	
	public Dd find(int id,int uid){
		return od.find(id,uid);
	}
}
