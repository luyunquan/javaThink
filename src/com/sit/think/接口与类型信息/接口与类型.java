package com.sit.think.接口与类型信息;


class  B  implements  A{

	@Override
	public void f() {
		System.out.println("F");
	}
	public  void g(){
		System.out.println("G");
	}
}
public class 接口与类型 {
	
	public static void main(String[] args) {
		A a=new  B();
		a.f();
		if(a instanceof B){
			B b=(B)a;
			b.g();
		}
	}
	
	
}
