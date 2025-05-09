package seleniumfeaturestestngclass;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Selected_Webelement_Screenshot {
	WebDriver driver;
  @Test
  public void TakeScreenShot() throws IOException {
	  driver.get("https://www.techlearn.in/admin");
	  WebElement I = driver.findElement(By.xpath("//input[@id='user_login']"));
	  File f = I.getScreenshotAs(OutputType.FILE);
	  Files.copy(f, new File("D:\\Decjan\\screenshots\\UE.png"));
	  
	  /*WebElement search = driver.findElement(By.name("q"));
	  search.sendKeys("TestNG");*/
	  //driver.findElement(By.name("q")).sendKeys("TestNG");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
