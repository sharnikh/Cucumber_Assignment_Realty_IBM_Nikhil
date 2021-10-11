package SeleniumTrainingDay3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSelenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		System.out.println((driver.getTitle()));
		Thread.sleep(2500);
		String text = "Nikhil";
		
		WebElement inputbox = driver.findElement(By.name("q"));
		//inputbox.sendKeys("Selenium");
		Thread.sleep(2500);
		
		Actions action = new Actions(driver);
		action.keyDown(inputbox,Keys.SHIFT);
		action.sendKeys(inputbox,"selenium");
		action.keyUp(inputbox,Keys.SHIFT);
		action.build().perform();
		Thread.sleep(2500);
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2500);
		
		
		System.out.println("Action performed");
		
		
		
	}

}
