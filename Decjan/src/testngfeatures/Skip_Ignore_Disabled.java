package testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Skip_Ignore_Disabled {
	WebDriver driver;
//without priority 1st execution then after priority execution
//enabled = false - not run
//enabled = false -  run
  @Test
  public void firstcry() {
	  driver.get("https://www.firstcry.com");
  }
  @Test(priority=0,enabled = false)
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test(priority=1)
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  @Test(priority=3)
  public void techlearn() {
	  driver.get("https://www.techlearn.in");
  }
  @Test(priority=2,enabled = true)
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
