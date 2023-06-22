package assignmentframework;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class junitTest {
	private static ChromeDriver driver;
	WebElement element;
	
	@BeforeClass
	public static void openBrowser(){
	    driver = new ChromeDriver() ;
	}

	@Test
	void test() {
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	    driver.get("https://www.facebook.com/");
	    Assert.assertEquals("facebook login page", driver.getTitle());
	    System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@AfterClass
	public static void closeBrowser(){
	    driver.quit();
	}
	}


