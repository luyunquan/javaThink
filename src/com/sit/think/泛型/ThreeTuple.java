package com.sit.think.泛型;

import javax.sound.midi.Sequence;

public class ThreeTuple <A,B,C> extends  TwoTuple<A,B>{
	
	public  final  C  c;

	public ThreeTuple(A a, B b,C c) {
		super(a, b);
		// TODO Auto-generated constructor stub
		this.c=c; 
	}

	
}
