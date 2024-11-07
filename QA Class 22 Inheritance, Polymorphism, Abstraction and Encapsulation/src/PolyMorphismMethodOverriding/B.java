package PolyMorphismMethodOverriding;

public class B extends A {
	
	//changing the implementation of parent in child class
	
	public void house() {
		System.out.println("house belongs to B");
	}


	public static void main(String[] args) {
		
		B b = new B();
		b.car();
		b.house();

	}

}
