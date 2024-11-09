package com.janbask.B;

import com.janbask.A.Protected_Example;

public class Test1 extends Protected_Example{

	public static void main(String[] args) {
	
		/*
		 * Default_Example d = new Default_Example(); System.out.println(d.age);
		 * System.out.println(d.name); d.method1();
		 */
	
		/*
		 * Protected_Example pr= new Protected_Example(); System.out.println(pr.age);
		 * System.out.println(pr.name); pr.method1();
		 */
		
		Test1 t= new Test1();
		t.method1();
		System.out.println(t.age);
		System.out.println(t.name);
	
	}

}
