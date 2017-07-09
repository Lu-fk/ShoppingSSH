package org.dao.imp;

import java.util.List;
import org.dao.cartDao;
import org.model.Cart;
import org.model.Comodity;
import org.model.Dd;
import org.model.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class cartDaoImp extends HibernateDaoSupport implements cartDao{
	public List findCart(int gid,int uid){		
		List list=getHibernateTemplate().find("from Cart where gid=? and uid=?",gid,uid);
		if(list.size()>0)
			return list;
		else
			return null;
	}
	
	public void update(Cart cart){
		getHibernateTemplate().update(cart);
	}
	
	public Cart findOne(int sid,int gid,int uid){
		List list = getHibernateTemplate().find("from Cart where sid=? and gid=? and uid=?",sid,gid,uid);
		return (Cart)list.get(0);
	}
	
	public void delete(Cart cart){
		getHibernateTemplate().delete(cart);
	}
	
	public void buy(Dd order){		
		getHibernateTemplate().save(order);
	}
	
	public void addCount(User user){
		getHibernateTemplate().update(user);
	}
	
}
