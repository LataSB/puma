package com.puma.tests;

import org.testng.annotations.Test;

import com.puma.generic.BaseTest;
import com.puma.pages.HomePage;

public class SelectingShoesTest extends BaseTest
{
	@Test
	public void shoesSelectTest()
	{
	HomePage hp= new HomePage(driver);
	hp.verifyHomeTitle();
	hp.moveToMenTab();
	hp.clickOnRunningMenu();
	}
}
