package auto1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		  System. setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		 
		  ChromeDriver driver = new ChromeDriver();
		 

		//FirefoxDriver driver = new FirefoxDriver();

		//driver.get("https://www.google.com/");
		  
		  
		  
		 // System.setProperty("webdriver.gecko.driver","C:\\your_directory\\geckodriver.exe");

		   // WebDriver driver = new FirefoxDriver();

		    driver.manage().window().maximize();

		    //String url = "https://accounts.google.com";
		    
		  //  String url ="https://mail.google.com/";

		    driver.get("https://mail.google.com/mail/u/0/#inbox");
		    
		    Thread.sleep(12000);

		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		    
		   // String ele=driver.findElement(By.xpath("//img[@class='gb_ma']")).getText();
			//System.out.println(ele);
		    List<WebElement> a = driver.findElements(By.xpath("//span[@class='bA4']"));
			System.out.println(a.size());
			            for(int i=0;i<a.size();i++){
			                System.out.println(a.get(i).getText());
			                if(a.get(i).getText().equals("welcome")){  // if u want to click on the specific mail then here u can pass it
			                    a.get(i).click();
			                }
			            }
			
	}
}
		    
		    
		    

		    /*WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));

		    email_phone.sendKeys("manojkumard100@gmail.com");

		    driver.findElement(By.id("identifierNext")).click();

		    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

		    WebDriverWait wait = new WebDriverWait(driver, 20);

		    wait.until(ExpectedConditions.elementToBeClickable(password));

		    password.sendKeys("Godisgod");

		    driver.findElement(By.id("passwordNext")).click();
		    
		    WebDriverWait wait1 = new WebDriverWait(driver, 20);
		    
		    driver.findElement(By.className("gb_b")).click();
		    
		    WebDriverWait wait2 = new WebDriverWait(driver, 20);
		    
		    driver.findElement(By.xpath("//*[@id=\"gb23\"]/span[1]")).click();
		    
		    List<WebElement> a = driver.findElements(By.xpath("//*[@class='yW']/span"));
		    System.out.println(a.size());
		                for(int i=0;i<a.size();i++){
		                    System.out.println(a.get(i).getText());
		                    if(a.get(i).getText().equals("welcome")){  // if u want to click on the specific mail then here u can pass it
		                        a.get(i).click();
		                    }
		                }
		                
		    WebElement Link= driver.findElement(By.linkText("Please click here to validate your account."));
		    
		    Link.click();
		    
		    wait.until(ExpectedConditions.elementToBeClickable(Link));
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		               // driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

	}
	*/

//}
