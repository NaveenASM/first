package com.qa.javacodes.Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://Users//madhun//OneDrive - Micro Focus//Preparation-codes//geckodriver-v0.31.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("www.google.com");
		
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		//sendValues(driver, username, 2, "madhunaveenhp");
	}
	
		

	private static void sendValues(WebDriver driver, WebElement element, Duration timeout, String value) {
		
		//new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

}
