package PharmacyDashBoard;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import CommonMethods.BrowserMethods;

public class MyAccount  {
	BrowserMethods bm=new BrowserMethods();
	@Test
	public void accountEdit() throws InterruptedException
	{
		bm.launch();
		Thread.sleep(2500);
		bm.login("arrow@mailinator.com","Password@123");
		Thread.sleep(5000);
		bm.driver.findElement(By.xpath("//li[@class='ng-star-inserted ui-tabmenuitem ui-state-default ui-corner-top ui-state-active']//a[@class='ui-menuitem-link ui-corner-all ng-star-inserted']//span[@class='ui-menuitem-text']")).click();
		Thread.sleep(2500);
		bm.driver.findElement(By.xpath("//i[@class='fa fa-pencil icons-gray']")).click();
		Thread.sleep(1500);
		
		
	}

}
