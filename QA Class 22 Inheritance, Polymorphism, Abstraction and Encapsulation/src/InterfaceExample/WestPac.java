package InterfaceExample;

public class WestPac implements CentralBank {

	public static void main(String[] args) {
		WestPac w = new WestPac();
		w.savings();
		w.creditcard();
		w.homeloan();
		w.insurance();

	}

	@Override
	public void savings() {
		System.out.println("Wespac saving interest is 4.5%");
		
	}

	@Override
	public void insurance() {
		System.out.println("westpac insurance is 100$");
	}

	

	@Override
	public void homeloan() {
		System.out.println("westpac home interest rate is 4.5%");
		
	}

	@Override
	public void creditcard() {
		System.out.println("westpace credit card charges is 100$");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
