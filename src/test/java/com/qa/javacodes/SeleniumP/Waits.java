package com.qa.javacodes.SeleniumP;

import java.io.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;



public class Waits {

	public static void main(String[] args) throws IOException {
		
		//implicit wait
		
		System.setProperty("webdriver.chrome.driver", "C:\\sdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
 
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='ui-widget-header ui-droppable']"))));
		
		
		
		//TakescreenShot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // -->important

		File dest = new File("C:\\Users\\madhun\\OneDrive - Micro Focus\\Preparation-codes\\selenium\\SeleniumCode\\Screenshots\\naveen.png");


		Files.copy(src, dest);
		System.out.println("copied to :" + dest);

		
	
		//fluent wait
		
		

		
	}

}
