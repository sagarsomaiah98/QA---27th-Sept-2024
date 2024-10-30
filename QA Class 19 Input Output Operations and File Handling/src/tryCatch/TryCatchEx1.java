package tryCatch;

public class TryCatchEx1 {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		try
		{
		a[1]=23;
		a[10]=10;
		a[2]=12;
        a[2] = 9; 
		}
		catch(Exception e){
			
			System.out.println("Cannot store values");
			
		}
		
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

	}

}
