package com.website.OrangeHRM;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.website.orangeHRMBase.OrangeHRMBase;

public class AssignLeaveFunctionality extends OrangeHRMBase {

	public void AssignLeave() {
		try {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys(prop.getProperty("Employee Name"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]")).click();
		List <WebElement> List= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[2]/i"));
		Iterator<WebElement> iterator= List.iterator();
		while (iterator.hasNext()) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
			if(webElement.getText().equals("CAN - Vacation")) {
				webElement.click();
			}
		}
		
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]")).click();
			List<WebElement> list= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/i"));
			Iterator<WebElement> Iterator=list.iterator();
			while (Iterator.hasNext()) {
				WebElement webElement = (WebElement) Iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("2023-07-01")) {
				webElement.click();
				}
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]")).click();
				List<WebElement> LIST= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div/i"));
				Iterator<WebElement> ITERATOR=list.iterator();
				while (Iterator.hasNext()) {
					WebElement WebElement = (WebElement) Iterator.next();
					System.out.println(WebElement.getText());
					if(WebElement.getText().equals("2023-07-30")) {
					WebElement.click();
					}
			}
			}
		} catch (Exception e) {
			// TODO: handle exception
			driver.findElement(By.xpath(" //button[text()=' Assign '] ")).click();	}
		
		}
	}

