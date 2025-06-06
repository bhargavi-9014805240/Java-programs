package testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Priority_Order {
	WebDriver driver;
//based on priority no. execution
  @Test(priority=1)
  public void pinterest() {
  driver.get("https://www.pinterest.com");
  }
  @Test(priority=0)
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test(priority=2)
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  @Test(priority=4)
  public void techlearn() {
	  driver.get("https://www.techlearn.in");
  }
  @Test(priority=3)
  public void seleniumdev() {
	  driver.get("https://www.selenium.dev");
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
