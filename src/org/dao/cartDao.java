package org.dao;

import java.util.List;
import org.model.Cart;
import org.model.Dd;
import org.model.User;

public interface cartDao {
	//���ҹ��ﳵ��Ϣ
	public List findCart(int gid,int uid);
	//�޸Ĺ��ﳵ
	public void update(Cart cart);
	//���ҹ��ﳵ��ĳ����Ʒ
	public Cart findOne(int sid,int gid,int uid);
	//ɾ��
	public void delete(Cart cart);
	//����
	public void buy(Dd order);
	//���˺�����û���
	public void addCount(User user);

}
