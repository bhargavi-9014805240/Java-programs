package seleniumfeaturestestngclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDown_Values {
	WebDriver driver;
  @Test
  public void selectdropdownoptions() throws InterruptedException {
	  driver.get("https://www.redmine.org/account/register");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("bhargavi@gmail.com");
	  Thread.sleep(2000);
	  Select lan = new Select(driver.findElement(By.xpath("//select[@id='user_language']")));
      //lan.selectByContainsVisibleText("Korean");
                   //or
      //lan.selectByVisibleText("Korean (한국어)");
                   //or
	  //lan.selectByValue("ko");
	               //or
	  lan.selectByIndex(27);
	  
  }
  @BeforeTest
  public void beforeTest() {
  driver = new ChromeDriver();
  driver.manage().window().maximize();

  }

}
