package com.proyect.pom;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	private static WebDriver driver;
	
	public Base(WebDriver driver) {
		
		this.driver = driver;	
	}
	
	public static WebDriver ChromeDriverconnection() {
	System.setProperty("WebDriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	return driver;	
	}
	public WebElement findElement(By locator) {
		return driver .findElement(locator);
			
	}

	public String getText(WebElement element) {
		return element.getText();
	
	}
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator){	
		driver.findElement(locator).sendKeys(inputText);
		
	}
	public void click (String string) {
		driver.findElements(string).click();
	}
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoAlertPresentException e) {
			//TODO: handle exception
		}
		return false;
		}
	

	public void visit(String url) {
		driver.get(url);
	}
}
	
	



