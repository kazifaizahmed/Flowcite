package flowciteFramework.pomObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.AbstractComponent.AbstractComponent;
public class Editor extends AbstractComponent {
	WebDriver driver;
	String pName;

	public Editor (WebDriver driver)
		{
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void addEditor() throws InterruptedException {
			MenuBar menuBar = new MenuBar(driver);
			menuBar.getTab("Editor");
			Thread.sleep(6000);
		}

//		@FindBy(css = ".lat-grid-template")
//		List<WebElement> pro;
//
//		By projectListBy = By.cssSelector(".lat-grid-template");
//
//		public List<WebElement> getProjectNames() {
//			waitForElementToAppear(projectListBy);
//			return pro;
//		}
//
//		public void selectPro(String pname) throws InterruptedException {
//			WebElement projectElement = getProjectNames().stream().filter(
//					project -> project.findElement(By.cssSelector(".lat-grid-template p")).getText().equals(pname))
//					.findFirst().orElse(null);
//			waitForWebElementToAppear(projectElement);
//			projectElement.click();
//		}

		@FindBy(xpath = "//button[contains(text(),'Create File')]")
		WebElement createBtn;
		@FindBy(xpath = "//body/div[8]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
		WebElement writeBtn;
		@FindBy(xpath = "//body/div[8]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]")
		WebElement blankBtn;
		@FindBy(className = "fc-select-neo__indicator")
		WebElement textBtn;
		@FindBy(xpath = "//body/div[8]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/button[1]")
		WebElement createButton;
		@FindBy(className = "btn-editor-new")
		WebElement folderBtn;
		@FindBy(xpath = "//div[contains(@class,'Row pad-potrait split-control-bg')]//button[3]")
		WebElement safeBtn;
		@FindBy(className = "form-control")
		WebElement safetextBtn;
		@FindBy(xpath = "//button[contains(text(),'Save')]")
		WebElement safewithnameBtn;
		@FindBy(xpath = "(//button[contains(@class,'btn-editor-new')])[2]")
		WebElement downloadBtn;
		@FindBy(xpath = "(//button[contains(@class,'btn-editor-new')])[3]")
		WebElement imgBtn;

		@FindBy(xpath = "//a[contains(text(),'Upload')]")
		WebElement uploadimgBtn;
		@FindBy(xpath = "//div[contains(text(),'Drop a .jpg/ .jpeg/ .png file here or click to sel')]")
		WebElement dragimgBtn;
		@FindBy(xpath = "//button[contains(text(),'Upload')]")
		WebElement confirndragimgBtn;
//		@FindBy(xpath = "//button[normalize-space()='Back']")
//		WebElement baxkBtn;
//		@FindBy(className = "more")
//		WebElement bacckBtn;
//		@FindBy(xpath = "//div[@class='bp3-portal']//li[3]//a[1]")
//		WebElement deleteBtn;
//		@FindBy(xpath = "//button[contains(text(),'Yes')]")
//		WebElement yesBtn;

		public void addpro(String pname) throws InterruptedException {
			createBtn.click();
			Thread.sleep(5000);
			writeBtn.sendKeys(pname);
			Thread.sleep(5000);
			blankBtn.click();
			textBtn.click();
			Thread.sleep(5000);
			createButton.click();
			Thread.sleep(10000);
			folderBtn.click();
			Thread.sleep(5000);
			safeBtn.click();
			Thread.sleep(3000);
			safetextBtn.sendKeys("Next");
			Thread.sleep(3000);
			safewithnameBtn.click();
			Thread.sleep(3000);
			downloadBtn.click();
			Thread.sleep(3000);
			downloadBtn.click();
		}

//to hover in the pic icon in editor using action methods
		public void addImg() throws InterruptedException {
			Thread.sleep(4000);
			Actions actions = new Actions(driver);
			actions.moveToElement(imgBtn).perform();
			imgBtn.click();
			Thread.sleep(3000);
			uploadimgBtn.click();
			Thread.sleep(3000);
			dragimgBtn.click();
			Thread.sleep(4000);
			confirndragimgBtn.click();
			Thread.sleep(3000);
//			baxkBtn.click();
//			Thread.sleep(3000);
//			bacckBtn.click();
//			Thread.sleep(3000);
//			deleteBtn.click();
//			Thread.sleep(3000);
//			yesBtn.click();
		}


	}
