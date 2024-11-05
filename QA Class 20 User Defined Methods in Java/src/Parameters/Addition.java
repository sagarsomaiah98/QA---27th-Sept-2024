package Parameters;

public class Addition {
	
	public void add(int a, int b)
	{
		// code for addition
				
				int c=a+b;
				System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);

	}
	
	public void sub(int m, int n)
	{
		// code for addition
				
				int k=m-n;
				System.out.println("Subtraction of two numbers "+m+" and "+n+" is "+k);

	}
	
	

	public static void main(String[] args) {
		
		Addition a =new Addition();
		a.add(10,20);
		a.add(30,40);
		a.add(50,90);
		a.sub(80,30);
		a.sub(10,40);
		a.sub(60,20);

	}

}
