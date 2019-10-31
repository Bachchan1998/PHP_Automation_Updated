package PHP_AUTOMATION.php_travels;

import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Flight_Search extends Base{
	
	static By Flight=By.xpath("//a[contains(@class,'text-center flights')]");
	static By location=By.xpath("//div[@id='s2id_location_from']");
	static By Enter_Loc1=By.xpath("//div[@id='s2id_location_from']//a[@class='select2-choice']");
	
	static By Destination=By.xpath("//div[@id='s2id_location_to']");
	static By Enter_Loc2=By.xpath("//div[@id='s2id_location_to']//a[@class='select2-choice']");
	
	static By Departure=By.xpath("//input[@id='FlightsDateStart']");
	static By Date=By.xpath("//div[7]//div[1]//div[1]//div[2]//div[33]");
	
	static By Adults=By.xpath("//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[3]//button[1]");
	static By Childs=By.xpath("//div[@id='flights']//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[2]//div[1]//span[3]//button[1]");
	static By Infants=By.xpath("//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//span[3]//button[1]");



	public void Flight_Search() throws Exception 
	{
		PropertyConfigurator.configure("C:\\New folder2\\php_travels\\data.properties");
		driver.findElement(Flight).click();

// SEARCH FLIGHT FIELD
		
		Thread.sleep(2000);
		driver.findElement(location).click();
		driver.findElement(Enter_Loc1).sendKeys(prop.getProperty("FLoc"));
		driver.findElement(Enter_Loc1).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(Enter_Loc1).sendKeys(Keys.ENTER);
			
// DESTINATION FIELD
		
		driver.findElement(Destination).click();
		driver.findElement(Enter_Loc2).sendKeys(prop.getProperty("DLoc"));
		driver.findElement(Enter_Loc2).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(Enter_Loc2).sendKeys(Keys.ENTER);
		
		
		
// DEPARTURE DATE FIELD
		
		driver.findElement(By.xpath("//input[@id='FlightsDateStart']")).click();
        driver.findElement(By.xpath("//div[7]//nav[1]//div[2]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'"+prop.getProperty("FMonth")+"')]")).click();
        for(int i = 1 ; i<=35 ; i++) {            
             String str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();            
             if(str1.equals("1")) {                
                 for(int j = i ; j<=35 ; j++) {                    
                     str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                        
                     if(str1.equals(prop.getProperty("Day"))) {                        
                         driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();                        
                         break;
                         }     
                 	}
             	}
        	}
                                 
// PASSANGERS FIELD
        
        driver.findElement(Adults).click();
        driver.findElement(Childs).click();
        driver.findElement(Infants).click();
        
// SEARCH BUTTON
        
        driver.findElement(By.xpath("//button[contains(@class,'btn-primary btn btn-block')]")).click();
        L.info("FLIGHT SEARCH MODULE");
        
// TO VERIFY THE RESULT
   
	     String Verify=driver.findElement(By.xpath("//h3[@class='heading-title']")).getText();
	     System.out.println(Verify);
	     if(Verify.equals(prop.getProperty("Name")))
	       {
	    	   System.out.println("PASS");
	    	   
	       }
	       else
	       {
	    	   System.out.println("FAIL");
	    	   
	       }	 	                          
	}	
}

