package org.dao;

import org.model.User;

public interface dlDao {
	//��½
	public User check(String name,String psw);
	//ע��
	public void register(User user);
	//�����û����Ƿ����
	public boolean findID(String name);
}
