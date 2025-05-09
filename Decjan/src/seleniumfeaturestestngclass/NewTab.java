package seleniumfeaturestestngclass;

import org.testng.annotations.Test;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
public class NewTab {
	WebDriver driver;
  @Test
  public void tabs() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[normalize-space()='JAVA']")).click();
	  driver.close();
	  //driver.switchTo().window(tabs.get(0));
	  
  }
  @Test
  public void newtab() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	 // driver.switchTo().newWindow(WindowType.TAB);                   //-other tab open-
	  				//or
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  Thread.sleep(2000);
	  driver.navigate().to("https://www.seleniumlearn.com");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
