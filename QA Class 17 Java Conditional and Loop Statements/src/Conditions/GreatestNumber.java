package Conditions;

public class GreatestNumber {

	public static void main(String[] args) {
		
		int a=20;
		int b=50;
		int c=15;
		
		if(a>b)
		{
			if(a>c)
				System.out.println(a+ " is greater");
			else
				System.out.println(c+" is greater");
		}
		else
		{
			if(b>c)
				System.out.println(b+" is greater");
			else
				System.out.println(c+" is greater");
			
			
		}
	}

}
