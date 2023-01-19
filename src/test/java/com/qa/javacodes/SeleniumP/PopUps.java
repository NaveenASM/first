package com.qa.javacodes.SeleniumP;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUps {

	public static void main(String[] args) throws InterruptedException {
		// 1.Alerts
		// 2.FileUpload popups
		// 3.Browser popups
		
		System.setProperty("webdriver.chrome.driver", "C:\\sdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//-----Alerts:
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		driver.switchTo().alert().accept();
	     
	    //------Explicit wait
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());   //opening after 5 seconds
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		driver.switchTo().alert().accept();
				
//-----File uploading popup:
		driver.get("https://demoqa.com/upload-download");
		
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\madhun\\Downloads\\Image2.png");
		System.out.println("upload done");


//------Window Handling:
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		
		Set<String> win = driver.getWindowHandles();  //important -->getting window ids
		
		Iterator<String> it = win.iterator();	
		String parentW = it.next();
		String childW = it.next();
		
		driver.switchTo().window(childW);   //Switch to child window
		System.out.println("Child is : " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentW);  //switch back to parent window
		System.out.println("parent is : " + driver.getTitle());
		driver.close();
		
		System.out.println("end game");
		
		
		
		

	}

}
