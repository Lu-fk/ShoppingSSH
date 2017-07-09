package org.service;

import org.model.User;

public interface dlService {
	public User checkLogin(String name,String psw);
	public void register(User user);
	public boolean findID(String name);
}
