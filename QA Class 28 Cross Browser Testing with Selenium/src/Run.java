
public class Run {

	public static void main(String[] args) throws InterruptedException {
		LoginTest login= new LoginTest();
		login.login();
		
		CartTest cart= new CartTest();
		cart.cart();
		
		LogoutTest lo= new LogoutTest();
		lo.logout();
		
		

	}

}
