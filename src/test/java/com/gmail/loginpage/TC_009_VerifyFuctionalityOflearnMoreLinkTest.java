package com.gmail.loginpage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.LoginPage;

public class TC_009_VerifyFuctionalityOflearnMoreLinkTest extends BaseClass
{
	@Test
public void test9()
{
	LoginPage login = new LoginPage(driver);
	
	login.getLearnmore().click();
    Set<String> windows = driver.getWindowHandles();
    for(String str:windows)
    {
    	driver.switchTo().window(str);
    	if(str.contains("Browse Chrome"))
    	{
    		break;
    	}
    }
	WebElement message = driver.findElement(By.xpath("//h1[.=\"Browse Chrome as a guest\"]"));
	String error=message.getText();
	
	if(error.contains("Browse"))
	{
		System.out.println("Test case TC_009 is passed");
	}
	else
	{
		System.out.println("Test case TC_009 is failed");
	}
	
	driver.quit();
}
}
