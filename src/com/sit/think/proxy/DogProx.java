package com.sit.think.proxy;

public class DogProx implements Animal{
	private  Animal animal;
	public DogProx(Animal animal){
		this.animal=animal;
	}

	@Override
	public String eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("beform  吃");
		String str=animal.eat(food);
		System.out.println("after  吃");
		return str;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("beform  玩");
		animal.play();
		System.out.println("after  玩");
	}

	@Override
	public void angry() {
		// TODO Auto-generated method stub
		System.out.println("beform  生气");
		animal.angry();;
		System.out.println("after  生气");
	}

}
