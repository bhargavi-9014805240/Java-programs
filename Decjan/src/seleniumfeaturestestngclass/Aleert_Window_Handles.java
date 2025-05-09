package seleniumfeaturestestngclass;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Aleert_Window_Handles {
	WebDriver driver;
 
//Alert Ok(popup msg)
	@Test
  public void alertok() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
  }
 
//alert cancel(popup msg)
	@Test
	  public void alertcancel() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  Thread.sleep(2000);
		  driver.switchTo().alert().dismiss();
	  }

//prompt dialog box-given input text either ok 0r cancel
	@Test
	  public void alertsendtextokcancel() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  /*  driver.switchTo().alert().sendKeys("hethvi");  
		  driver.switchTo().alert().accept();*/
		           //or
		  Alert a=driver.switchTo().alert();
		        a.sendKeys("bhargavi");
		        a.accept();
		  
	  }
	
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }
  

}
