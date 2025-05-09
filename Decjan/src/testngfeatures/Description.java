package testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Description {
	WebDriver driver;
  @Test(description="zomato")
  public void testcase0() {
	  driver.get("https://www.zomato.com");
  }
  @Test(description="google")
  public void testcase3() {
	  driver.get("https://www.google.com");
  }
  @Test(description="twitter")
  public void testcase4() {
	  driver.get("https://www.x.com");
  }
  @Test(description="techlearn")
  public void testcase2() {
	  driver.get("https://www.techlearn.in");
  }
  @Test(description="seleniumdev")
  public void testcase5() {
	  driver.get("https://www.selenium.dev");
  }
  @Test(description="peachmode")
  public void testcase1() {
	  driver.get("https://www.peachmode.com");
  }
  @Test(description="firstcry")
  public void testcase6() {
	  driver.get("https://www.firstcry.com");
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
