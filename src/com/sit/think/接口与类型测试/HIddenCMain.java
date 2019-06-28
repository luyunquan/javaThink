package com.sit.think.接口与类型测试;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sit.think.接口与类型信息.A;
import com.sit.think.接口与类型信息.HiddenC;

public class HIddenCMain {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	A a=HiddenC.makeA();
	a.f();
	/*if(a instanceof C){
		C c=(C)a;
		c.g();
	}*/
	callHiddenMethod(a,"g");
	
	}
	
	private static void  callHiddenMethod(Object object,String methodName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method method=object.getClass().getDeclaredMethod(methodName, null);
		method.setAccessible(true);
		method.invoke(object, null);
	}
}
