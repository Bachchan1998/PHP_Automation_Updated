package PHP_AUTOMATION.php_travels;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Reg_Page extends Base 

{
	static By my_account =	By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	static By sign_up    = By.xpath("//a[@class='dropdown-item tr']");
	static By Fname =  By.xpath("//input[@placeholder='First Name']");
	static By Lname =  By.xpath("//input[@placeholder='Last Name']");
	static By M_Number = By.xpath("//input[@placeholder='Mobile Number']");
	static By Email = By.xpath("//input[@placeholder='Email']");
	static By Password = By.xpath("//input[@placeholder='Password']");
	static By C_Password = By.xpath("//input[@placeholder='Confirm Password']");
	static By SignUp_Button=By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']");
	
	

	public static void Register() throws Exception
 {
		PropertyConfigurator.configure("C:\\New folder2\\php_travels\\data.properties");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(my_account).click();
		driver.findElement(sign_up).click();
		driver.findElement(Fname).sendKeys(prop.getProperty("Fn"));
		driver.findElement(Lname).sendKeys(prop.getProperty("Ln"));
		driver.findElement(M_Number).sendKeys(prop.getProperty("Mnum"));
		driver.findElement(Email).sendKeys(prop.getProperty("Email"));
		driver.findElement(Password).sendKeys(prop.getProperty("Pwd"));
		Thread.sleep(1000);
		driver.findElement(C_Password).sendKeys(prop.getProperty("Cpwd"));
		//driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		driver.findElement(SignUp_Button).sendKeys(Keys.ENTER);
		L.info("REGISTRATION PAGE");
		

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
