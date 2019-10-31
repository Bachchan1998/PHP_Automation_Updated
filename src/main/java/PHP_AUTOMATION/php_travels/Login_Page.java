package PHP_AUTOMATION.php_travels;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

	public class Login_Page extends Base 
{
	static By my_account =	By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	static By login    = By.xpath("//a[@class='dropdown-item active tr']");
	static By email	 =  By.xpath("//input[@placeholder='Email']");
	static By password = By.xpath("//input[@placeholder='Password']");
	static By login_button=By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
	
		public static void login() throws IOException, Exception
	{	
		PropertyConfigurator.configure("C:\\New folder2\\php_travels\\data.properties");
		driver.findElement(my_account).click();
		driver.findElement(login).click();
		driver.findElement(email).sendKeys(prop.getProperty("Email"));
		driver.findElement(password).sendKeys(prop.getProperty("Pwd"));
		driver.findElement(login_button).click();
		L.info("LOGIN PAGE");
		
		
// SCREEN SHOT
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\SCREEENSHOT Automation\\Pic1.png"));
		
		

// TO VERIFY THE RESULT		  
			
		   String Verify=driver.findElement(By.xpath("//h3[@class='text-align-left']")).getText();
	       System.out.println(Verify);
	       if(Verify.equalsIgnoreCase(prop.getProperty("RName")))
	       {
	    	   System.out.println("PASS");
	    	   
	       }
	       else
	       {
	    	   System.out.println("FAIL");
	    	   
	       }	

		
	}
	
	
}

