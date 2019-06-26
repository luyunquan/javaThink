package com.sit.think.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
	
	private  Object  object;
	
	public  DynamicProxyHandler(Object object) {
		this.object=object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行前");
		Object result= method.invoke(object, args);
		System.out.println("执行后");
		return result;
	}

}
