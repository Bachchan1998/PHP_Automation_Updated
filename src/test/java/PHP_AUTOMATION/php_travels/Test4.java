package PHP_AUTOMATION.php_travels;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PHP_AUTOMATION.php_travels.Base;
import PHP_AUTOMATION.php_travels.Flight_Search;

public class Test4 extends Flight_Search {
	Base b4=new Base();
	
	@Test
	public void Before() throws Exception
	{
		b4.Browser();
		Flight_Search();
	}
	
	@AfterTest
	public void close() throws Exception
	{
		driver.close();
	}
	
	
}