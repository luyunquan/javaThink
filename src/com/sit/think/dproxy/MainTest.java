package com.sit.think.dproxy;
import java.lang.reflect.Proxy;

import com.sit.think.proxy.Animal;
import com.sit.think.proxy.Dog;
public class MainTest {

	public static void  cusomer(Animal animal){
		animal.eat("");
		animal.play();
		animal.angry();
	}
	
	public static void main(String[] args) {
		Dog dog=new  Dog();
		Animal proxy=(Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(), new Class[]{Animal.class}, new DynamicProxyHandler(dog));
		cusomer(proxy);
	}
	
}
