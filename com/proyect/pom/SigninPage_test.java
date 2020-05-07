package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SigninPage_test {

	private WebDriver driver;
	SigninPage signinPage;
	
	@Before
	public void setUp() throws Exception {
		signinPage = new  SigninPage(driver);
		driver = SigninPage.ChromeDriverconnection();
		
		
	}
	

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signinPage.Signin();
		Thread.sleep(2000);
		assertTrue(signinPage.ishomePageDisplay());
	}

}
