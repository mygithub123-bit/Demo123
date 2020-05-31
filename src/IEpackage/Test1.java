package IEpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\IE_Driver\\IEDriverServer.exe");
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.learn-automation.com");
		
		
		

		// Initialize InternetExplorerDriver Instance using new capability.
		

	}

}
