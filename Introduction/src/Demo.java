import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//Create Driver object for Chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		
		//Hit the Chrome browser or any browser that you specified in the previous step
		driver.get("http://google.com");
		//To get the title of the page, driver.getTitle(); 
		System.out.println(driver.getTitle());
	}

}
