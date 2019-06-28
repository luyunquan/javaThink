package com.sit.think.接口与类型信息;

public class HIddenCMain {
	public static void main(String[] args) {
	A a=HiddenC.makeA();
	a.f();
	
	if(a instanceof C){
		C c=(C)a;
		c.g();
	}
	}
}
