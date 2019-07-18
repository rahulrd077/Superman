package com.Qa.Xiphis.Lol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Hanau {
	
static WebDriver driver ;
	
	public static void main(String[] args) {
	
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("New Extent reports");

	
	ExtentReports extent = new ExtentReports();
	
	
	extent.attachReporter(htmlReporter);
	
	ExtentTest test = extent.createTest("Google Search Test One","This is a test to validate google versionality");

	
	
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver for version 74\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	test.log(Status.INFO, "This is the start of the test");
	
	driver.get("https://www.facebook.com");
	
	test.pass("The test passed");
	
	
	
	driver.quit();
	
	test.pass("closed the browser");
	
	test.info("End of test");
	
	extent.flush();
	
	}
}


