import org.testng.annotations.Test;

public class IgnoreTestEx {
	
	@Test
	public void test1() {
		
		System.out.println("test1");
	}
	@Test
public void test2() {
		
		System.out.println("test2");
	}

	@Test(enabled=false)
public void test3() {
	
	System.out.println("test3");
}
	@Test(enabled=false)
public void test4() {
	
	System.out.println("test4");
}
	@Test
public void test5() {
	
	System.out.println("test5");
}

}
