package org.service;

import java.util.List;

import org.model.Comodity;
import org.model.Cart;

public interface spService {
	public Comodity findById(int id);
	public List findAll();
	public void addCart(Cart cart);
}
