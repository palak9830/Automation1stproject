package com.website.OrangeHRM;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.website.orangeHRMBase.OrangeHRMBase;

public class LeaveListFunctionality extends OrangeHRMBase{

	public void LeaveListFunction() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5] ")).click();
		try {
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]")).click();
			List <WebElement> list = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i"));
			Iterator <WebElement> iterator= list.iterator();
		
			while(iterator.hasNext()) {
				WebElement webElement =(WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("US-Vacation")) {
					webElement.click();
					
				}
				
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div")).sendKeys(prop.getProperty("Employee Name"));
			
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]")).click();
		    List<WebElement> List= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]"));
		    Iterator<WebElement> Iterator=List.iterator();
		    while (Iterator.hasNext()) {
				WebElement webelement = (WebElement) Iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Engineering")) {
					webElement.click();
			}
		    
			}
			}
			driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println(e);
		}
		
	}
}
	

