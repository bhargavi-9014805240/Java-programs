package javaprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserMethods { 
	static WebDriver driver;
	public static void main(String[] args) {
		
	
	driver = new ChromeDriver( );
	driver = new FirefoxDriver( );
    driver = new EdgeDriver( );
	driver = new SafariDriver( );
	}

}