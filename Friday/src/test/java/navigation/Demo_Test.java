package navigation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo_Test {
	WebDriver driver;
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
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
  @BeforeTest
  public void beforeTest() {
	    driver = new ChromeDriver();
  }
  

  @AfterTest
  public void afterTest() {
  }

}
