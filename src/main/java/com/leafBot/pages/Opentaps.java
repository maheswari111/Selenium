package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class Opentaps extends ProjectSpecificMethods {
	
	public Opentaps enterCompNameToUpdate(String cname) {
		
		clearAndType(locateElement("updateLeadForm_companyName"), cname);
		
		return this;
	}
	
	public ViewLead clickUpdate() {
		
		click(locateElement("xpath", "//input[@value='Update']"));

		return new ViewLead();
	}

}
