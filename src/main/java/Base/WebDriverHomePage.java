package Base;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class WebDriverHomePage {
	private static final long Time = 0;
	WebDriver driver;
	//private String contactus="//a[@id='contact-us']";
	private String pageobjectmodellink="//a[@id='page-object-model']";
	private String loginportallinks="login-portal";
	private String buttonClickslinks="button-clicks";
	private String todolistlink="to-do-list";
	private String dropdownlink="dropdown-checkboxes-radiobuttons";
	private String ajaxloaderlink="ajax-loader";
	private String actionslink="actions";
	private String scrollingaroundlinks="scrolling-around";
	private String iframelink="iframe";
	private String hiddenelementlink="hidden-elements";
	private String datatablelink="data-table";
	private String autocompletetextfield="autocomplete-textfield";
	private String fileuploadlink="file-upload";
	private String datapickerlink="datepicker";
	
	@FindBy(xpath= "//a[@id='contact-us']")
	WebElement contactus;
	public WebDriverHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void ContactUs()
	{
		driver.findElement(By.xpath("//a[text()='Webdriveruniversity.com']")).click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    System.out.println(driver.getCurrentUrl());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"contact-us\"]")));
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]")).click();
		ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
		 
		driver.switchTo().window(tabs1.get(2));
		System.out.println(driver.getCurrentUrl());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/input[@name='first_name']")));
		driver.findElement(By.xpath("//form/input[@name='first_name']")).sendKeys("SSSS");
		driver.findElement(By.xpath("//form/input[@name='last_name']")).sendKeys("SSSS");
		driver.findElement(By.xpath("//form/input[@name='email']")).sendKeys("ssp@gmail.com");
		driver.findElement(By.xpath("//form/textarea[@name='message']")).sendKeys("ss");
		driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();
	}
	public void autocomplete()
	{
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Webdriveruniversity.com']")).click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/p[1]/a")));
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/p[1]/a")).click();
	}
	
	
	
	
	
	
	

	
	
	
	
	
}
