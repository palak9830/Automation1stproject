package com.website.OrangeHRM;


import org.openqa.selenium.By;

import com.website.orangeHRMBase.OrangeHRMBase;

public class MyLeaveUI extends OrangeHRMBase {

	public boolean MyLeaveUI() {
		driver.findElement(By.xpath("//a[text()='My Leave']")).click();
		driver.findElement(By.xpath("//label[text()='From Date']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='To Date']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='Show Leave with Status']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='Leave Type']")).isDisplayed();
		return driver.findElement(By.xpath("//button[text()=' Search ']")).isDisplayed();
	}
}
