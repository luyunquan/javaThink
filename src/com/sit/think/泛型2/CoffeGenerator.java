package com.sit.think.泛型2;

import java.util.Iterator;
import java.util.Random;

public class CoffeGenerator implements Generator<Coffee> ,Iterable<Coffee>{
	
	private  Class[] types=new Class[]{Latter.class,Cappuccino.class,Moha.class,Breve.class};
	private static Random random=new  Random(47);
	public CoffeGenerator(){super();};
	private  int  size;
	public CoffeGenerator(int size){this.size=size;};
	@Override
	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator();
	}

	@Override
	public Coffee next() {
		// TODO Auto-generated method stub
		try {
			return (Coffee)types[random.nextInt(types.length)].newInstance();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} 
	}
	
	class CoffeeIterator implements Iterator<Coffee>{
		int count=size;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return count>0;
		}

		@Override
		public Coffee next() {
			// TODO Auto-generated method stub
			count--;
			return CoffeGenerator.this.next();
		}
		
	}
	
	public static void main(String[] args) {
		CoffeGenerator gen=new CoffeGenerator();
		for(int i=0;i<10;i++){
			System.out.println(gen.next()); 
		}
		for(Coffee c:new CoffeGenerator(10)){
			System.out.println(c);
		}
	}
}
