package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sampleTest_Git {
 public static WebDriver driver;
  @Test
  public static void main(String[] args){
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\Selenium_setup\\geckodriver.exe");
		driver=new FirefoxDriver();
		//Launch the URL
		driver.get("http://www.demo.guru99.com/V4/");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
  
     //Login Section
	 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr232019"); 
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ubEvyvu"); 
	 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

      //Scroll the page
	  JavascriptExecutor je=(JavascriptExecutor)driver;
	  je.executeScript("window.scrollBy(0,500)");
	  //Click on Logout button
	  driver.findElement(By.linkText("Log out")).click();
	  String s=driver.switchTo().alert().getText();
	  System.out.println(s);
	  //Handle alert popup
	  driver.switchTo().alert().accept();
	  driver.close();
  }
}

