package com.puma.generic;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage
{
	public  WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String etitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		try
		{
			wait.until(ExpectedConditions.titleContains(etitle));	
			Reporter.log("title matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("title not matching",true);
			Assert.fail();
		}
		
	}
	
}
