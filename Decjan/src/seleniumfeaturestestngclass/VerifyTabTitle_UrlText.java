package seleniumfeaturestestngclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabTitle_UrlText {
	WebDriver driver;
  @Test
  public void verifytabtext() {
	  driver.get("https://www.google.com/");
	  String exptabtext = "Google";
	  System.out.println("Expected tab text is : "+exptabtext);
	  String acttabtext = driver.getTitle();
	  System.out.println("actualtabtext is : "+acttabtext);
	  Assert.assertEquals(acttabtext,exptabtext);
	  
  }
  @Test
  public void verifyappurl() {
	  driver.get("https://www.google.com");
	  String expurl = "https://www.google.com/";
	  String acturl = driver.getCurrentUrl();
      Assert.assertEquals(acturl,expurl);
	  
  }
  @Test
  public void verifyapptext() {
	  driver.get("https://www.google.com");
	  String exptabttext = "About";
	  String acttabttext = driver.findElement(By.xpath("//*[text()='About']")).getText();
      Assert.assertEquals(acttabttext,exptabttext);  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
