package PHP_AUTOMATION.php_travels;
import java.io.FileInputStream;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Base
{
		public static WebDriver driver;
		public static Properties prop = new Properties();
		static Logger L=Logger.getLogger("Base");
		
		
	 public static  void Browser() throws Exception
   {

			PropertyConfigurator.configure("C:\\New folder2\\php_travels\\data.properties");
			System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver_win32 (1)\\chromedriver.exe");	
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			FileInputStream f1=new FileInputStream("C:\\New folder2\\php_travels\\attribute.properties");
			prop.load(f1);
			driver.get(prop.getProperty("URL"));	
			
   }
	
}
