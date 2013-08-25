package com.love.webservice.server;

public class HelloWorldImpl implements IHelloWorld {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub


		System.out.println("say hello is called");
		  return "hello "+name;
	}

}
