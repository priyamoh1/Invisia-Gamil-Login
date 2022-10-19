package com.gmail.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.genericUtilities.WebDriverUtility;
import com.crm.objectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_014_VerifyLoginWithDifferentBrowserTest extends BaseClass
{
	@Test
public void test14() throws InterruptedException
{
	WebDriverUtility web = new WebDriverUtility();
	LoginPage login = new LoginPage(driver);
	login.getUsernametxtEdt().sendKeys("priyatest50");
	login.getNext().click();
	Thread.sleep(8000);
	login.getPasswordtxtEdt().sendKeys("Invisia@1");
	login.getNext().click();
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://gmail.com");
	Thread.sleep(8000);
	login.getUsernametxtEdt().sendKeys("priyatest50");
	login.getNext().click();
	Thread.sleep(8000);
	login.getPasswordtxtEdt().sendKeys("Invisia@1");
	login.getNext().click();
}
}
