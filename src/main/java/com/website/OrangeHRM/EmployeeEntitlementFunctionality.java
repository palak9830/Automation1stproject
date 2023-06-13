package com.website.OrangeHRM;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.website.orangeHRMBase.OrangeHRMBase;

public class EmployeeEntitlementFunctionality extends OrangeHRMBase {

	public void LeaveEntitlement() {
		try {
			driver.findElement(By.xpath("//span[text()='Entitlements ']")).click();
			driver.findElement(By.xpath("//a[text()='Employee Entitlements']")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]")).sendKeys(prop.getProperty("Employee Name"));
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]")).click();
			List <WebElement> List= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[2]/i"));
			Iterator<WebElement> iterator= List.iterator();
			while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("CAN - Vacation")) {
					webElement.click();
				}
			}
			
			driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
