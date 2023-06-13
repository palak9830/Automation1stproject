package com.website.OrangeHRM;

import org.openqa.selenium.By;

import com.website.orangeHRMBase.OrangeHRMBase;

public class AssignLeaveUI extends OrangeHRMBase{

	public boolean AssignLeave() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]")).click();
		driver.findElement(By.xpath("//label[text()='Employee Name']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='Leave Type']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='From Date']")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='To Date']")).isDisplayed();
		return driver.findElement(By.xpath("//button[text()=' Assign ']")).isDisplayed();
	}
}
