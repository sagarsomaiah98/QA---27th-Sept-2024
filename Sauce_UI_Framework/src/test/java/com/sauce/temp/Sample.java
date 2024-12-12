package com.sauce.temp;

public class Sample {
	
	//default constructor called whenver object is created
	//difference between constructor and method is constructor will not have return type and name of
	//the constructor is same as class name
	
	public  Sample() {
		System.out.println("calling default constructor");
	}

	public static void main(String[] args) {
		
		Sample sample= new Sample();

	}

}
