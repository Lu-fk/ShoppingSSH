package org.interceptor;

import java.util.Map;

import org.model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class log_intercept extends AbstractInterceptor{
	public String intercept(ActionInvocation arg0) throws Exception{
		Map session=arg0.getInvocationContext().getSession();
		User user=(User)session.get("log");
		if(user==null){
			return Action.LOGIN;
		}
		return arg0.invoke();
	}
}
