package com.puma.generic;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;


	public class BaseTest implements Autoconst 
	{
		public WebDriver driver;
		
		@BeforeMethod
		public void preCondition()
		{
			System.setProperty(key,value);
			driver=new ChromeDriver();
			driver.get("https://in.puma.com/");
		}
		
		@AfterMethod
		public void postCondition()
		{
			driver.close();
		}
		
		
}
