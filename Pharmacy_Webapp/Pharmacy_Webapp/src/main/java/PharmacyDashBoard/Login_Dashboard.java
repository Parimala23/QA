package PharmacyDashBoard;

import org.testng.annotations.Test;
import CommonMethods.BrowserMethods;

public class Login_Dashboard extends BrowserMethods{
	
	@Test()
	public void loginUser() throws InterruptedException
	{
		launch();
		Thread.sleep(2000);
		login("metropharm@mailinator.com", "Password@123");
		Thread.sleep(2000);
		logOut();
	}
	

}
