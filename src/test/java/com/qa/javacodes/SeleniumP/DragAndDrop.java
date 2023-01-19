package com.qa.javacodes.SeleniumP;

import java.io.*;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(0);  //switching to frame if it has only one frame
		
		Actions action = new Actions(driver);
		//way-1
		action.clickAndHold(driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")))
			.moveToElement(driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']")))
			.release()
			.build()
			.perform();
		Thread.sleep(4000);
		
		//direct way
		action.dragAndDrop(driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")), driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']")))
			.build()
			.perform();
		System.out.println("end game");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	}

}
