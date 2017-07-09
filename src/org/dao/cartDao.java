package org.dao;

import java.util.List;
import org.model.Cart;
import org.model.Dd;
import org.model.User;

public interface cartDao {
	//查找购物车信息
	public List findCart(int gid,int uid);
	//修改购物车
	public void update(Cart cart);
	//查找购物车里某个商品
	public Cart findOne(int sid,int gid,int uid);
	//删除
	public void delete(Cart cart);
	//结账
	public void buy(Dd order);
	//结账后更新用户表
	public void addCount(User user);

}
