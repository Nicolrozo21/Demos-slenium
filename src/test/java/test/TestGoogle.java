package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import junit.framework.Assert;

public class TestGoogle {


	//VARIABLES
	private WebDriver driver;   
	private static final String TIPO_DRIVER = "webdriver.chrome.driver";
	private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
	private String URL = "https://testpages.herokuapp.com/styled/index.html ";
	
	//TEXTO DE INICIO
	@BeforeClass
	public static void setUpBeforeClass()
	{
		System.out.println("INICIO DE TESTS");
		System.setProperty(TIPO_DRIVER, PATH_DRIVER);
		
	}
	
	
	@Before
	public void setUp()
	{
		System.setProperty(TIPO_DRIVER, PATH_DRIVER);
		driver = new ChromeDriver(); //se abre el navegador
		driver.get(URL); //navegar
		 //VALIDAR TIEMPO
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	}
	
	//PRUEBA
	@Test
	public void testSourch()
	{
	
	   //PASO 1 CLICK EN EL TEXTO DESEADO
		WebElement link= driver.findElement(By.xpath("//*[@id='basicpagetest']"));
	    link.click();
	  
	
	   //SEGUNDO CLICK EN EL INDEX
	   WebElement index= driver.findElement(By.xpath("/html/body/div/div[1]/a"));
	   index.click();
	   
		
	   //Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			   //.withTimeout(10, TimeUnit.SECONDS)
			   //.pollingEvery(10, TimeUnit.SECONDS);
	   
	   
	}
	
	
	
	@After
	public void tearDown()
	{
     	driver.quit();
	}
	
	@AfterClass
	public static void tearDoenAfterClass()
	{
		System.out.println("FINALIZA LOS TEST");
	}
}
