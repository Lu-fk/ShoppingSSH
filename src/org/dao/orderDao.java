package org.dao;

import java.util.List;
import org.model.Dd;

public interface orderDao {
	//获取订单信息
	public List getOrder(int uid);
	//删除订单
	public void delete(Dd dd);
	//查找订单
	public Dd find(int id,int uid);
}
