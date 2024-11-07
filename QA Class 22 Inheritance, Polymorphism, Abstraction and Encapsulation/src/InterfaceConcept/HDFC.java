package InterfaceConcept;

public class HDFC implements ReserveBank,CentralBank{ 

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.savings();
		h.creditcard();
		h.insurance();
		h.locker();
		System.out.println(h.age);
		System.out.println(h.name);
		

	}

	
	public void savings() {
	System.out.println("HDFC savings 4.5");
		
	}

	



	public void creditcard() {
		System.out.println("credit card charges 100");
	}


	@Override
	public void insurance() {
		System.out.println("insurance of hdfc charges 100");
		
	}
	
	public void locker() {
		System.out.println("locker facility of hdfc is 50");
	}


	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void current() {
		// TODO Auto-generated method stub
		
	}

}
