package PHP_AUTOMATION.php_travels;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PHP_AUTOMATION.php_travels.Base;
import PHP_AUTOMATION.php_travels.Tour_Search;

public class Test5 extends Tour_Search
{
	Base b5=new Base();
	
	@Test
	public void Before() throws Exception
   {
		b5.Browser();
		TourSearch();
   }
	
	@AfterTest
	public void close() throws Exception
	{

		driver.close();
	}
	
}

