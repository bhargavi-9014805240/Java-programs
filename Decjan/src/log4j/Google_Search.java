package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_Search {
	WebDriver driver;
  @Test
  public void search() throws InterruptedException {
	  Logger log = Logger.getLogger("Google Search");
	  PropertyConfigurator.configure("log4j.properties");
	  driver = new ChromeDriver();
	  log.info("chrome browser launched");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  log.info("wait for 2seconds");
	  driver.get("https://www.google.com");
	  log.info("navigate to the google application");
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
	  log.info("in google search text enter selenium");
	  
	  
  }
}
