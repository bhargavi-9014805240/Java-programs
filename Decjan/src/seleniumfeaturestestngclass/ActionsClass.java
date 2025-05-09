//Actions class
package seleniumfeaturestestngclass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
public class ActionsClass  {
	WebDriver driver;
	
//Rightclick
  @Test
  public void Rightclick() throws Exception {
	  driver.get("https://www.techlearn.in/code/");
	  Thread.sleep(1000);
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-2798\"]/a"))).build().perform();	  
  }
//Double Click
  @Test
  public void Doubleclick() throws Exception {
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  Thread.sleep(1000);
	  Actions act = new Actions(driver);
	  //act.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
	            //(or)
	  act.moveToElement(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).build().perform();
  }
//Drag & Drop
  @Test
  public void Draganddrop() throws Exception {
	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
	  Thread.sleep(1000);
	  Actions act = new Actions(driver);
	  WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
	  WebElement target = driver.findElement(By.xpath("//div[@id='div1']"));
	  act.dragAndDrop(source, target).build().perform();
  }
//Mouse over
  @Test
  public void Mouseover() throws Exception {
	  driver.get("https://www.techlearn.in/code/");
	  Thread.sleep(1000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Tutorials']"))).click().build().perform();
	  driver.findElement(By.xpath("//a[normalize-space()='Sikuli']")).click();
	            //(or)
	  //act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Tutorials']"))).click().build().perform();
  }
//Keyboard Functions
  @Test
  public void Keyboardfunctions() throws Exception {
	  driver.get("https://www.techlearn.in/admin/");
	  Thread.sleep(1000);
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.ENTER).build().perform();
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


