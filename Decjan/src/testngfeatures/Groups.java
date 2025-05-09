package testngfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Groups {
	WebDriver driver;
  @Test(groups="bugtool")
  public void mantisbt() {
	  driver.get("https://www.mantisbt.org");
  }
  @Test(groups="govtexamapp")
  public void bankersadda() {
	  driver.get("https://www.bankersadda.com");
  }
  @Test(groups="social")
  public void instagram() {
	  driver.get("https://www.instagram.com");
  }
  @Test(groups="food")
  public void swiggy() {
	  driver.get("https://www.swiggy.com");
  }
  @Test(groups="bugtool")
  public void jira() {
	  driver.get("https://www.jira.com");
  }
  @Test(groups="social")
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(groups="bugtool")
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  @Test(groups="education")
  public void techlearn() {
	  driver.get("https://www.techlearn.in");
  }
  @Test(groups= {"food"})
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  @Test(groups="govexamapp")
  public void byjus() {
	  driver.get("https://byjusexamprep.com");
  }
  @Test(groups="education")
  public void seleniumdev() {
	  driver.get("https://www.selenium.dev");
  }
  @Test(groups="social")
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @Test(groups="bugtool")
  public void bugzilla() {
	  driver.get("https://www.bugzilla.org");
  }
  @BeforeTest(groups="food")
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
