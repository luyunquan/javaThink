package com.sit.think.proxy;

public class Dog implements  Animal{

	@Override
	public String eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("吃"+food);
		return "吃"+food;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("玩");
	}

	@Override
	public void angry() {
		// TODO Auto-generated method stub
		System.out.println("生气");
	}

}
