import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Infoturnos_Login_AutomatedTest {

	private WebDriver driver;

	By userlocator = By.name("j_username");
	By passlocator = By.name("j_password");
	By signInBtnlocator = By.name("BotonAutenticar");	
	By homepageLocator = By.id("TituloPanelControl");



	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://172.16.11.38:9090/infoturnos");

		if(driver.findElement(userlocator) .isDisplayed()) {
			driver.findElement(userlocator) .sendKeys("diana");
			driver.findElement(passlocator) .sendKeys("123456");
			driver.findElement(signInBtnlocator).click();
			try {

				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[contains(text(),'Ya se ha iniciado sesión')]")).getText();
				System.out.println("encontre el mensaje");
				Thread.sleep(3000);
				//WebElement elemento = (new WebDriverWait(driver, 30))

				///until(ExpectedConditions.elementToBeClickable(By.id("BotonTerminarSesion")));
				driver.findElement(By.id("BotonConfirmarInicioSesion")).click();
				Thread.sleep(3000);
				//WebElement elemento1 = (new WebDriverWait(driver, 30))
				//.until(ExpectedConditions.elementToBeClickable(By.name("j_username")));
				//driver.findElement(userlocator) .sendKeys("diana");
				//driver.findElement(passlocator) .sendKeys("123456");
				//driver.findElement(signInBtnlocator).click();
				//WebElement elemento = (new WebDriverWait(driver, 30))
				//.until(ExpectedConditions.elementToBeClickable(By.id("ListaSucursales")));
				//Select sel = new Select(elemento);
				//sel.selectByVisibleText("ARMENIA (ARMENIA)");

				//WebElement firstEle = sel.getFirstSelectedOption();
				//System.out.print("first element = "+firstEle.getText());

				//WebElement elemento2 = (new WebDriverWait(driver, 30))
				//	.until(ExpectedConditions.elementToBeClickable(By.id("ListaVentanillas")));

				//Select listaventanillas = new Select (elemento2);
				//listaventanillas.selectByVisibleText("Ventanilla 1");

				//WebElement elemento3 = (new WebDriverWait(driver, 30))
				//		.until(ExpectedConditions.elementToBeClickable(By.id("BotonAceptar")));

				//elemento3.click();

			}
			catch(Exception ex){

			}
			//if(driver.findElement(By.xpath("//span[contains(text(),'Ya se ha iniciado sesión')]")).isEnabled())
			//if(driver.findElements(By.xpath("//span[contains(text(),'Ya se ha iniciado sesión')]")).size()>0)
			//{

			//}

			WebElement elemento = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.elementToBeClickable(By.id("ListaSucursales")));
			Select sel = new Select(elemento);
			sel.selectByVisibleText("ARMENIA (ARMENIA)");

			WebElement firstEle = sel.getFirstSelectedOption();
			System.out.print("first element = "+firstEle.getText());

			WebElement elemento2 = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.elementToBeClickable(By.id("ListaVentanillas")));

			Select listaventanillas = new Select (elemento2);
			listaventanillas.selectByVisibleText("Ventanilla 1");

			WebElement elemento3 = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.elementToBeClickable(By.id("BotonAceptar")));

			elemento3.click();
		}
	}


	//@Test
	//public void tearDown13() throws Exception {
	//WebElement elemento = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.presenceOfElementLocated(By.id("TituloPanelControl")));

	//assertTrue(driver.findElement(By.id("TituloPanelControl")) .isDisplayed());


	//		WebElement elemento2 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAdministracion")));
	//elemento2.click();


	//WebElement elemento3 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorGrupoBoletos:anchor")));
	//elemento3.click();

	//WebElement elemento4 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadConfiguracionAtriles:anchor")));
	//elemento4.click();

	//	WebElement elemento5 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("j_id240_lbl")));
	//	elemento5.click();

	//WebElement elemento6 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("modificarConfAtril:Regional")));
	//Select modificarConfAtrilRegional = new Select(elemento6);
	//modificarConfAtrilRegional.selectByVisibleText("ANTIOQUIA");


	//WebElement elemento8 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("modificarConfAtril:Departamento")));
	//Select sel1 = new Select(elemento8);
	//sel1.selectByVisibleText("ANTIOQUIA");

	//WebElement elemento9 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("modificarConfAtril:Ciudad")));
	//	Select sel3 = new Select(elemento9);
	//sel3.selectByVisibleText("APARTADO");

	//WebElement elemento10 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("modificarConfAtril:Sucursal")));
	//Select sel4 = new Select(elemento10);
	//sel4.selectByVisibleText("APARTADO");

	//WebElement elemento11 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("modificarConfAtril:listaConfiguraciones")));
	//Select modificarConfAtrillistaConfiguraciones = new Select(elemento11);
	//modificarConfAtrillistaConfiguraciones.selectByVisibleText("atril apartado");

	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,700)", "");

	//WebElement elemento12 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.presenceOfElementLocated(By.id("modificarConfAtril:orientador")));

	//assertTrue(driver.findElement(By.id("modificarConfAtril:orientador")) .isDisplayed());


	//		WebElement elemento13 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("modificarConfAtril:j_id336")));
	//elemento13.click();

	//	((JavascriptExecutor)driver).executeScript("window.open()");
	//ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	//driver.switchTo().window(tabs2.get(1));
	//	driver.switchTo().window(tabs2.get(0));
	//driver.get("http://172.16.11.38:9090/infoturnos/atril");

	//WebElement elemento14 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter2")));
	//elemento14.click();

	//WebElement elemento15 = (new WebDriverWait(driver, 31))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter3")));
	//elemento15.click();

	//	WebElement elemento16 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter1")));
	//	elemento16.click();

	//WebElement elemento17 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter4")));
	//elemento17.click();

	//WebElement elemento18 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter7")));
	//	elemento18.click();

	//WebElement elemento19 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter2")));
	//	elemento19.click();

	//WebElement elemento20 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter9")));
	//elemento20.click();

	//	WebElement elemento21 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("ImagenBotonIngresar")));
	//elemento21.click();

	//	WebElement elemento22 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("BotonAceptarI")));
	//elemento22.click();

	//WebElement elemento23 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter2")));
	//elemento23.click();

	//WebElement elemento24 = (new WebDriverWait(driver, 31))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter3")));
	//elemento24.click();

	//	WebElement elemento25 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter1")));
	//	elemento25.click();

	//WebElement elemento26 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter4")));
	//elemento26.click();

	//WebElement elemento27 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter7")));
	//	elemento27.click();

	//WebElement elemento28 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter7")));
	//elemento28.click();

	//WebElement elemento29 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenCaracter7")));
	//elemento29.click();

	//WebElement elemento30 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("ImagenBotonIngresar")));
	//elemento30.click();

	//WebElement elemento31 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("Iterador:5:ImagenBotonCrearTurno")));
	//elemento31.click();

	//WebElement elemento32 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("cancel-button")));
	//elemento32.click();

	//String oldTab = null;
	//driver.switchTo().window(oldTab);
	// assertStartAdvertising();
	//}

	//Cliente anonimo Atencion al publico

	@Test
	public void tearDown11() throws Exception {

		WebElement elemento1 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("TituloPanelControl")));

		assertTrue(driver.findElement(By.id("TituloPanelControl")) .isDisplayed());


		WebElement elemento2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAtencion")));
		elemento2.click();

		WebElement elemento3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadAtencionTurnosNormales:anchor")));

		elemento3.click();

		WebElement elemento4 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(By.id("botonLlamarTurno")));

		elemento4.click();

		WebElement elemento5 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(By.id("TabActualizarCliente_lbl")));

		elemento5.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

		WebElement elemento6 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("CampoTipoDocumento")));

		driver.findElement(By.id("CampoIdentificacionFiltro")).sendKeys("0709878");

		WebElement elemento7 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("CampoTipoDocumento")));

		Select CampoTipoDocumento = new Select (elemento7);

		CampoTipoDocumento.selectByVisibleText("Cédula de Ciudadanía");

		WebElement elemento8 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("BotonBuscar")));
		elemento8.click();

		WebElement elemento9 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id293:CampoNombreCrearCliente")));
		elemento9.sendKeys("Sebastian");

		driver.findElement(By.id("j_id293:CampoApellidoCrearCliente")).sendKeys("Gomez");
		driver.findElement(By.id("j_id293:CampoTelefono")).sendKeys("2097712");
		driver.findElement(By.id("j_id293:MostrarClienteCampoDireccionCrearCliente")).sendKeys("crr110#25#34");
		driver.findElement(By.id("j_id293:MostrarClienteCampoBarrioCrearCliente")).sendKeys("Flores");
		driver.findElement(By.id("j_id293:MostrarClienteCampoLocalidadCrearCliente")).sendKeys("Sur");
		WebElement fechaNacimiento = driver.findElement(By.id("j_id293:MostrarClienteCampoFechaNacimientoCrearClienteInputDate"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", "16/04/2020"
		driver.findElement(By.id("j_id293:CampoCorreo")).sendKeys("diana1@gmail.com");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)", "");

		WebElement elemento10 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(By.id("j_id293:CampoSexo")));

		Select j_id293CampoSexo = new Select (elemento10);
		j_id293CampoSexo.selectByVisibleText("MASCULINO");


		WebElement elemento11 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(By.id("j_id293:BotonCrearCliente")));
		elemento11.click();


		//WebElement elemento12 = (new WebDriverWait(driver, 120))
		//		.until(ExpectedConditions.elementToBeClickable(By.id("j_id293:MostrarClienteBotonAsignarCliente")));

		//elemento12.click(); 


		WebElement elemento13 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("TabLLamadoTurno_lbl")));

		elemento13.click(); 


		//WebElement elemento = (new WebDriverWait(driver, 30))
		//	.until(ExpectedConditions.presenceOfElementLocated(By.id("Turno : ")));
		//assertTrue(driver.findElement(By.id("Turno : ")) .isDisplayed());

		WebElement elemento14 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("seleccionarTipo")));
		Select seleccionarTipo = new Select (elemento14);
		seleccionarTipo.selectByVisibleText("Asesoría Cesantias");
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");

		//WebElement elemento15 = (new WebDriverWait(driver, 120))
		//.until(ExpectedConditions.elementToBeClickable(By.id("ListaServicios")));

		//Select ListaServicios  = new Select (elemento15);
		//ListaServicios.selectByVisibleText("CERTIFICACIÓN_EXTRACTOS");

		WebElement elemento16 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("GrabarServicio")));
		elemento16.click();

		driver.findElement(By.id("Observacion")).sendKeys("Excelente servicio");

		WebElement elemento18 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("BotonAlmacenarObservaciones")));
		elemento18.click();

		WebElement elemento19 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("CerrarTurno")));
		elemento19.click();

		WebElement elemento20 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadTerminarSesion")));
	}


	//Cliente identificado

	@Test
	public void setUp1() throws Exception {
		WebElement elemento1 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("TituloPanelControl")));

		assertTrue(driver.findElement(By.id("TituloPanelControl")) .isDisplayed()); {

			WebElement elemento2 = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAtencion")));
			elemento2.click();

			WebElement elemento3 = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadAtencionTurnosNormales:anchor")));

			elemento3.click();

			WebElement elemento4 = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.elementToBeClickable(By.id("botonLlamarTurno")));

			elemento4.click();

			WebElement elemento5 = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.elementToBeClickable(By.id("TabActualizarCliente_lbl")));

			elemento5.click();

			WebElement elemento6 = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.elementToBeClickable(By.id("CampoIdentificacionFiltro")));

			driver.findElement(By.id("CampoIdentificacionFiltro")).sendKeys("1016084307");

			WebElement elemento7 = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.elementToBeClickable(By.id("CampoTipoDocumento")));

			Select CampoTipoDocumento = new Select (elemento7);
			CampoTipoDocumento.selectByVisibleText("Cédula de Ciudadanía");

			WebElement elemento8 = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.elementToBeClickable(By.id("BotonBuscar")));

			elemento8.click();


			WebElement elemento9 = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id293:CampoNombreCrearCliente")));
			elemento9.sendKeys("Diana");


			WebElement elemento10 = (new WebDriverWait(driver,500))
					.until(ExpectedConditions.elementToBeClickable(By.id("j_id293:MostrarClienteBotonAsignarCliente")));

			elemento10.click(); 

			WebElement elemento11 = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.elementToBeClickable(By.id("TabLLamadoTurno_lbl")));
			elemento11.click(); 


			WebElement elemento12 = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.elementToBeClickable(By.id("seleccionarTipo")));

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,300)", "");

			Select seleccionarTipo = new Select (elemento12);
			seleccionarTipo.selectByVisibleText("Asesoría Cesantias");

			//WebElement elemento13 = (new WebDriverWait(driver, 120))
			//.until(ExpectedConditions.elementToBeClickable(By.id("ListaServicios")));

			//Select ListaServicios  = new Select (elemento13);
			//ListaServicios.selectByVisibleText(" CAJA");

			WebElement elemento14 = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.elementToBeClickable(By.id("GrabarServicio")));

			elemento14.click();


			driver.findElement(By.id("Observacion")).sendKeys("Excelente servicio");


			WebElement elemento15 = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.elementToBeClickable(By.id("BotonAlmacenarObservaciones")));
			elemento15.click();

			WebElement elemento16 = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.elementToBeClickable(By.id("CerrarTurno")));
			elemento16.click();

			WebElement elemento17 = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadTerminarSesion")));
			elemento17.click();
		}
	}



	//Turnos abandonados 

		@Test 
		public void tearDown1() throws Exception {           

			WebElement elemento1 = (new WebDriverWait(driver, 30))
		.until(ExpectedConditions.presenceOfElementLocated(By.id("TituloPanelControl")));

		assertTrue(driver.findElement(By.id("TituloPanelControl")) .isDisplayed());


			WebElement elemento2 = (new WebDriverWait(driver, 30))
			.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAtencion")));
		elemento2.click();

		WebElement elemento3 = (new WebDriverWait(driver, 30))
			.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadAtencionTurnosNormales:anchor")));
		elemento3.click();

		
		WebElement elemento4 = (new WebDriverWait(driver, 120))
		.until(ExpectedConditions.elementToBeClickable(By.id("botonLlamarTurno")));
		elemento4.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)", "");
		
		WebElement elemento10 = (new WebDriverWait(driver, 120))
			.until(ExpectedConditions.elementToBeClickable(By.id("motivosAbandono")));
		Select sel4 = new Select(elemento10);
		sel4.selectByVisibleText("CLIENTE NO SE PRESENTO");

		WebElement elemento5 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.elementToBeClickable(By.id("BotonAbandonarTurno")));
		elemento5.click();
	}

	//pantalla turnos abandonados 

	//@Test
	//public void setUp1() throws Exception {

	//	WebElement elemento1 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.presenceOfElementLocated(By.id("TituloPanelControl")));

	//assertTrue(driver.findElement(By.id("TituloPanelControl")) .isDisplayed()); {

	//WebElement elemento2 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAtencion")));
	//elemento2.click();

	//WebElement elemento3 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadAtencionTurnosAbandonados:anchor")));

	//elemento3.click();

	//WebElement elemento4 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("botonLlamarTurno")));

	//elemento4.click();

	//WebElement elemento5 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("TabActualizarCliente_lbl")));

	//	elemento5.click();

	//WebElement elemento6 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("CampoIdentificacionFiltro")));

	//	driver.findElement(By.id("CampoIdentificacionFiltro")).sendKeys("1016084307");

	//WebElement elemento7 = (new WebDriverWait(driver, 120))
	//.until(ExpectedConditions.elementToBeClickable(By.id("CampoTipoDocumento")));

	//	Select CampoTipoDocumento = new Select (elemento7);
	//	CampoTipoDocumento.selectByVisibleText("Cédula de Ciudadanía");

	//		WebElement elemento8 = (new WebDriverWait(driver, 30))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("BotonBuscar")));

	//			elemento8.click();

	//		WebElement elemento9 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id293:CampoNombreCrearCliente")));

	//		elemento9.sendKeys("Diana");

	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//		js.executeScript("window.scrollBy(0,300)", "");

	//	elemento9.click();

	//WebElement elemento10 = (new WebDriverWait(driver,500))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("j_id293:MostrarClienteBotonAsignarCliente")));

	//elemento10.click(); 

	//WebElement elemento11 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("TabLLamadoTurno_lbl")));
	//elemento11.click(); 


	//WebElement elemento12 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("seleccionarTipo")));

	//Select seleccionarTipo = new Select (elemento12);
	//seleccionarTipo.selectByVisibleText("caja");

	//	WebElement elemento13 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("ListaServicios")));

	//	Select ListaServicios  = new Select (elemento13);
	//		ListaServicios.selectByVisibleText(" CAJA");

	//	WebElement elemento14 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("GrabarServicio")));

	//elemento14.click();


	//		driver.findElement(By.id("Observacion")).sendKeys("Excelente servicio");

	//	WebElement elemento15 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("BotonAlmacenarObservaciones")));

	//elemento15.click();

	//WebElement elemento16 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("CerrarTurno")));
	//}
	//		}





	//Turnos suspendidos

	//		@Test
	//	public void setUp11() throws Exception {
	//	WebElement elemento = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.presenceOfElementLocated(By.id("TituloPanelControl")));

	//		assertTrue(driver.findElement(By.id("TituloPanelControl")) .isDisplayed()); {

	//		WebElement elemento2 = (new WebDriverWait(driver, 30))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAtencion")));
	//			elemento2.click();

	//		WebElement elemento3 = (new WebDriverWait(driver, 30))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadAtencionTurnosNormales:anchor")));

	//		elemento3.click();

	//	WebElement elemento4 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("botonLlamarTurno")));

	//			elemento4.click();

	//		WebElement elemento5 = (new WebDriverWait(driver, 500))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("seleccionarTipo")));

	//			Select seleccionarTipo = new Select (elemento5);
	//		seleccionarTipo.selectByVisibleText("Asesoría Cesantias");

	//WebElement elemento6 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.xpath("ListaServicios")));

	//Select ListaServicios  = new Select (elemento6);
	//ListaServicios.selectByVisibleText(" ASESORÍA CESANTIAS");

	//	WebElement elemento6 = (new WebDriverWait(driver, 250))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("GrabarServicio")));

	//		elemento6.click();

	//	WebElement elemento11 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.presenceOfElementLocated(By.id("Observacion")));

	//			assertTrue(driver.findElement(By.id("Observacion")) .isDisplayed());

	//		driver.findElement(By.id("Observacion")).sendKeys("Se suspende el servicio");

	//	WebElement elemento7 = (new WebDriverWait(driver, 250))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("BotonAlmacenarObservaciones")));

	//				elemento7.click();

	//			WebElement elemento12 = (new WebDriverWait(driver, 120))
	//				.until(ExpectedConditions.presenceOfElementLocated(By.id("EtiquetaTituloObservacionesEstatico")));

	//	assertTrue(driver.findElement(By.id("EtiquetaTituloObservacionesEstatico")) .isDisplayed());

	//		driver.findElement(By.id("EtiquetaTituloObservacionesEstatico")).sendKeys("Se suspende el servicio");

	//	WebElement elemento8 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("Suspender")));

	//			elemento8.click();

	//	}
	//		}


	//pantalla suspendidos


	//@Test
	//public void setUp2() throws Exception {

	//	WebElement elemento1 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.presenceOfElementLocated(By.id("TituloPanelControl")));

	//assertTrue(driver.findElement(By.id("TituloPanelControl")) .isDisplayed()); {

	//			WebElement elemento2 = (new WebDriverWait(driver, 30))
	//					.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAtencion")));
	//		elemento2.click();

	//	WebElement elemento3 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadAtencionTurnosPendientes:anchor")));

	//	elemento3.click();

	//	WebElement elemento4 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("botonLlamarTurno")));

	//elemento4.click();

	//WebElement elemento5 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("TabActualizarCliente_lbl")));

	//elemento5.click();

	//WebElement elemento6 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("CampoIdentificacionFiltro")));

	//driver.findElement(By.id("CampoIdentificacionFiltro")).sendKeys("1016084307");

	//	WebElement elemento7 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("CampoTipoDocumento")));

	//Select CampoTipoDocumento = new Select (elemento7);
	//CampoTipoDocumento.selectByVisibleText("Cédula de Ciudadanía");

	//		WebElement elemento8 = (new WebDriverWait(driver, 30))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("BotonBuscar")));

	//		elemento8.click();

	//	WebElement elemento9 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id293:CampoNombreCrearCliente")));

	//	elemento9.sendKeys("Diana");

	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//		js.executeScript("window.scrollBy(0,300)", "");

	//	elemento9.click();

	//	WebElement elemento10 = (new WebDriverWait(driver,500))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("j_id293:MostrarClienteBotonAsignarCliente")));

	//	elemento10.click(); 

	//		WebElement elemento11 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("TabLLamadoTurno_lbl")));
	//		elemento11.click(); 


	//	WebElement elemento12 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("seleccionarTipo")));

	//	Select seleccionarTipo = new Select (elemento12);
	//	seleccionarTipo.selectByVisibleText("caja");

	//		WebElement elemento13 = (new WebDriverWait(driver, 120))
	//					.until(ExpectedConditions.elementToBeClickable(By.id("ListaServicios")));

	//		Select ListaServicios  = new Select (elemento13);
	//			ListaServicios.selectByVisibleText(" CAJA");

	//		WebElement elemento14 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("GrabarServicio")));

	//		elemento14.click();


	//	driver.findElement(By.id("Observacion")).sendKeys("Excelente servicio");

	//		WebElement elemento15 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("BotonAlmacenarObservaciones")));

	//		elemento15.click();

	//	WebElement elemento16 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("CerrarTurno")));
	//}
	//		}
	//}
	//turnos redireccionados

	//@Test
	//public void setUp12() throws Exception {
	//WebElement elemento = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.presenceOfElementLocated(By.id("TituloPanelControl")));

	//assertTrue(driver.findElement(By.id("TituloPanelControl")) .isDisplayed()); {

	//WebElement elemento2 = (new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAtencion")));
	//	elemento2.click();

	//			WebElement elemento3 = (new WebDriverWait(driver, 30))
	//				.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadAtencionTurnosNormales:anchor")));

	///	elemento3.click();

	//			WebElement elemento4 = (new WebDriverWait(driver, 120))
	//				.until(ExpectedConditions.elementToBeClickable(By.id("botonLlamarTurno")));

	//	elemento4.click();

	//		WebElement elemento5 = (new WebDriverWait(driver, 500))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("seleccionarTipo")));

	//		Select seleccionarTipo = new Select (elemento5);
	//	seleccionarTipo.selectByVisibleText("Asesoría Cesantias");

	//WebElement elemento6 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.xpath("ListaServicios")));

	//Select ListaServicios  = new Select (elemento6);
	//ListaServicios.selectByVisibleText(" ASESORÍA CESANTIAS");

	//		WebElement elemento6 = (new WebDriverWait(driver, 250))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("GrabarServicio")));

	//			elemento6.click();

	//		WebElement elemento11 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.presenceOfElementLocated(By.id("Observacion")));

	//	assertTrue(driver.findElement(By.id("Observacion")) .isDisplayed());

	//	driver.findElement(By.id("Observacion")).sendKeys("Se suspende el servicio");

	//		WebElement elemento7 = (new WebDriverWait(driver, 250))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("BotonAlmacenarObservaciones")));

	//	elemento7.click();

	//			WebElement elemento12 = (new WebDriverWait(driver, 120))
	//						.until(ExpectedConditions.presenceOfElementLocated(By.id("CampoRedireccionarAsesor")));
	//7
	//		assertTrue(driver.findElement(By.id("CampoRedireccionarAsesor")) .isDisplayed());

	//	WebElement elemento8 = (new WebDriverWait(driver, 500))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("CampoRedireccionarAsesor")));

	//	Select CampoRedireccionarAsesor = new Select (elemento8);
	//		seleccionarTipo.selectByVisibleText("USUARIO INSTALADOR DEL SISTEMA INSTALADOR");

	//	WebElement elemento9 = (new WebDriverWait(driver, 500))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("TiposTurnoUsuario")));

	//			Select TiposTurnoUsuario = new Select (elemento9);
	//		TiposTurnoUsuario.selectByVisibleText("A-AsesoriaCES");


	//			WebElement elemento10 = (new WebDriverWait(driver, 250))
	//				.until(ExpectedConditions.elementToBeClickable(By.id("BotonRedireccionarInicio")));

	//	elemento10.click();

	//}
	//}

	//@Test
	//	public void tearDown13() throws Exception {
	//	WebElement elemento = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.presenceOfElementLocated(By.id("TituloPanelControl")));

	//	assertTrue(driver.findElement(By.id("TituloPanelControl")) .isDisplayed());


	//WebElement elemento2 = (new WebDriverWait(driver, 120))
	//.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAdministracion")));
	//elemento2.click();

	//WebElement elemento3 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorGrupoHerramientasAdministrativas")));
	//elemento3.click();

	//WebElement elemento4 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadParametros:anchor")));
	//elemento4.click();

	//WebElement elemento5 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ContenidoVisible\"]/div[3]/span")));

	//assertTrue(driver.findElement(By.xpath("//*[@id=\"ContenidoVisible\"]/div[3]/span")) .isDisplayed());

	//	WebElement elemento6 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.visibilityOfElementLocated(By.id("FormularioEdicionParametro:modificarParametro:j_id84fsp")));
	//	elemento6.sendKeys("CALIFICAR_ANTES_REENCOLAR");

	//		WebElement elemento7 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("FormularioEdicionParametro:modificarParametro:0:j_id100")));
	//		elemento7.click();


	//	System.out.println("antes del control");


	//	WebElement elemento8 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"j_id109\"]/center/table[1]/tbody/tr/td[2]/input")));
	//	elemento8.click();

	//	System.out.println("antes del control");

	//	WebElement elemento9 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("j_id109:j_id120")));
	//	elemento9.click();

	//		WebElement elemento10 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.visibilityOfElementLocated(By.id("FormularioEdicionParametro:modificarParametro:j_id84fsp")));
	//		elemento10.sendKeys("CALIFICAR_ANTES_REENCOLAR");


	//	WebElement elemento11 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.xpath("FormularioEdicionParametro:modificarParametro:0:j_id100")));
	//	elemento11.click();


	//		WebElement elemento12 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"j_id109\"]/center/table[1]/tbody/tr/td[2]/input")));
	//	elemento12.click();


	//	WebElement elemento13 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("j_id109:j_id120")));
	//		elemento13.click();	

	//	WebElement elemento14 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.visibilityOfElementLocated(By.id("FormularioEdicionParametro:modificarParametro:j_id84fsp")));
	//	elemento14.sendKeys("CALIFICADORES_DINAMICOS");

	//		WebElement elemento15 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.xpath("FormularioEdicionParametro:modificarParametro:0:j_id100")));
	//	elemento15.click();


	//		WebElement elemento16 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"j_id109\"]/center/table[1]/tbody/tr/td[2]/input")));
	//		elemento16.click();


	//	WebElement elemento17 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("j_id109:j_id120")));
	//elemento17.click();	

	//WebElement elemento18 = (new WebDriverWait(driver, 120))
	//	.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAdministracion")));
	//		elemento18.click();

	//	WebElement elemento19 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorGrupoTablerosVentanillas:anchor")));
	//	elemento19.click();

	//		WebElement elemento20 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadVentanillas")));
	//		elemento20.click();


	//	WebElement elemento21 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("j_id119_lbl")));
	//	elemento21.click();

	//		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,2000)", "");

	//	WebElement elemento22 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("formModificarVentanilla:ciudad")));
	//	Select sel5 = new Select(elemento22	);
	//		sel5.selectByVisibleText("ARMENIA");

	//	WebElement elemento23 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("formModificarVentanilla:sucursal")));
	//	Select sel6 = new Select(elemento23	);
	//		sel6.selectByVisibleText("ARMENIA");

	//	WebElement elemento24 = (new WebDriverWait(driver, 120))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("formModificarVentanilla:ventanillas")));
	//		Select sel7 = new Select(elemento24	);
	//	sel7.selectByVisibleText("Ventanilla 1");

	//		WebElement elemento25 = (new WebDriverWait(driver, 120))
	//			.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"formModificarVentanilla:j_id135\"]")));
	//		elemento25.click();

	//	WebElement elemento26 = (new WebDriverWait(driver, 30))

	//		.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorAtencion")));
	//	elemento26.click();

	//	WebElement elemento27 = (new WebDriverWait(driver, 30))
	//		.until(ExpectedConditions.elementToBeClickable(By.id("MenuSuperiorFuncionalidadAtencionTurnosNormales:anchor")));

	//	elemento27.click();
	//	}
























































	private void assertStartAdvertising() {
		// TODO Auto-generated method stub

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}





}





