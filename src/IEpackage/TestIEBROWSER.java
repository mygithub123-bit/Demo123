package IEpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestIEBROWSER {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\IE_Driver\\IEDriverServer.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		 
		 // Settings to Accept the SSL Certificate in the Capability object
		// capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
		// InternetExplorerDriver driver = new InternetExplorerDriver(capabilities); 
	
     WebDriver driver=new InternetExplorerDriver();
     
   //  driver.get("https://accounts.google.com/signin");
     
     driver.get("https://www.google.com/?gws_rd=ssl");
	}

}
