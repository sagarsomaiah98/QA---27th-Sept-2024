package PolyMorphism;

public class OverloadingEx {
	
	public void info() {
		System.out.println("calling info");
	}
	
	public void info(int i) {
		System.out.println("calling info 2");
	}

	public void info(String m) {
		System.out.println("calling info 3");
	}
	

	public void info(double i) {
		System.out.println("calling info 4");
	}
	public static void main(String[] args) {
	
		OverloadingEx o= new OverloadingEx();
		o.info(56.36);

	}

}
