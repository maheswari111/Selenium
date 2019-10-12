package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;


public class HomePage extends SeleniumBase{
	
	public MyHomePage clickCRMSFA() {
		click(locateElement("link", "CRM/SFA"));	
		return new MyHomePage();
	}
	
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}

}
