package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SauceDemoPage {
	WebDriver driver ;
	
	/*public SauceDemoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	*/
	@Test
	public void Login()
	{
		driver= new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='SauceDemo.com']")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
}
