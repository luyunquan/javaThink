package com.sit.think.classload;

public class SweetShop {
	public static void main(String[] args) {
		System.out.println("---------");
		new Candy();
		System.out.println("After createting Cnady");
		try {
			Class.forName("com.sit.think.classload.Gum");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After class.formname(gum)");
		new Cookie();
		System.out.println("After createting Cookie");
	}
}
