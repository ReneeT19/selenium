import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class launchbrowser {

	//Create a global driver object
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
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
			System.out.println(title);
		}
		
		//Locate web elements
		String tagname = " ";
		tagname = driver.findElement(By.cssSelector("#swm-link")).getText();
		System.out.println(tagname);
		
		//Drop-down menu
		Select category = new Select(driver.findElement(By.xpath("//*[@id=\'searchDropdownBox\']")));
//		Actions action = new Actions(driver);
//		action.moveToElement(category);
//		action.click();
//		action.perform(); 
		Thread.sleep(2000);
		category.selectByVisibleText("Books");
	
//		WebElement books = driver.findElement(By.xpath("//*[@id=\'searchDropdownBox\']/option[14]"));
//		action.moveToElement(books);
//		action.click();
//		System.out.println(books);
//		action.perform();
//		Thread.sleep(3000);
		
		//The code below doesn't apply because u.s. amazon doens't have link under books
//		driver.findElement(By.linkText("Fiction Books")).click();
//		Thread.sleep(2000);
		
		//Typing the text
		WebElement myElement = driver.findElement(By.id("twotabsearchtextbox"));
		myElement.sendKeys("John Grisham");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		//Select the book
		driver.findElement(By.partialLinkText("Misjudged")).click();
		
		//Shift the tab control when there is more than one tab open
//		java.util.Set<String> handles = driver.getWindowHandles(); //store all possible tabs in the handles array
//		String winHandle1 = driver.getWindowHandle(); //gives you the current window you are working on
//		handles.remove(winHandle1); //remove the current handle from the handles array to shift to other tabs
//		
//		String winHandle = handles.iterator().next(); //iterate through the 1st, 2nd, 3rd tab...
//		String winHandle2 = " "; //stores the tab shifted to
//		if(winHandle != winHandle1) {
//			winHandle2 = winHandle; //retrieve the handle of second window; store handle of second window handle
//			driver.switchTo().window(winHandle2); //switch control to new tab
//			System.out.println(winHandle2);
//		}
//		Thread.sleep(2000);
		
		//Add to cart
//		driver.findElement(By.cssSelector("")).click();
//		Thread.sleep(5000);
		
		//Scroll the web page till end
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}

}
