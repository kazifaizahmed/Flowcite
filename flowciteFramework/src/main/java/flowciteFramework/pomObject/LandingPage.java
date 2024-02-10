package flowciteFramework.pomObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import flowciteFramework.abstractComponent.AbstractComponent;

public class LandingPage extends AbstractComponent {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getURL() {
		driver.get("https://app.flowcite.com/sign-in");
	}

	@FindBy(id = "emailInput")
	WebElement email;

	@FindBy(id = "passwordInput")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/button")
	WebElement submit;

	public void loginProcess() {

email.sendKeys("test@user.com");
password.sendKeys("123456789");
submit.click();
}
}