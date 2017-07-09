package org.service;

import java.util.List;
import org.model.Cart;
import org.model.Dd;
import org.model.User;

public interface cartService {
	public List findCart(int gid,int uid);
	public void updateCart(Cart cart);
	public Cart findOne(int sid,int gid,int uid);
	public void delete(Cart cart);
	public void buy(Dd order);
	public void addCount(User user);
}
