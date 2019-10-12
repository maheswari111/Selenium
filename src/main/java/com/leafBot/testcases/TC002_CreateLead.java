package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class TC002_CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName="TC002";
		testcaseName="CreateLead";
		testcaseDec = "Create new lead to Leaftaps";
		author="Maha";
		category="smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void runTC002(String uname, String pwd, String cname, String fname, String lname) {
		
		new LoginPage()
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLead()
		.verifyFirstName(fname);
		
	}
	
}
