package com.sit.think.classload;
interface  HasBatteries{}
interface  Waterproof{};
interface  Shoots{}
class Toys{
	public Toys(){
		System.out.println("toysinit");
	}
	public Toys(String str){
		System.out.println("toys "+str);
	}
}
class FancyToy extends Toys implements HasBatteries,Waterproof,Shoots{
	 FancyToy(){
		 super("3");
	 }
}
public class FormName {
	public static void main(String[] args) {
		Class<?> c=null;
		try{
			c=Class.forName("com.sit.think.classload.FancyToy");
		}catch(Exception e){
			System.exit(1);
		}
		System.out.println(c.getName());
		for(Class  cl:c.getInterfaces()){
			System.out.println(cl.getName());
		}
		System.out.println(c.getSuperclass().getName());
		Object obj=null;
		try {
			obj=c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj.getClass());
		
	}
}