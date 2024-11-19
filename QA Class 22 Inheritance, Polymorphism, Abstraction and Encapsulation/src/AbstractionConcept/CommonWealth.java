package AbstractionConcept;

public class CommonWealth extends BankRules {

	public static void main(String[] args) {
		CommonWealth c = new CommonWealth();
		c.savings();
		c.insurance();
		c.creditcard();
		c.homeloan();
		c.kyc();
	}

	@Override
	public void savings() {
		System.out.println("savings");
		
	}

	@Override
	public void insurance() {
		System.out.println("insurance");
		
	}

	@Override
	public void creditcard() {
		System.out.println("credit card");
		
	}

	@Override
	public void homeloan() {
		System.out.println("home loan");
		
	}

}
