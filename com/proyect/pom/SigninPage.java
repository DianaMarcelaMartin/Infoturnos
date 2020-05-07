package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage extends Base {
	
	public static final WebDriver ChromeDriverconnection = null;
	By userlocator = By.name("j_username");
	By passlocator = By.name("j_password");
	By signInBtnlocator = By.name("BotonAutenticar");	
	By homepageLocator = By.id("TituloPanelControl");
	


	public SigninPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void Signin() {
		if (isDisplayed(userlocator))
		type("install",userlocator);
		type("install",passlocator);
		click("homepageLocator");
		
	}  
	

	{
		
		System.out.print("username textbox was not present");
	}
	
	public boolean ishomePageDisplay() {
		return isDisplayed(homepageLocator);
		
	}
}

