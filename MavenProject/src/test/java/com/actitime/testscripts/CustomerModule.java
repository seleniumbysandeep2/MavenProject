package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
@Test
public void testCreateCustomer() throws InterruptedException {
	Reporter.log("create customer execution started",true);
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8080/login.do");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.quit();
	Reporter.log("create customer executed successfully",true);
}
}
