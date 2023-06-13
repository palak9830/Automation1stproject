package com.website.OrangeHRM;

import org.openqa.selenium.By;

import com.website.orangeHRMBase.OrangeHRMBase;

public class HolidaysFunctionality extends OrangeHRMBase{

	public void Holidays() {
		driver.findElement(By.xpath("//span[text()='Configure '] ")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/ul/li[4]")).click();
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
	}
}
