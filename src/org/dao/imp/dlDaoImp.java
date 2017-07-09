package org.dao.imp;

import java.util.List;
import org.dao.dlDao;
import org.model.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class dlDaoImp extends HibernateDaoSupport implements dlDao{
	public User check(String name,String psw){
		List list = getHibernateTemplate().find("from User where name=? and psw=?",name,psw);
		
		if(list.size()>0){
			return (User)list.get(0);	
		}
		else
			return null;
		
	}
	
	public void register(User user){
		getHibernateTemplate().save(user);
	}
	
	public boolean findID(String name){
		List list = getHibernateTemplate().find("from User where name=?",name);
		//如果存在返回false，不存在返回true;
		if(list.size()>0){
			return false;
		}else
			return true;
	}
}
