package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverSetup {
	static WebDriver driver = null ;
	public static WebDriver chromesetup() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  System.out.println("DriverSetupCompleted");
	return driver;
}
}
