package org.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.model.User;
import org.service.dlService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{
	private dlService dlservice;
	private User user;
	
	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user=user;
	}
	
	public dlService getDlservice(){
		return dlservice;
	}
	
	public void setDlservice(dlService dlservice){
		this.dlservice=dlservice;
	}
	
	public String execute() throws Exception{	
		User log = dlservice.checkLogin(user.getName(), user.getPsw());
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session1=request.getSession();
		String rand=(String)session1.getAttribute("rand");
		String Rand=request.getParameter("Rand");
		//核对验证码
		if(rand.equals(Rand)){
			if(log!=null){
				Map session=(Map)ActionContext.getContext().getSession();
				session.put("log", log);
				return SUCCESS;
			}else{
				request.setAttribute("tipMessage", "用户名或密码错误");
				return ERROR;
			}
		}else
			request.setAttribute("tipMessage", "验证码错误");
		
		return ERROR;
	}
	
	public String register() throws Exception{
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session1=request.getSession();
		String rand=(String)session1.getAttribute("rand");
		String Rand=request.getParameter("Rand");
		
		if(rand.equals(Rand)){
			if(user.getName().length()>0&&user.getPsw().length()>0){
				if(dlservice.findID(user.getName())){
					User newU = new User();
					newU.setCount(1);
					newU.setName(user.getName());
					newU.setPsw(user.getPsw());
					dlservice.register(newU);
					return SUCCESS;
				}else
					request.setAttribute("errMessage", "用户名已经被注册啦！");
			}else
				request.setAttribute("errMessage", "用户名或密码不能为空！");
		}else
			request.setAttribute("errMessage", "验证码错误！");
		
		return ERROR;
	}
}
