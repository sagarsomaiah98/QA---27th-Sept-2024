package AbstractionConcept;

public class Citi extends Bank{

	@Override
	public void savings() {
		System.out.println("calling savings");
		
	}
	public static void main(String[] args) {
		Citi c = new Citi();
		c.savings();
		c.creditcard();
		c.insurance();
	}
	

}
