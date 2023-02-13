package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	
	public static WebDriver driver;

	
	@Before
	public void SetupChrome () {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macbook/eclipse-workspace/com.cucumberluisjose/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
	}
	
	
	@Given("Inicio el navegador Chrome")
	public void inicio_el_navegador_chrome() {
	    driver.get("https://www.google.com");
			driver.manage().window().maximize();
	}

	@When("Buscar la palabra Luis en el navegador de Chorme")
	public void buscar_la_palabra_Luis_en_el_navegador_de_Chorme() {
	    WebElement BarraBusqueda = driver.findElement(By.name("q"));
		BarraBusqueda.sendKeys("Luis");
				
	}

	@When("Presiono el boton buscar")
	public void presiono_el_boton_buscar() {
	    WebElement BotonBuscar = driver.findElement(By.name("btnK"));
		BotonBuscar.click();
	}

	@Then("Cierro el navegador")
	public void cierro_el_navegador() {
		System.out.println("OK");
	}
	
	@After
	public static void tearDown() {
		driver.close();
	}
	
	
	@AfterStep
	public static void takeScreenshot ( Scenario scenario) {
	
		final byte [] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "image");

}
}

	
