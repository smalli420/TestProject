package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sampleTest_Git {
  WebDriver driver;
  @Test
  public void guru99() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\Selenium_setup\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
  

	 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr232019"); 
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ubEvyvu"); 
	 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

  
	  JavascriptExecutor je=(JavascriptExecutor)driver;
	  je.executeScript("window.scrollBy(0,500)");
	  driver.findElement(By.linkText("Log out")).click();
	  String s=driver.switchTo().alert().getText();
	  System.out.println(s);
	  driver.switchTo().alert().accept();
	  driver.close();
  }
}

