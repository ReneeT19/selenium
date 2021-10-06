import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	//Create a global driver object
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		//Invoke .exe file first to access the memory location of jar files
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//Instantiate Driver object for Chrome browser
		driver = new ChromeDriver();
		//Set the wait time
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Open the browser
		driver.navigate().to("https://amazon.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		//Check if title matches for validation purpose
		if(title.equalsIgnoreCase("Amazon.com")) {
			System.out.print("Title matches");
		} else {
			System.out.print(title);
		}
	}

}
