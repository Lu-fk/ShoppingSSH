package org.dao;

import org.model.User;

public interface dlDao {
	//登陆
	public User check(String name,String psw);
	//注册
	public void register(User user);
	//查找用户名是否存在
	public boolean findID(String name);
}
