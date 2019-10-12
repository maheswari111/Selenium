package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class FindLeads extends ProjectSpecificMethods {

	public FindLeads enterFirstNameToEdit(String fstName) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fstName);
		return this;
	}
	
	public FindLeads clickFindLeadsToEdit() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}
	
	public ViewLead clickFirsLeadId() throws InterruptedException {
		Thread.sleep(2000);
		WebElement table = driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]");
		WebElement leadRow  = table.findElement(By.tagName("tr"));
		List<WebElement> leadColumns = leadRow.findElements(By.tagName("td"));
		leadColumns.get(0).findElement(By.tagName("a")).click();		
		
		return new ViewLead();
	}
	
}
