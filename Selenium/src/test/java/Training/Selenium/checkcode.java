package Training.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkcode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://realty-real-estatem1.upskills.in/");

		driver.manage().window().maximize();

		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//*[text()=' Log In / Register']")).click();
		
		boolean bool;
		
		bool = driver.findElement(By.xpath("//*[text()='Log In']")).isDisplayed();
		
		if (bool == true) 
		{
			System.out.println("Login Screen is displayed"); 
		}
		
		driver.findElement(By.xpath("//*[text()='Register']")).click();
		
		driver.findElement(By.id("email")).sendKeys("manzoor@gmail.com");
		Thread.sleep(2500);
		driver.findElement(By.id("first-name")).sendKeys("manzoor");
		Thread.sleep(2500);
		driver.findElement(By.id("last-name")).sendKeys("mehadi");
		System.out.println(driver.findElement(By.id("email")).getText());
		driver.findElement(By.name("submit")).click();
		String regval;
		
		regval = driver.findElement(By.xpath("//div[@class = 'notification success closeable']")).getText();
		
		
	    String s2 = "successfully registered";

	    
	    bool = regval.contains(s2);
	    

	    if (bool == true)
	        System.out.println("Registration Successfull");
	    else
	        System.out.println("Registration not successfull");
	    
		
	}

}
