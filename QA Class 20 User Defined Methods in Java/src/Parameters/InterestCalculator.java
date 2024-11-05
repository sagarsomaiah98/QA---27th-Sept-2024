package Parameters;

public class InterestCalculator {
	
	public void interest(double p,double r, int t) {
		
		double interest=(p*r*t)/100;
		System.out.println(interest);
	}

	public static void main(String[] args) {
		InterestCalculator inter= new InterestCalculator();
		inter.interest(200000, 8, 12);

	}

}
