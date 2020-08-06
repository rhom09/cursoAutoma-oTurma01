package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

	private static WebDriver driver;
	private static WebDriverWait wait;

	public static void abreNavegador() {
		// System.setProperty("webdriver.chrome.driver", "/bin/chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
	}

	public static void fechaNavegador() {
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUrl(String url) {
		driver.get(url);
	}

	public static WebElement waitVisibleElement(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void waitInvisibilityElement(By by) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public static WebElement waitClickableElement(By by) {
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}

}
