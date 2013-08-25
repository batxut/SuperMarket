package com.love.webservice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.love.webservice.server.IHelloWorld;

public class Client {

	/**
	 * @方法说明: 
	 * @参数:     @param args
	 * @return    void
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_cxf.xml"); 
		IHelloWorld helloWorld=(IHelloWorld)context.getBean("helloWorldClient");
		System.out.println(helloWorld.sayHello("Test"));
	}

}
