package Base;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import io.cucumber.java.After;
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
public class sample {
	
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
		//Maximizing the window
		driver.manage().window().maximize();
		
	}
	@After
	public void Close() {
		driver.close();
	}

}
