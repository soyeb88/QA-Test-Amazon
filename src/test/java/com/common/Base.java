package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;	
	
	public void initializeChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Browser/chromedriver");
		
		//to launch browser
		driver = new ChromeDriver();
	}
	
	public void navigateToSite(String url) {
		

		
		//to get specific url
		driver.get(url);
		
		//maximize window
		driver.manage().window().maximize();
		
		//synchronization - sometimes our automation scripts faster than application, then we need to synchronization
		//implicitly wait - for whole application
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
		//abstract method unimplemented - no curley braces//temporary rename 
		//driver - instance variable or class level variable //instantiation	
	}
	
	public void closeBrowser(){
		driver.close();
	}
	
}
