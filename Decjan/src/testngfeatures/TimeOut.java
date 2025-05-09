package testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TimeOut {

	WebDriver driver;
  @Test
  public void method1() {
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("techlearn.in");
	 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
	 driver.findElement(By.xpath("//span[@class='KTBKOe']")).click();
	 driver.findElement(By.xpath("//input[@id='msoczb']")).sendKeys("software institute");
  
  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
