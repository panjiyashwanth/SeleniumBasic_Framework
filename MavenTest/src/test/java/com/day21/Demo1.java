package com.day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

//	public static void main(String[] args) {
//		// maven is called dependency tool 
//		// jar files will be downloaded in .m2/repository
//		//WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		//WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
//		driver.close();
//		
//		
////		 System.setProperty("wdm.cachePath","./drivers/");
////	        WebDriverManager.chromedriver().setup();
////	        WebDriver driver = new ChromeDriver();
////	        driver.get("http://www.google.com");
//		
//	}
	
	
	// we use surefire plugin to run testng.xml from pom.xml
	//Maven executing is controlled by pom.xml
	
	@Test
	public void testBrowser() {
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
	
	
}
