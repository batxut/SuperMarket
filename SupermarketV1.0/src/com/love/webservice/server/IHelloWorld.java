package com.love.webservice.server;

import javax.jws.WebService;

@WebService
public interface IHelloWorld {

	
	public String sayHello(String name);
}
