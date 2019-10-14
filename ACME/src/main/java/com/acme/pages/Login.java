package com.acme.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void loginAndSearch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		
		Actions builder = new Actions(driver);
		WebElement vendors = driver.findElementByXPath("//div[@class='dropdown'][5]");
		//Thread.sleep(1000);
		builder.moveToElement(vendors).click().perform();
		builder.moveToElement(driver.findElementByLinkText("Search for Vendor")).click().perform();
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		WebElement table = driver.findElementByClassName("table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement firstRow = rows.get(1);
		List<WebElement> columns = firstRow.findElements(By.tagName("td"));
		String text = columns.get(0).getText();
		System.out.println(text);
		
		driver.findElementByLinkText("Log Out").click();
		
	}

}
