package IEpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEBrowserExecution {

	public static void main(String[] args) {
	
		
		//System.setProperty("webdriver.ie.driver", "D:\\IEdriver32bit\\IEDriverServer.exe");
		
		System.setProperty("webdriver.ie.driver", "D:\\IE_Driver\\IEDriverServer.exe");
		
		//System.setProperty("webdriver.ie.driver", "D:\\IEdriver\\IE.exe");
		
	//	WebDriver driver=new InternetExplorerDriver();
		
		//driver.get("https://www.google.com/?gws_rd=ssl");
		
		//driver.get("http://www.learn-automation.com");
		
		//WebDriver driver1=new InternetExplorerDriver();
		//driver.get("http://www.learn-automation.com");
		
		//System.out.println(driver.getTitle());
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        // this line of code is to resolve protected mode issue capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        WebDriver driver=new InternetExplorerDriver();
        driver.get("http://www.learn-automation.com");
		
		  

	}

}
