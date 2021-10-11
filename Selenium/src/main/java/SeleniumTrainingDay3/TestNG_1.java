package SeleniumTrainingDay3;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class TestNG_1 {
	@Test(dependsOnMethods = "testMethod3")
public void testMethod1() {
		
		System.out.println("Inside my Test ng method testMethod1");
		
	}
	
	
	

	/*
	 * @BeforeSuite public void beforeSuite() {
	 * System.out.println("Inside before Suite"); }
	 * 
	 * @BeforeTest public void beforetest() {
	 * System.out.println("Inside before test"); }
	 * 
	 * @AfterTest public void aftertest() { System.out.println("Inside after test");
	 * }
	 * 
	 * @BeforeClass public void beforeclass() {
	 * System.out.println("Inside before class"); }
	 * 
	  @AfterClass public void afterclass() {
	 * System.out.println("Inside after class"); }
	 * 
	 * @BeforeMethod public void beforemethod() {
	 * System.out.println("Inside before method"); }
	 * 
	 * @AfterMethod public void aftermethod() {
	 * System.out.println("Inside after method"); }
	 * 
	 * @AfterSuite public void afterSuite() {
	 * System.out.println("Inside after Suite"); }
	 */
	  
	  @Parameters({"browser","url"})
	  
	  @Test() 
	  public void testMethod2(String br,String url) {
	  
	  System.out.println("Inside my Test ng method testMethod2");
	  
	  System.out.println("Browser is ="+br);
	  System.out.println("URL is ="+url);
	  
	  }
	  @AfterClass 
	  public void afterclass() {
			  System.out.println("Inside after class"); 
			  }
	  
	  @Test 
	  public void testMethod3() {
	  
	  System.out.println("Inside my Test ng method testMethod3");
	  
	  }
	 }
