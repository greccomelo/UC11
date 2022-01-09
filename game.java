package game;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class game {
	private WebDriver driver;
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void LoginTest() {
		driver.get("http://localhost:4200/login");
		driver.findElement(By.id("nickname")).click();
		
		// primeiro teste
		driver.findElement(By.id("nickname")).sendKeys("fabiana@email.com");
		driver.findElement(By.id("password")).sendKeys("fabiana");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("logar")).click();
		WebElement mensagem = driver.findElement(By.id("mensagem"));
		System.out.println(mensagem.getText());
		
	}

}
