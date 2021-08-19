package com.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.day21.Excel;
import com.generic.BaseTest;
import com.page.LoginPage;

public class InvalidLogin extends BaseTest 
{

	@Test(priority = 2)
	public void testInvalidLogin()
	{
		String un=Excel.getData(XL_PATH,"InvalidLogin",1, 0);
		String pw=Excel.getData(XL_PATH,"InvalidLogin",1, 1);
		String msg=Excel.getData(XL_PATH,"InvalidLogin",1, 2);
		
//		1. enter invalid un
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(un);
		
//		2. enter invalid pw
		loginPage.setPassword(pw);
		
//		3. click login button
		loginPage.clickLogin();
		
//		4. verify err msg is displayed
		boolean result = loginPage.verifyErrMsgDisplayed(wait);
		Assert.assertEquals(result,true,msg);
	}
}