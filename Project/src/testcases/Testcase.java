package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("chromedivber.chrome.driver", "");
		
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("http://www.google.com");
		
		
	Select object = new Select(driver.findElement(null));
	object.selectByVisibleText("visa");  
		
		
	driver.findElement(By.tagName("a"));

///////////////////////////////////////////////////////////////
	}

}
