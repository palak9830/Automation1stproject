package com.website.orangeHRMBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMBase {

	public static ChromeDriver driver;
	public static Properties prop;
	
	public void propertyfile() {
		String filepath= "./src/main/java/config/properties/PropertyFile";
		prop = new Properties();
		try {
			FileInputStream file=new FileInputStream(filepath);
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Browse() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		propertyfile();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='Leave']")).click();
	}
	
		public void Teardown() {
		driver.close();
		
	}

}

