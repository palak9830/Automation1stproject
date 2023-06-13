package com.website.OrangeHRM;

import org.openqa.selenium.By;

import com.website.orangeHRMBase.OrangeHRMBase;

public class LeaveListUI extends OrangeHRMBase{
	public boolean LeaveListUI() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]")).click();
		driver.findElement(By.xpath("//label[text()='From Date']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='To Date']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='Show Leave with Status']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='Leave Type']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='Employee Name']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='Sub Unit']")).isDisplayed();
		return driver.findElement(By.xpath("//button[text()=' Search ']")).isDisplayed();
	}

}
