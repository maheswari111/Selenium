package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class MyHomePage extends SeleniumBase {
	
	public CreateLead clickCreateLead() {
		click(locateElement("link", "Create Lead"));
		
		return new CreateLead();
				
	}
	
	public MyLeads clickLeads() {
		click(locateElement("xpath", "//a[text()='Leads']"));
		
		return new MyLeads();
	}

}
