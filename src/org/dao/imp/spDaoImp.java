package org.dao.imp;

import java.util.List;
import org.dao.spDao;
import org.model.Comodity;
import org.model.Cart;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class spDaoImp extends HibernateDaoSupport implements spDao{
	public List findAll(){
		List list = getHibernateTemplate().find("from Comodity");
		return list;
	}
	
	public Comodity findById(int id){
		List list = getHibernateTemplate().find("from Comodity where id=?",id);
		return (Comodity)list.get(0);
	}
	
	public void addCart(Cart cart){
		getHibernateTemplate().save(cart);		
	}
}
