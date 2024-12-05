import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationEx {
	
	
	@Test
	public void method1() {
		
		System.out.println("calling method 1");
	}
	@Test
public void method2() {
		
		System.out.println("calling method 2");
	}
	@BeforeMethod
	public void before() {
		System.out.println("***Calling before method*********************");
	}
	@AfterMethod
	public void after() {
		System.out.println("***Calling after method*********************");
	}
	
	
	@Test
public void method3() {
	
	System.out.println("calling method 3");
}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
}
