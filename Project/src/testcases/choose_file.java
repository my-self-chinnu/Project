package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class choose_file {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Static.html");
	driver.manage().window().maximize();
	
	
	
	
	WebElement fileInput = driver.findElement(By.name("uploadfile"));
	fileInput.sendKeys("C:/path/to/file.jpg");
}
}