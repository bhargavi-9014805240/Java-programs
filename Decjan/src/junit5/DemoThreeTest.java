package junit5;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoThreeTest {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();  
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	     @Test
	     void google() {
		 driver.get("https://www.google.com");
	    }
		@Test
		void swiggy() {
			driver.get("https://www.swiggy.com");
		}
		@Test
		void fb() {
			driver.get("https://www.facebook.com");
		}
		@Test
		void amazon() {
			driver.get("https://www.amazon.com");
		}
		@Test
		void meesho() {
			driver.get("https://www.meesho.com");
		}
		@Test
		void firstcry() {
			driver.get("https://www.firstcry.com");
		}
	

}
