import org.testng.annotations.Test;

public class ExpectedExceptionEx {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test1() {
		
		int[] arr = new int[5];
		System.out.println(arr[6]);
		int a=10;
		int b=10/0;
		System.out.println(b);
		
	}

}
