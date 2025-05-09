package seleniumfeaturestestngclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class Scrolldown_Scrollup_IdentifierLocatorElement1 {
	WebDriver driver;
//scrolldown
	@Test
  public void scrolldown() throws InterruptedException {
	  driver.get("https://www.selenium.dev");
	  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	  JavascriptExecutor jse = ( JavascriptExecutor)driver;
	  jse.executeScript("scroll(0,3500)");
	  Thread.sleep(3000);
	  //driver.findElement(By.xpath("//a[normalize-space()="releases").click();  -----exception: elementclickintercepted
  }
//scrollup
	@Test
	  public void scrollup() throws InterruptedException {
		  driver.get("https://www.selenium.dev");
		  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		  JavascriptExecutor jse = ( JavascriptExecutor)driver;
		  jse.executeScript("scroll(45,0)");
		  Thread.sleep(3000);
	}
//locatorelement
	@Test
	  public void locatorelement() throws Exception {
		  driver.get("https://www.selenium.dev");
		  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		  {
		  WebElement element = (WebElement)
				  driver.findElement(By.xpath("//a[normalize-space()='releases']"));
		  Coordinates coordinate = ((Locatable)element).getCoordinates();
		  coordinate.onPage();
		  coordinate.inViewPort();
	      }
		  driver.findElement(By.xpath("//a[normalize-space()='releases']")).click();
	  }
	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
