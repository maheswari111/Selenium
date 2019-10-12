package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class ViewLead extends SeleniumBase {
	
	
	public ViewLead verifyFirstName(String fstname) {
		
		verifyExactText(locateElement("viewLead_firstName_sp"), fstname);
		
		return this;
	}
	
	public Opentaps clickEdit() {
		click(locateElement("xpath", "//a[text()='Edit']"));
		
		return new Opentaps();
	}
	
	public ViewLead verifyCompName(String cname) {
		
		verifyExactText(locateElement("viewLead_companyName_sp"), cname);
		
		return this;
	}
	
	

}
