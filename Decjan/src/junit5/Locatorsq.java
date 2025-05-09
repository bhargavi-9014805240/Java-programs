package junit5;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Locatorsq {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

//locators:id(),name(),className()
	
	@Disabled     //disabled means not execute
	@Test
	void techlearnlogin() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys("Balaji");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("asdf");
		Thread.sleep(2000);
		driver.findElement(By.name("wp-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("input")).sendKeys("Hethvika");
		Thread.sleep(2000);
		driver.findElement(By.id("user_pass")).sendKeys("Hethvika");
		Thread.sleep(2000);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);
	}	
		
//locators:cssSelector() we are using either id()[start with #] or class()[start with dot]
		
	@Disabled
	    @Test
		void techlearnlogincss() throws InterruptedException {
			driver.get("https://www.techlearn.in/admin");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#user_login")).sendKeys("Bhargavi");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#user_pass")).sendKeys("asdfedfh");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#wp-submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#user_login")).clear();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".input")).sendKeys("Hethvika");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#user_pass")).sendKeys("qwe");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#5wp-submit")).click();
			Thread.sleep(2000);
	}
			
//locators:	linkText()[take complete text], partialLinkText()[take any half text or any word]
	
	        @Disabled
			@Test
				void linktextpartiallinktext() throws InterruptedException {
					driver.get("https://www.techlearn.in/admin");
					Thread.sleep(2000);
				   // driver.findElement(By.linkText("Lost your password?")).click();
					Thread.sleep(2000);
				    //driver.findElement(By.partialLinkText("your")).click();
					Thread.sleep(2000);
	
					 WebElement lyp = driver.findElement(By.partialLinkText("your"));
					 lyp.click();
					Thread.sleep(2000);
			}
					
//locators:tagName()[totallinks][start with anchor tag][we verify imgs,links,headings & print syso]
			
	                @Disabled
					@Test
					 void totallinks() throws InterruptedException {
					driver.get("https://www.redmine.org");
					Thread.sleep(2000);	
					List<WebElement>totallinks=driver.findElements(By.tagName("img"));
					System.out.println("total images on redmine = "+ totallinks.size());
					Thread.sleep(2000);
							
		
	        }
					
					
//locators:xpath classified into 2types 1.fullxpath or absolute xpath[start with single slash]
					
	                @Disabled
	                @Test
					void fullxpath() throws InterruptedException {
						driver.get("https://www.techlearn.in/admin");
						Thread.sleep(2000);
					    driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("Satha");
						Thread.sleep(2000);
			}
					
//2.xpath or relative xpath[start with double slash][realtime]
					
	                @Disabled
					@Test
					void xpath() throws InterruptedException {
						driver.get("https://www.techlearn.in/admin");
						Thread.sleep(2000);
						driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("Balaji");
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("asdf");
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
						Thread.sleep(2000);
			}
//xpath in index method:[6]
	                @Disabled
					@Test
					void xpathindex() throws InterruptedException {
						driver.get("https://www.amazon.in/home");
						Thread.sleep(2000);
						driver.findElement(By.xpath("((//*[@class=\"nav-line-2\"] )[1]")).click();
						Thread.sleep(2000);	
					}

//index1
					
	                @Disabled
					@Test
					void xpathindex1() throws InterruptedException {
						driver.get("https://www.firstcry.com/home");
						Thread.sleep(2000);
						driver.findElement(By.xpath("(//*[@class=\"anch\"])[8]")).click();
						Thread.sleep(2000);
}	
	                
//parent of current node with index no.
	                @Disabled
	                @Test
					void xpathparentindex() throws InterruptedException {
						driver.get("https://www.firstcry.com/home");
						Thread.sleep(2000);
						driver.findElement(By.xpath("(//*[@class=\"anch\"]//parent::span)[9]")).click();
						Thread.sleep(2000);
}	

//text():[take full text]
	                
	                @Disabled
					@Test
					void xpathtext() throws InterruptedException {
						driver.get("https://www.firstcry.com/home");
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[text( )=' Register']")).click();
						Thread.sleep(2000);
}
					
//contains:[take any word]
	                @Disabled
					@Test
					void xpathcontains() throws InterruptedException {
						driver.get("https://www.firstcry.com/home");
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[contains(text( ),'Regi')]")).click();
						Thread.sleep(2000);
}

//normalize-space:[take with space text]
	                @Test
					void xpathnormalizespace() throws InterruptedException {
						driver.get("https://www.irctc.co.in");
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[normalize-space( )='REGISTER']")).click();
						Thread.sleep(2000);
}
					
					}

//normal we take attribute name & attribute value without space