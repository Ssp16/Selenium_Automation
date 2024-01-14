package Base;
import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Api.CreateJiraReq_seleniumAutomation;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.path.json.JsonPath;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
public class ActionClass {
	String url="http://webdriveruniversity.com/Page-Object-Model/index.html";
	WebDriver driver;
	By pathfinder = By.xpath("//p[text()='GREAT SERVICE!']");
	@Test(enabled=false)
	public void Test()
	{
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]"));
		act.click(element);
		
		WebElement hoverable = driver.findElement(By.xpath("//a[text()='Sell']"));
        new Actions(driver)
                .moveToElement(hoverable)
                .perform();
        
       
	}
	@BeforeClass
	public void Beforeclass()
	{
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
	}
	@Test
	public void Test1() throws IOException
	{
		try
		{
			String expectedText="Great service";
			String actualText=driver.findElement(pathfinder).getText();
			Assert.assertEquals("GREAT SERVICE",actualText);
			
		}
		catch(Throwable t)
		{
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("X:\\Selenium_Automation\\src\\main\\java\\Test1_Login.png");
			FileUtils.copyFile(SrcFile,DestFile);
			CreateJiraReq_seleniumAutomation j = new CreateJiraReq_seleniumAutomation();
			String i =j.CreateJiraRequest();
			JsonPath js1 =new JsonPath(i);
			String t1=js1.getString("id");
			j.upload_attachment(t1);
			
			
			
			
			
		/*	//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination
			File DestFile=new File(fileWithPath);
			//Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);*/
		}
		
	}
	@AfterClass
	public void Afterclass()
	{
		
	}
}
