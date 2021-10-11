package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDefRealtyAssignment {
	
	public static WebDriver driver;
	

@Given("^Navigate to Realty realestate URL$")
public void navigate_to_Realty_realestate_URL() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(2500);

	driver.get("http://realty-real-estatem1.upskills.in/");
	

	driver.manage().window().maximize();
	System.out.println("Real Estate site opened");
	Thread.sleep(2500);
}

@When("^I  click on login/Register button$")
public void i_click_on_login_Register_button() throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	
	driver.findElement(By.xpath("//*[text()=' Log In / Register']")).click();
}

@Then("^Login Screen is displayed$")
public void login_Screen_is_displayed() throws Throwable {
	
	
	Thread.sleep(2500);
	
	boolean bool;
	
	bool = driver.findElement(By.xpath("//*[text()='Log In']")).isDisplayed();
	
	if (bool == true) 
	{
		System.out.println("Login Screen is displayed"); 
	}
	else
	{
		System.out.println("Login Screen is not displayed"); 
	}
}

@Then("^Click on Register Tab$")
public void click_on_Register_Tab() throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	
	
	Thread.sleep(2500);
	
	driver.findElement(By.xpath("//*[text()='Register']")).click();
	System.out.println("Register button is clicked");
}


@Then("^Registration Screen is displayed$")
public void registration_Screen_is_displayed() throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	
	boolean bool;
	
	bool = driver.findElement(By.xpath("//*[text()='Register']")).isDisplayed();
	
	if (bool == true)
	{
		System.out.println("Register screen is displayed");
	}
	else
	{
		System.out.println("Register screen is not displayed");
	}
}

@When("^Enter valid credentials \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\"$")
 public void enter_valid_credentials(String arg1, String arg2, String arg3) throws Throwable {
	 //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	
	
	driver.findElement(By.id("email")).sendKeys(arg1);
	Thread.sleep(2500);
	driver.findElement(By.id("first-name")).sendKeys(arg2);
	Thread.sleep(2500);
	driver.findElement(By.id("last-name")).sendKeys(arg3);
	Thread.sleep(2500);
}

/*
 * @Then("^Enter valid credentials$") public void enter_valid_credentials()
 * throws Throwable {
 * 
 * }
 */

@Then("^Credentials are entered$")
public void credentials_are_entered() throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	
	
	System.out.println("Credentials are entered");
}



@Then("^Click on Register button$")
public void click_on_Register_button() throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	
	
	driver.findElement(By.name("submit")).click();
	System.out.println("Register button is clicked");
}

@Then("^Registration successful$")
public void registration_successful() throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	
	//div[@class = 'notification success closeable']
	String regval;
	regval = driver.findElement(By.xpath("//div[@class = 'notification success closeable']")).getText();
	
	
    String s2 = "successfully registered";

    boolean bool;
    bool = regval.contains(s2);
    
   if (bool == true)
   {
	System.out.println("Registration Successful");
   }

   else
	
   {
      System.out.println("Registration not Successful");

   }
}

@Then("^Enter login Credentials \"([^\"]*)\",\"([^\"]*)\"$")
public void enter_login_Credentials(String arg1, String arg2) throws Throwable {
    
	driver.findElement(By.id("user_login")).sendKeys(arg1);
	driver.findElement(By.id("user_pass")).sendKeys(arg2);
	
	Thread.sleep(2500);
    
}

@Then("^Click on Sign in$")
public void click_on_Sign_in() throws Throwable {
	
	driver.findElement(By.name("login")).click();
	
}

@Then("^Profile is displayed$")
public void profile_is_displayed() throws Throwable {
    System.out.println("Profile is displayed");
}


@Then("^Click on Lost Your Password$")
public void click_on_Lost_Your_Password() throws Throwable {
	
	driver.findElement(By.xpath("//*[text()=' Lost Your Password?']")).click();
	
	boolean bool ;
	bool = driver.findElement(By.xpath("//*[text()='Lost Password']")).isDisplayed();
	
	if (bool==true)
		System.out.println("Password page is displayed");
	else
		System.out.println("Password page is not displayed");
	   
}

@Then("^Enter email \"([^\"]*)\"$")
public void enter_email(String arg1) throws Throwable {
	
	driver.findElement(By.id("user_login")).sendKeys(arg1);
   
}

@Then("^Click on Reset Password$")
public void click_on_Reset_Password() throws Throwable {
	driver.findElement(By.name("submit")).click();
	
	 System.out.println("Reset link sent");
    
}

@Then("^Enter Password \"([^\"]*)\"$")
public void enter_Password(String arg1) throws Throwable {
    System.out.println("Password is reset");
    
}

@Then("^Enter password in repeat password box \"([^\"]*)\"$")
public void enter_password_in_repeat_password_box(String arg1) throws Throwable {
	System.out.println("Password is reset");
}

@Then("^click on Reset$")
public void click_on_Reset() throws Throwable {
	System.out.println("Password is reseted");
   
}



}
