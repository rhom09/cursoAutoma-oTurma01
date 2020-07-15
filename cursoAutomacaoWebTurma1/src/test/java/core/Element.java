package core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import enums.ByValue;

public class Element {

	ByValue by;
	String map;
	WebElement webElement = null;

	public void setWebElement(WebElement element) {
		this.webElement = element;
	}

	public Element(ByValue by, String map) {
		this.by = by;
		this.map = map;
	}

	public WebElement getElement() {
		WebElement element = null;
		switch (by) {
		case ID:
			element = get(By.id(map));
			break;

		case CSSSELECTOR:
			element = get(By.cssSelector(map));
			break;

		case XPATH:
			element = get(By.xpath(map));
			break;

		case CLASSNAME:
			element = get(By.className(map));
			break;

		case NAME:
			element = get(By.name(map));
			break;

		default:
			break;
		}
		return element;
	}

	public WebElement get(By by) {
		if (webElement == null) {
			return Driver.getDriver().findElement(by);
		} else {
			return webElement.findElement(by);
		}
	}

	public List<WebElement> getElements() {
		List<WebElement> elements = null;
		switch (by) {
		case ID:
			elements = Driver.getDriver().findElements(By.id(map));
			break;

		case CSSSELECTOR:
			elements = Driver.getDriver().findElements(By.cssSelector(map));
			break;

		case XPATH:
			elements = Driver.getDriver().findElements(By.xpath(map));
			break;

		case CLASSNAME:
			elements = Driver.getDriver().findElements(By.className(map));
			break;

		case NAME:
			elements = Driver.getDriver().findElements(By.name(map));
			break;

		default:
			break;
		}
		return elements;
	}

	public void sendKeys(CharSequence... value) {
		getElement().sendKeys(value);
	}

	public String getText() {
		return getElement().getText();
	}

	public void click() {
		getElement().click();
	}

	public String getAttribute(String value) {
		return getElement().getAttribute(value);
	}

	public void clear() {
		getElement().clear();
	}

	public boolean isEnabled() {
		return getElement().isEnabled();
	}

	public boolean isDisplayed() {
		return getElement().isDisplayed();
	}

	public boolean isSelected() {
		return getElement().isSelected();
	}

	public void select(String value) {
		Select select = new Select(getElement());
		select.selectByVisibleText(value);
	}

}
