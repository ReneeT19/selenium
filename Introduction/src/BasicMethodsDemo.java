import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodsDemo {

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
		
		//Validate if page title is correct 
		System.out.println(driver.getTitle());
		
		//Validate if landed on correct Url
		System.out.println(driver.getCurrentUrl());
		
		//To get the page source
		System.out.println(driver.getPageSource());
		
		//Navigate back to google
		driver.navigate().to("http://yahoo.com");
//		driver.navigate().back();  
//		forward()  not working on Chrome; a latest bug
		
		//Close the browser(s)
		driver.close(); //close current browser
//		driver.quit(); //close all browsers
	}

}
