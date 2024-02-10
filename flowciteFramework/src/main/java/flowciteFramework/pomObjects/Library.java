package flowciteFramework.pomObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.AbstractComponent.AbstractComponent;

public class Library extends AbstractComponent {
		WebDriver driver;
		String pName;

		public Library(WebDriver driver)
		{
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(className = "tip-add-project")
		WebElement addPrjectBtn;
		@FindBy(id = "react-select-4-input")
		WebElement projectName;
		@FindBy(xpath = "//button[contains(text(),'Create')]")
		WebElement createBtn;

		public void addProject(String pName) throws InterruptedException {
			MenuBar menuBar = new MenuBar(driver);
			menuBar.getTab("Library");
			Thread.sleep(3000);
			addPrjectBtn.click();
			projectName.sendKeys(pName);
			createBtn.click();
			Thread.sleep(5000);
		}

		@FindBy(css = ".library-new-concept")
		List<WebElement> projects;
		
		By projectListBy = By.cssSelector(".library-new-concept");

		public List<WebElement> getProjectNames() {
			waitForElementToAppear(projectListBy);
			return projects;
		}

		public void selectProject(String pname) throws InterruptedException {
			WebElement projectElement = getProjectNames().stream()
					.filter(project -> project.findElement(By.cssSelector(".library-new-concept p")).getText()
							.equals(pname))
					.findFirst()
					.orElse(null);
			waitForWebElementToAppear(projectElement);
			projectElement.click();
		}

		@FindBy(className = "add-doc")
		WebElement addDoc;

		@FindBy(xpath = "//div[contains(text(),'Drop a pdf document here or click to select one')]")
		WebElement dropDoc;

		@FindBy(xpath = "//button[contains(text(),'Save')]")
		WebElement saveDoc;

		public void addDocument() throws InterruptedException {
			addDoc.click();
			dropDoc.click();
			Thread.sleep(15000);
			waitForWebElementToAppear(saveDoc);
			saveDoc.click();
			Thread.sleep(3000);
		}
		@FindBy(className = "tip-image-upload")
		WebElement addImg;
		@FindBy(className = "drop-border")
		WebElement dragImg;
		@FindBy(xpath = "//button[contains(text(),'Upload')]")
		WebElement uploadImg;

		public void addImage() throws InterruptedException {
			addImg.click();
			dragImg.click();
			Thread.sleep(6000);
			waitForWebElementToAppear(uploadImg);
			uploadImg.click();
		}

		@FindBy(className = "collaborator")
		WebElement addColab;
		@FindBy(className = "bp3-dialog-close-button")
		WebElement addCross;

		public void addCollab() throws InterruptedException {
			Thread.sleep(3000);
			addColab.click();
			Thread.sleep(3000);
			addCross.click();
		}

		@FindBy(className = "tag")
		WebElement addTag;
		@FindBy(className = "bp3-dialog-close-button")
		WebElement addClose;

		public void addTag() throws InterruptedException {
			Thread.sleep(3000);
			addTag.click();
			Thread.sleep(3000);
			addClose.click();
		}

		@FindBy(className = "trashed-filter")
		WebElement addView;

		@FindBy(xpath = "//div[contains(text(),'Image View')]")
		WebElement addImgt;

		public void addView() throws InterruptedException {
			Thread.sleep(3000);
			addView.click();
			Thread.sleep(3000);
			addImgt.click();
		}
		
		
		
     @FindBy(xpath = "//button[contains(text(),'Library')]")
		WebElement backButton;
		@FindBy(xpath = "//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/button[2]")
		WebElement clickBtn;
		@FindBy(xpath = "//div[contains(text(),'Delete')]")
		WebElement deleteBtn;
		@FindBy(xpath = "//button[contains(text(),'Yes')]")
		WebElement yesBtn;

		public void backTag() throws InterruptedException {
			Thread.sleep(3000);
			backButton.click();
			Thread.sleep(3000);
			clickBtn.click();
			Thread.sleep(3000);
			deleteBtn.click();
			Thread.sleep(3000);
			yesBtn.click();
		}



}
