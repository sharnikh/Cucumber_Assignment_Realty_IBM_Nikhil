package SeleniumTrainingDay3;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;




public class TestNG_Dataprovider {
	/*@Test(dependsOnMethods = "testMethod3")
public void testMethod1() {
		
		System.out.println("Inside my Test ng method testMethod1");
		
	}*/

	  @Test(dataProvider = "ABC")
	  public void testMethod2 (String sValue,int sNumb ) {
	  
	  System.out.println("Inside my Test ng method testMethod2 with value ="+sValue);
	  System.out.println("Inside my Test ng method testMethod2 with number ="+sNumb);
	  
	  }
	  
	  @Test 
	  public void testMethod3() {
	  
	  System.out.println("Inside my Test ng method testMethod3");
	  
	  }
	  
	  @DataProvider (name="ABC")
	  public Object[][] dpMethod(){
		  return new Object [][] {{"1st value",1},{"2nd value",2}};
		  
	  }
	  
	  }
	 
