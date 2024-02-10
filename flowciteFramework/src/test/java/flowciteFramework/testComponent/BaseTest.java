package flowciteFramework.testComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import flowciteFramework.pomObject.LandingPage;

public class BaseTest {
    public WebDriver driver;
	public LandingPage lPage;
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")
						+ "src\\main\\java\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		   
		}else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}

//	@BeforeMethod(alwaysRun = true)
//	public LandingPage launchApplication() throws IOException {
//		driver= initializeDriver();
//		lPage = new LandingPage(driver);
//        lPage.getURL();
//        return lPage;
//	}
//
//	@AfterMethod(alwaysRun = true)
//	public void tearDown() {
//	driver.close();
//}
//
//public List<HashMap<String, String>> getJsonDataToMap(String filepath) throws IOException {
//
//	String jsonContent = FileUtils.readFileToString(
//			new File(filepath),
//			StandardCharsets.UTF_8);
//
//	ObjectMapper mapper = new ObjectMapper();
//	List<HashMap<String, String>> data = mapper.readValue(jsonContent,
//			new TypeReference<List<HashMap<String, String>>>() {
//			});
//	return data;
//}

}
