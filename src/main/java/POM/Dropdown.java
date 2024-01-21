package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown {
	@FindBy(xpath= "//form/input[@id='text']")
	WebElement LoginId;
	@FindBy(xpath= "//form/input[@id='password']")
	WebElement Password;
	@FindBy(xpath= "//form/button[@id='login-button']")
	WebElement LoginBtn;
	private WebDriver driver;
	public Dropdown(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void method1()
	{
		System.out.println("Fellowcreators");
	}
}
