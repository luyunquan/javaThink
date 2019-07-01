package com.sit.think.泛型;

public class Holder<T> {
	
	private  T  t;
	
	public Holder(T t){
		this.t=t;
	}
	
	public void setT(T t){
		this.t=t;
	}
	
	public T  get(){
		return  t;
	}
	
	public static void main(String[] args) {
		Holder<String> holder=new  Holder<String>("kskdksd");
		System.out.println(holder.get());
		
	}

}
