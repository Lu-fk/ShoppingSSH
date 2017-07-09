package org.dao;

import org.model.Comodity;
import org.model.Cart;
import java.util.List;

public interface spDao {
	//根据商品号查询商品信息
	public Comodity findById(int id);
	
	//查看所有商品信息
	public List findAll();
	
	//添加到购物车
	public void addCart(Cart cart);
}
