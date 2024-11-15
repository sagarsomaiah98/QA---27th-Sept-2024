package SauceTests;

public class RunTests {

	public static void main(String[] args) throws InterruptedException {
		LoginTest login= new LoginTest();
		login.login();
		AddToCart cart= new AddToCart();
		cart.cart();
		LogOutTest lo= new LogOutTest();
		lo.Logout();

	}

}
