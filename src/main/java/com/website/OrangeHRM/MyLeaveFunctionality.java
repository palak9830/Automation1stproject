package com.website.OrangeHRM;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.website.orangeHRMBase.OrangeHRMBase;

public class MyLeaveFunctionality extends OrangeHRMBase{
	public void MyLeave() {
		driver.findElement(By.xpath("//a[text()='My Leave']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]")).click();
		List <WebElement> list = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div[1]/div/div[2]"));
		Iterator <WebElement> iterator= list.iterator();
	
		while(iterator.hasNext()) {
			WebElement webElement =(WebElement) iterator.next();
			System.out.println(webElement.getText());
			if(webElement.getText().equals("US-Vacation")) {
				webElement.click();
				
			}
			
		}
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		
	}
	

}
