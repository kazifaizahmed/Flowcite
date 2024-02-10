package flowciteFramework.pomObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.AbstractComponent.AbstractComponent;

public class MenuBar extends AbstractComponent {
	WebDriver driver;

	public MenuBar(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getTab(String tabName) {
		String xpath;

		switch (tabName) {
		case "Library":
			xpath = "//span[text()='Library']";
			break;
		case "Editor":
			xpath = "//span[text()='Editor']";
			break;
		case "Search":
			xpath = "//span[text()='Search']";
			break;
		case "Trash":
			xpath = "//span[text()='Trash']";
			break;
		default:
			throw new IllegalArgumentException("Unsupported tabName: " + tabName);
		}

		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement tabElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		actions.moveToElement(tabElement).perform();
		tabElement.click();
	}


}
