package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ultimateqa {
	private WebDriver driver;
	
	public ultimateqa(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//a[text()='Big page with many elements']")
	private WebElement Bigpagelink;
	@FindBy(how = How.ID, using="user-message")
	private WebElement enterMessageField;
	
	public void movetolearning() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='dropdown-checkboxes-radiobuttons']")).click();
		Actions action = new Actions(driver);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
        
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Big page with many elements']"))));
        //Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Big page with many elements']")).click();
		System.out.println("Done");	}
	
	
}
