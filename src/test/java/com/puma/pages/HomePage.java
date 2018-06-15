package com.puma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.puma.generic.BasePage;

public class HomePage extends BasePage 
{
	@FindBy(xpath="//a[@data-subnav='men-subnav']")
	WebElement MenTab;
	
	@FindBy(xpath="(//a[.='Running'])[1]")
	WebElement Running;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHomeTitle()
	{
		verifyTitle("Buy Sports T-Shirts, Tracks");
	}
	
	public void moveToMenTab()
	{
		Actions act=new Actions(driver);
		act.moveToElement(MenTab);
	}
	
	public void clickOnRunningMenu()
	{
		Running.click();
	}
	

}
