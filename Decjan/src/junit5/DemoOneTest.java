package junit5;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoOneTest {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
        @Disabled
	    @Test
	    void test1() {
		driver.get("https://www.google.com");
	    }
		@Test
		void test2() {
			driver.get("https://www.swiggy.com");
		}
		@Ignore
		@Test
		void test3() {
			driver.get("https://www.facebook.com");
		}
		@Test
		void test4() {
			driver.get("https://www.amazon.com");
		}
		@Test
		void test5() {
			driver.get("https://www.myntra.com");
		}
		@Test
		void test6() {
			driver.get("https://www.firstcry.com");
		}
	

}
