package org.dao.imp;

import java.util.List;
import org.dao.orderDao;
import org.dao.spDao;
import org.model.Comodity;
import org.model.Dd;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class orderDaoImp extends HibernateDaoSupport implements orderDao{
	public List getOrder(int uid){
		List list = getHibernateTemplate().find("from Dd where id.UId=?",uid);
		return list;
	}
	
	public void delete(Dd dd){
		getHibernateTemplate().delete(dd);
	}
	
	public Dd find(int id,int uid){
		List list = getHibernateTemplate().find("from Dd where id.DId=? and id.UId=?",id,uid);
		return (Dd)list.get(0);
	}
}
