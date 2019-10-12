package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class MyLeads extends SeleniumBase {

	public FindLeads clickFindLeads() {
		click(locateElement("xpath", "//a[text()='Find Leads']"));
		
		return new FindLeads();
	}
	
}
