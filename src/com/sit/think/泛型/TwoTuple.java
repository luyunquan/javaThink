package com.sit.think.泛型;

public class TwoTuple <A,B>{
	
	public final A  a;
	
	public final  B  b;
	
	public  TwoTuple(A a,B b){
		this.a=a;
		this.b=b;
	}
	
	public  String  toString(){
		return  "("+a+""+b+")";
	}
	
	

}
