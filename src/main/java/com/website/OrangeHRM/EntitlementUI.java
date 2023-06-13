package com.website.OrangeHRM;

import org.openqa.selenium.By;

import com.website.orangeHRMBase.OrangeHRMBase;

public class EntitlementUI extends OrangeHRMBase{

	public boolean EntitlementUI() {
		driver.findElement(By.xpath("//span[text()='Entitlements ']")).click();
		driver.findElement(By.xpath("//a[text()='Add Entitlements']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Employee Entitlements']")).isDisplayed();
	    return driver.findElement(By.xpath("//a[text()='My Entitlements']")).isDisplayed();
		
	}
}
