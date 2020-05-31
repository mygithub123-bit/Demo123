package auto1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class test1 {
	
	public static void main(String...vvvv) {
		
		
		 System. setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		 
		  ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://mail.google.com/");
		
		WebDriverWait wait= new WebDriverWait(driver, 60);

		   WebElement userElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierId")));                                                           
		   userElement.click();                                                                                                                                           
		   userElement.clear();                                                                                                                                           
		   userElement.sendKeys("tester4wifispark@gmail.com"); 
		   
		   

		   WebElement identifierNext = wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierNext")));                                                      
		   identifierNext.click();                                                                                                                                        

		   WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));                                                         
		   passwordElement.click();                                                                                                                                       
		   passwordElement.clear();                                                                                                                                       
		   passwordElement.sendKeys("Letmein122");                                                                                                  

		   WebElement passwordNext = wait.until(ExpectedConditions.elementToBeClickable(By.id("passwordNext")));                                                          
		   passwordNext.click();                                                                                                                                          

		   /*WebElement composeElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@role='button' and (.)='Compose']")));                            
		   composeElement.click();      */    
		   
		   
		 //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'welcome6')]")));                                                   
		   List<WebElement> a= wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//span[@class='bA4']"))));  
		   
		  // List<WebElement> a = driver.findElements(By.xpath("//*[@class='yW']/span"));
           System.out.println(a.size());
           for (int i = 0; i < a.size(); i++) {
               System.out.println(a.get(i).getText());
               if (a.get(i).getText().equals("welcome")) //to click on a specific mail.
                   {                                           
                   a.get(i).click();
               }
           }
		   driver.quit();
		       
		       
		   
		   

	

}
	}


