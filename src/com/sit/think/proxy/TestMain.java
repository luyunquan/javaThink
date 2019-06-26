package com.sit.think.proxy;

public class TestMain {
	
	private static void custom(Animal  animal){
		animal.eat("");
		animal.play();
		animal.angry();
	}
	public static void main(String[] args) {
		custom(new DogProx(new Dog()));
	}
}
