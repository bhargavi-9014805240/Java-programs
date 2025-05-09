package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class ExecutionOrder {
	WebDriver driver;
  @Test
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  @Test
  public void techlearn() {
	  driver.get("https://www.techlearn.in");
  }
  @Test
  public void seleniumdev() {
	  driver.get("https://www.selenium.dev");
  }
  @Test
  public void peachmode() {
	  driver.get("https://www.peachmode.com");
  }
  @Test
  public void pinterest() {
	  driver.get("https://in.pinterest.com");
  }
  @Test
  public void snapchat() {
	  driver.get("https://www.snapchat.com");
	  
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
