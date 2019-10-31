package PHP_AUTOMATION.php_travels;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PHP_AUTOMATION.php_travels.Base;
import PHP_AUTOMATION.php_travels.Login_Page;

public class Test2 extends Login_Page {
	
	
	Base b2=new Base();
	
	@Test
	public void Before() throws Exception
  {
		b2.Browser();
		login();
  }
	
	@AfterTest
	public void close() throws Exception
  {
		driver.close();
  }
	

}
