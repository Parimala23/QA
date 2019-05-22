package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import Delivmeds.Pharmacy_Webapp.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethods extends Utilities{
	
	
	//Application launch
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	//Gmail page
	public void launchMail() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(gmail);
		driver.manage().window().maximize();
		
	}
	//Application Logout
	public void logOut() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='pointer']")).click();
	}
	//Application login
	public void login(String Username, String Password) throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/app-root/div/app-login/div/form/div[2]/p/button")).click();
	}
	//Gmail Login
	public void mailCredentials(String logname , String logpass) throws InterruptedException
	{
		driver.findElement(By.id("identifierId")).sendKeys(logname);
		Thread.sleep(1500);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(logpass);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://mail.google.com']")).click();
	}
	//hellosign
	public void helloSign() throws InterruptedException
	{
		driver.findElement(By.id("")).click(); 
		Thread.sleep(1500);
		
		
	}
	
}
