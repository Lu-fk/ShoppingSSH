package org.dao;

import java.util.List;
import org.model.Dd;

public interface orderDao {
	//��ȡ������Ϣ
	public List getOrder(int uid);
	//ɾ������
	public void delete(Dd dd);
	//���Ҷ���
	public Dd find(int id,int uid);
}
