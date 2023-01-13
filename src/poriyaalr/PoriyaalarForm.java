package poriyaalr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoriyaalarForm {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ranganathan.c\\eclipse-workspace\\Selenium-\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://poriyaalar.com/#contact");
	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//indidual Name text box
		driver.findElement(By.id("name")).sendKeys("Ranganathan C");
		
		//mail text box
		driver.findElement(By.id("email")).sendKeys("ranganathchiti@gmail.com");
		
		//number txt box
		driver.findElement(By.id("number")).sendKeys("8807893180");
		
		//msg box
		driver.findElement(By.id("comment")).sendKeys("Pongal Wishes to All Poriyaalar Employees");
		Thread.sleep(2000);
		//scroll down
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scroll(0,2800)");
				Thread.sleep(2000);
				
				//submit
				driver.findElement(By.id("submit-contact-form")).click();
					
	}

}
