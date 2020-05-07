package qualityStreamInfoturnos;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

private WebDriver driver;

@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://172.16.11.38:9090/infoturnos/esquemaPrincipal.jsf");
}


@Test

public void testGooglepage() {
	
	WebElement searchbox = driver.findElement(By.name("q"));
	
	searchbox.clear();
	searchbox.sendKeys("automatizacion de pruebas de software");
	searchbox.submit();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	assertEquals("automatizacion de pruebas de software-Google search", driver.getTitle());
}
	@After
	
	public void tearDown() { 
	
		driver.quit();
}
}
	
