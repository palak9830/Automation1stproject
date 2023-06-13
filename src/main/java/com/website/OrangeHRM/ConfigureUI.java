package com.website.OrangeHRM;

import org.openqa.selenium.By;

import com.website.orangeHRMBase.OrangeHRMBase;

public class ConfigureUI extends OrangeHRMBase{

	public boolean ConfigureUI() {
		driver.findElement(By.xpath("//span[text()='Configure '] ")).click();
		driver.findElement(By.xpath("//a[text()='Leave Period']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Leave Types']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Work Week']")).isDisplayed();
		return driver.findElement(By.xpath("//a[text()='Holidays']")).isDisplayed();
	}
}
