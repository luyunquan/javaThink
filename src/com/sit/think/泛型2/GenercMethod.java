package com.sit.think.泛型2;

public class GenercMethod {
	
	public <A,B,C> void f(A a,B b,C c){
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}

	public static void main(String[] args) {
		GenercMethod  gen=new GenercMethod();
		gen.f("300",2,1.3f);
	}
}
