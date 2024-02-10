package flowciteFramework.flowcite;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flowciteFramework.pomObject.LandingPage;
import flowciteFramework.pomObjects.Editor;
import flowciteFramework.pomObjects.Library;

public class Test {
	@org.testng.annotations.Test
	public void LibraryTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		LandingPage lpage = new LandingPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		lpage.getURL();
		lpage.loginProcess();
		
		Library library = new Library(driver);
		library.addProject("Next");
		library.selectProject("Next");
		library.addDocument();
		library.addImage();
		library.addCollab();
		library.addTag();
		library.addView();
		library.backTag();
	}

	@org.testng.annotations.Test
	public void EditorTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		LandingPage lpage = new LandingPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		lpage.getURL();
		lpage.loginProcess();
		Editor editor = new Editor(driver);
		editor.addEditor();
		editor.addpro("Next");
		editor.addImg();
	}

}