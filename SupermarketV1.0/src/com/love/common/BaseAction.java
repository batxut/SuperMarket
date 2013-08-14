/**
 	@file BaseAction.java 	
	@brief 公用Action属性和方法
	该文件提供全局action所需要的对象和方法
	@author  green@nocardpay.com
 */
package com.love.common;

import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 基础Action，解决Struts2的Action（普通JavaBean）使用request、reponse、 session等问题。
 */
public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware, HttpSessionListener {

	private static final long serialVersionUID = 5285026747041293458L;
	protected Logger log = Logger.getLogger(this.getClass());
	protected HttpServletResponse response = null;
	protected HttpServletRequest request = null;
	protected HttpSession session = null;
	private String jsp;

	public String page() {
		return jsp;
	}

	public void setServletRequest(HttpServletRequest req) {
		this.request = req;
		this.session = this.request.getSession();
	}

	public void setServletResponse(HttpServletResponse rep) {
		this.response = rep;
		this.response.setCharacterEncoding("utf-8");
	}

	public String getJsp() {
		return jsp;
	}

	public void setJsp(String jsp) {
		this.jsp = jsp;
	}

	protected ServletRequest getServletRequest() {
		return ServletActionContext.getRequest();
	}

	protected ServletResponse getServletResponse() {
		return ServletActionContext.getResponse();
	}

	protected Map<String, Object> getParams() {
		return ActionContext.getContext().getParameters();
	}

	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub

	}

	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub

	}

}
