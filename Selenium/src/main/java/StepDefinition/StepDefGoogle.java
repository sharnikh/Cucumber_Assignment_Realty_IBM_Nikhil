package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefGoogle {
	

@Given("^Navigate to Google Search Application$")
public void navigate_to_Google_Search_Application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(2500);

	driver.get("https://www.google.com/");
	

	driver.manage().window().maximize();
	System.out.println("chrome opened");
	Thread.sleep(2500);
}


@When("^i enter Search keyword \"([^\"]*)\"$")
public void i_enter_Search_keyword(String arg1) throws Throwable {
	System.out.println("i enter Search keyword");
    
}

@When("^i enter Search keyword$")
public void i_enter_Search_keyword() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("i enter Search keyword");
    
}

@Then("^Click on first search result$")
public void click_on_first_search_result() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Click on first search result");
    
}

@Then("^Close browser$")
public void close_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Close browser");
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	Thread.sleep(2500);
	driver.close();
	
	
    
}



}
