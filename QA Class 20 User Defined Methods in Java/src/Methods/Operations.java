package Methods;

public class Operations {
	//Syntax for method
	//access modifier returnType methodName
	
	public void add()
	{
		// code for addition
				int a=10;
				int b=20;
				int c=a+b;
				System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);

	}
	
	public void sub()
	{
		//code for subtraction
		
				int m=30;
				int n=15;
				int j=m-n;
				System.out.println("Subtraction of two numbers "+m+" and "+n+" is "+j);
	}

	public static void main(String[] args) {
	
		//Syntax ClassName ObjectName= new ClassName()
		Operations op= new Operations();
		op.add();
op.add();
op.add();
op.add();
		

	}

}
