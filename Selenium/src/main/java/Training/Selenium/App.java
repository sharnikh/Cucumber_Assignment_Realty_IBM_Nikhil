package Training.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


import org.openqa.selenium.Keys;

/**
 * Hello world!
 *
 */
public class App 
{
   

	public static void main( String[] args ) throws InterruptedException{
    
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		System.out.println((driver.getTitle()));
		Thread.sleep(2500);
		String text = "Nikhil";
		
		WebElement inputbox = driver.findElement(By.name("q"));
		inputbox.sendKeys("Selenium");
		Thread.sleep(2500);
		
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2500);
		
		//driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md'][text()='Selenium']")).click();
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md'][text()='Selenium']")).click();
		
		
		Thread.sleep(2500);
		
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'automates browsers')]")).getText());
		
		Thread.sleep(2500);
		
		List<WebElement> lists = driver.findElements(By.xpath(text));
		
		
		
		for(WebElement we:lists) {
			
			
			
			System.out.println(we);
		}
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
    }	
		
    }

