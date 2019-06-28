package com.sit.think.接口与类型信息;

class  C  implements A{
	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("F");
	}
	
	public  void  g(){
		System.out.println("G");
	}
	
}

public class HiddenC {
	public static  A  makeA(){
		return  new  C();
	}

}
