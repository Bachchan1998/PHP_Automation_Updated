package PHP_AUTOMATION.php_travels;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PHP_AUTOMATION.php_travels.Base;
import PHP_AUTOMATION.php_travels.Reg_Page;

public class Test1 extends Reg_Page


{
	Base b1=new Base();
	
	@Test
	public void Before() throws Exception
	{
		b1.Browser();
		Register();	
	}
	
	@AfterTest
	public void close() throws Exception
	{	
		driver.close();
	}
	


}
