package cursoTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeEach
	public void abreNavegador() {
		// System.setProperty("webdriver.chrome.driver", "/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://lojaexemplod.lojablindada.com/");
		driver.manage().window().maximize();
	}
	
	@AfterEach
	public void fechaNavegador() {
		driver.quit();
	}

}
