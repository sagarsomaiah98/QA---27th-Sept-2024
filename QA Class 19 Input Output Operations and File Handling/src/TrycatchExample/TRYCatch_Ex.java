package TrycatchExample;

public class TRYCatch_Ex {

	public static void main(String[] args) {
		try
		{
		 int a = 30;
         int b = 0;
         int c = a/b;  
         System.out.println ("Result = " + c);
		}
		catch(Exception e){
			
			System.out.println("Exception occoured, cannot divide a by b");
			e.printStackTrace();
		}
		
         System.out.println("eND OF THE PROGRAM");
         int k=40;
         int m=30;
         int u=k+m;   
         System.out.println("addition of "+k+" and "+m +" is "+u);

	  

	}

}
