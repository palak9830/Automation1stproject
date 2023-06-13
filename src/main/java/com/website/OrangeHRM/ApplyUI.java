package com.website.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;

import com.website.orangeHRMBase.OrangeHRMBase;

public class ApplyUI extends OrangeHRMBase {
	
	

	
	public boolean ApplyUIMessage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Apply']")).click();
	return driver.findElement(By.xpath("//p[text()='No Leave Types with Leave Balance']")).isDisplayed();

	}	

}
