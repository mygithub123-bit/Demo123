package IEpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NewIE_test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\IE_Driver\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		//InternetExplorerDriver  driver = new InternetExplorerDriver();
		 driver.get("http://demoqa.com");
		 }

	}


