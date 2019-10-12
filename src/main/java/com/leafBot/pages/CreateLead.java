package com.leafBot.pages;


import com.leafBot.selenium.api.base.SeleniumBase;


public class CreateLead extends SeleniumBase {

	public CreateLead enterCompanyName(String cname) {
		append(locateElement("createLeadForm_companyName"), cname);
		return this;
	}
	
	public CreateLead enterFirstName(String fname) {
		append(locateElement("createLeadForm_firstName"), fname);
		return this;
	}
	
	public CreateLead enterLastName(String lname) {
		append(locateElement("createLeadForm_lastName"), lname);
		return this;
	}
	
	public ViewLead clickCreateLead() {
		click(locateElement("xpath", "//input[@value='Create Lead']"));
		return new ViewLead();
	}
}
