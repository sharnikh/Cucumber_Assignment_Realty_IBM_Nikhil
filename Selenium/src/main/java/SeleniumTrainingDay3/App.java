package SeleniumTrainingDay3;
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

		driver.get("https://artoftesting.com/samplesiteforselenium");

		driver.manage().window().maximize();

		System.out.println((driver.getTitle()));
		Thread.sleep(2500);
		String text = "Nikhil";
		
		WebElement selectDD = driver.findElement(By.id("testingDropdown"));
		Select Sel = new Select(selectDD); // select ios used beacuse select tag is there
		Sel.selectByIndex(2); // manual testing
		Sel.selectByValue("Performance");
		Sel.selectByVisibleText("Automation Testing");
		List<WebElement> listSearch = Sel.getOptions();
		for(WebElement we:listSearch)
		{
			System.out.println("TEXT="+we.getText());
			System.out.println("Value="+we.getAttribute("value"));
		}
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
    }	
		
    }

