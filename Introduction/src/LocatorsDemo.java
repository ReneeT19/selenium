import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open url in the browser
		driver.get("https://facebook.com");  
		
		//To fetch text from browser and print in console
		System.out.print(driver.findElement(By.cssSelector("#reg_pages_msg")).getText());
		
		//To identify the ID box; and send information in the edit box by ID
		driver.findElement(By.id("email")).sendKeys("snowy_yao@hotmail.com");
		//To identify the Password box; and send information in the edit box by NAME
		driver.findElement(By.name("pass")).sendKeys("password");
//		Use Xpath: driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pwd");
		//To click on the Login button by Xpath (not working on Facebook page but salesforce.com)
		driver.findElement(By.xpath("//*[@name='login']")).click();
//		driver.findElement(By.name("login")).click();
		//To click on a link
//		driver.findElement(By.linkText("Forgot Password?")).click();
		
		//To identify elements using Css and Xpath
//		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
//		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("password");
//		driver.findElement(By.xpath("//*[@name='login']")).click();
//		driver.findElement(By.name("login")).click();
//		driver.findElement(By.linkText("Forgot Password?")).click(); //can't get Xpath or Css for this element
	

		
//	https://login.salesforce.com/ will give better demo when using Css and Xpath
	}

}
