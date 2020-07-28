package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignInPage {
	
	public WebDriver driver;
	
	public SignInPage(WebDriver driver) { //initialize instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this); //selenium interface 
	}
	
	
	//WebElement from = driver.findElement(By.id("nav-link-accountList"));
	//WebElement to = driver.findElement(By.xpath("//span[contains(text(),'Your Fanshop')]"));

	@FindBy(id="nav-link-accountList")
	public WebElement from; 
	
	@FindBy(xpath="//span[contains(text(), 'Sign in')]")
	public WebElement to;//Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getSigInPage() {
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(from).moveToElement(to).click().build().perform();
	}
	
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement username; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getUserName(String usrname) {
		//username.sendKeys("soyeb88@gmail.com");
		username.sendKeys(usrname);		
	}
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continu; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getContinue() {
		continu.click();
		
	}
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getPassword(String pass) {
		password.sendKeys(pass);
		//password.sendKeys("Dhaka_86");
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement signin; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getSignIn() {
		signin.click();
	}
	
	//div[@id='auth-error-message-box']//div[@class='a-box-inner a-alert-container']
	
	@FindBy(xpath="//div[@id='auth-error-message-box']")
	public WebElement usererrmsg; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getUserErrMsg() {
		String message = usererrmsg.getText();		
		System.out.println(message);
	}
	
	@FindBy(xpath="//div[@id='auth-error-message-box']")
	public WebElement passerrmsg; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getPassErrMsg() {
		String message = passerrmsg.getText();		
		System.out.println(message);
	}
	
	//a-box-inner a-alert-container
	
	
	/*
	@FindBy(xpath="//Select[@id='searchDropdownBox']")
	public WebElement all; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void gettAll() {
		//Select sel = new Select(all);
		//sel.selectByVisibleText("Alexa Skills");
		
		//all.click();
	}
	*/
}
