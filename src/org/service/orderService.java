package org.service;

import java.util.List;
import org.model.Dd;

public interface orderService {
	public List getOrder(int uid);
	public void delete(Dd dd);
	public Dd find(int id,int uid);
}
