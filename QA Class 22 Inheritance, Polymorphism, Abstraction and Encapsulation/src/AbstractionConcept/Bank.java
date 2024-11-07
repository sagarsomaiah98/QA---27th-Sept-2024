package AbstractionConcept;

public abstract class Bank {
	
	public abstract void savings();
	
	public  void insurance() {
		System.out.println("insurance premium should be quarterly");
	}
	public  void creditcard() {
		System.out.println("credit limit should be based on salary");
	}
	
	public static void main(String[] args) {
	
	
	}
}
