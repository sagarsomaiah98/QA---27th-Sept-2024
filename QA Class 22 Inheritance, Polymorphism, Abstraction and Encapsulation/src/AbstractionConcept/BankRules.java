package AbstractionConcept;

public abstract class BankRules {
	
	public abstract void savings() ;
	public abstract void insurance();
	public abstract void creditcard();
	public abstract void homeloan();
	public void kyc() {
		System.out.println("Mandatory SSN");
	}

	public static void main(String[] args) {
	
		

	}

}
