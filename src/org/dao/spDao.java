package org.dao;

import org.model.Comodity;
import org.model.Cart;
import java.util.List;

public interface spDao {
	//������Ʒ�Ų�ѯ��Ʒ��Ϣ
	public Comodity findById(int id);
	
	//�鿴������Ʒ��Ϣ
	public List findAll();
	
	//��ӵ����ﳵ
	public void addCart(Cart cart);
}
