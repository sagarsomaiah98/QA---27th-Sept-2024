import org.testng.annotations.Test;

public class PriorEx {
	
	@Test(priority=0)
	public void login() {
		System.out.println("Login Test");
	}
	@Test(priority=-2)
	public void order() {
		System.out.println("Order Test");
	}
	@Test(priority=2)
	public void cart() {
		System.out.println("cart Test");
	}
	@Test(priority=-1)
	public void filter() {
		System.out.println("filter test");
	}

}
