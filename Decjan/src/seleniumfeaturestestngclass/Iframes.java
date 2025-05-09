package seleniumfeaturestestngclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Iframes {
	WebDriver driver;
  @Test
  public void framesfeatures() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	/*  WebElement obj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));                 //-[xpath of id or name(attribute name)=attribute value method-
	  driver.switchTo().frame(obj);*/           
	              //or 
	  driver.switchTo().frame("iframeResult");                                               //-id or name attribute value-
	              //or
	  //driver.switchTo().frame(2); 																//in inspect ctrl+f enter iframe exactly match that found(tryit)
     driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
     driver.switchTo().alert().accept();
     Thread.sleep(1000);
     driver.switchTo().defaultContent();													//outer of the  box
     //driver.switchTo().parentFrame();  															
  				//or
      driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();  					//parentframe
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
