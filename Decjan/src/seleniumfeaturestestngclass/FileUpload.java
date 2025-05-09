package seleniumfeaturestestngclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class FileUpload {
	WebDriver driver;
//file upioad or attach file or upload file
  @Test
  public void attachfile() throws InterruptedException {
	  driver.get("https://www.gangaaram-tech.com/registration/");
	  driver.findElement(By.xpath("//textarea[@id='textarea-23104650921']")).sendKeys("uploading my image");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='field-ioa3T81OSsEXwhP']")).sendKeys("C:\\Users\\HP\\Pictures\\Camera Roll\\Balaji.jpg");
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
