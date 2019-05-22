package PharmacyDashBoard;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import CommonMethods.BrowserMethods;

public class PSignup extends BrowserMethods {                                                 //********Registration and mail approvals********//

	//Registration Page
	@Test(priority=1,enabled=false)
	public void pharmacistRegistration() throws InterruptedException, AWTException {
		// method for intiate the driver and launch application
		launch();
		Thread.sleep(1000);
		driver.findElement(By.xpath(signupLink)).click();
		driver.findElement(By.id("pharmacyName")).sendKeys(pharmacyname2);
		Thread.sleep(1000);
		driver.findElement(By.id("dea")).sendKeys(DEANumber2);
		Thread.sleep(1000);
		driver.findElement(By.id("phoneNo")).sendKeys(phoneNo2);
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(emailid2);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(pswd2);
		Thread.sleep(1000);
		driver.findElement(By.id("address1")).sendKeys(address2);
		Thread.sleep(2000);
		Robot move = new Robot();
		move.keyPress(KeyEvent.VK_PAGE_DOWN);
		move.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.id("city")).sendKeys(City2);
		Thread.sleep(1000);
		driver.findElement(By.id("state")).sendKeys(State2);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='zipcode']/span/input")).sendKeys(Zip2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/app-root/div/app-register/div/div/form/p[2]/button")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-clickable'])[3]")).click();
		Thread.sleep(1800);

		/*String regmsg = driver.findElement(By.xpath("html/body/app-root/p-growl/div/div/div/div[2]/p")).getText();
		System.out.println(regmsg);
		Thread.sleep(1000);*/
		driver.close();

	}
	
	//Self mail verification
	@Test(priority=2,enabled=false)
	
	public void mailVerification() throws InterruptedException
	{
		launchMail();
		Thread.sleep(1000);
		mailCredentials("delivmeds123@gmail.com","Delivmeds@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id=':39']/tbody/tr[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id=':83']/div/table/tbody/tr[1]/td/table/tbody/tr[3]/td/div/p[3]/span/span/span/span/span/a")).click();
		Thread.sleep(1800);
		driver.close();
				
		
	}
	@Test(priority=3, enabled=false  )
	//Delivmeds approval(Activate Pharmacy)
	public void delivApproval() throws InterruptedException 
	{
		launchMail();
		Thread.sleep(1500);
		mailCredentials("approval.qa@gmail.com","Approval@123");
		Thread.sleep(1500);
		String Number=DEANumber;
		List <WebElement> element = driver.findElements(By.xpath("//div[@id=':4']"));
		System.out.println("Hello");
		/*for(WebElement dea : element)
		{
			//System.out.println(dea.getText().length());
			if(dea.getText().equalsIgnoreCase(Number)==true)
			{
				dea.click();
			}
			else
			{
				//System.out.println("hello");
				dea.click();
			}
		}*/
		
	}
	@Test
	public void baaForm() throws InterruptedException
	{
		launch();
		Thread.sleep(1000);
		login(emailid2, pswd2);
		System.out.println("Helloo");
		Thread.sleep(70000);
		WebDriverWait ww=new WebDriverWait(driver, 10);
		Thread.sleep(8000);
		driver.switchTo().frame("hsEmbeddedFrame");
		driver.findElement(By.xpath(".//*[@id='signer-mobile-application']/div/div/div/div[3]/div[2]/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='component_33878432_2']/div[2]/div/textarea")).sendKeys("walgreens");
		Thread.sleep(1500);
		driver.findElement(By.xpath(".//*[@id='component_463204097_3']/div[2]/div/textarea")).sendKeys("walgreens36 pharmacy");
	}
	
}
	

