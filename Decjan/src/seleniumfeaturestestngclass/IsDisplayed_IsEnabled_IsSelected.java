package seleniumfeaturestestngclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsDisplayed_IsEnabled_IsSelected {
	WebDriver driver;
 
//isDisplayed:visible or not	
	@Test
  public void isDisplayed() {
	  driver.get("https://www.techlearn.in/admin");
	  boolean lyp = driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).isDisplayed();
	  if(lyp==true)
	  {
		  System.out.println("lost ur password link is present in login page");
		  driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
	  }
	  else
	  {
		  System.out.println("lost ur password link is not present in login page");
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }



//isenabled method:webelement is enable or disable
@Test
public void isEnabled() {
	  driver.get("https://www.techlearn.in/admin");
	  boolean usrmail = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
	  if(usrmail==true)
	  {
		  System.out.println("usrname or email textfiles is enabled to the enter usrname");
		  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Bhargavi");
	  }
	  else
	  {
		  System.out.println("usrname or email textfiles is not enabled to the enter usrname");
	  }
}
@Test
public void isSeleted() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  boolean checkbox = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
	  if(checkbox==true)
	  {
		  System.out.println("rememberme checkbox is selected");
		 
	  }
	  else
	  {
		  System.out.println("rememberme checkbox is not selected");
	  }

}
}

