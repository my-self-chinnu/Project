package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class loop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins*");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List <WebElement> listofItems = driver.findElements(By.xpath("//a"));
		  System.out.println(listofItems);
		  
		  
		for (int i=1; i<=listofItems.size(); i++)
		{
		   listofItems.get(i).click();
		  // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   System.out.println(i);
		   System.out.println("pass");
		   
		   Thread.sleep(5000);
		   
		   
		 //  driver.navigate().back();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
