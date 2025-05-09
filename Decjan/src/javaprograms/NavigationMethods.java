package javaprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
 static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver( );
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https:www.techlearn.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}

}
