package testngfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Depend_On_Methods {
	WebDriver driver;

  @Test(dependsOnMethods = "method2")
  public void method1() {
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  @Test
  public void method2() {
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
