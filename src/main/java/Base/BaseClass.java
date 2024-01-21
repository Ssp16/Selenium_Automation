package Base;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import POM.SauceDemoPage;
import POM.ultimateqa;
public class BaseClass {
	String url="https://ultimateqa.com/dummy-automation-websites/";
	WebDriver driver;
	ExtentSparkReporter htmlReporter;
	 
    ExtentReports extent;
    //helps to generate the logs in the test report.
    ExtentTest test;
    static ExtentReports report;
	@BeforeClass
	public void Beforeclass()
	{	//Opening Edge driver
		driver= new EdgeDriver();
		//Providing the URL
		driver.get(url);
		//Maximizing the windo
		driver.manage().window().maximize();
		extent =  new  ExtentReports();
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +"/test-output/testReport.html");

        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


        //configuration items to change the look and feel
        //add content, manage tests etc
        
        htmlReporter.config().setDocumentTitle("Simple Automation Report");
        htmlReporter.config().setReportName("Test Report");
        
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}
	@Test(enabled=false)
	public void Test() throws InterruptedException
	{
		test = extent.createTest("Test Case 1", "The test case 1 has passed");
		//Getting URL links for automation project
		List<WebElement> urllinks = driver.findElements(By.xpath("//article[@id=\"post-9600\"]//ul/li"));
		/*System.out.println(urllinks.size());
		for (WebElement e : urllinks)
		{
			System.out.println(e.getText());
		}*/
		//SauceDemoPage Sauce = new SauceDemoPage();
		//Sauce.Login();
		WebDriverHomePage web = new WebDriverHomePage(driver);
		//web.autocomplete();
		web.ContactUs();
	}
	@Test
	public void UltimateqaTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Webdriveruniversity.com']")).click();
		WebDriverHomePage web = new WebDriverHomePage(driver);
		//web.autocomplete();
		web.dropdownlink();
		
	}
	 @AfterMethod(enabled=false)
	    public void getResult(ITestResult result) {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL,result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, result.getTestName());
	        }
	        else {
	            test.log(Status.SKIP, result.getTestName());
	        }
	    }
	@AfterClass
	public void AfterClass()
	{
		
	}
	

}
