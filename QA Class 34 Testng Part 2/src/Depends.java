import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Depends {
	
	
	@Test
	public void login() {
		
		System.out.println("login test");
		assertEquals(true,false);
	}
	
	
	@Test(dependsOnMethods="login")
	public void navigationMenu() {
		
		System.out.println("Navigation menu");
	}
	
	@Test(dependsOnMethods="login")
	public void filter() {
		
		System.out.println("filter menu");
	}
	
	@Test(dependsOnMethods="login")
	public void order() {
		
		System.out.println("order");
	}



}
