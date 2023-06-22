package assignmentframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testngweb {

	public static void main(String[] args) {
		System.setProperty(" webdriver.chrome.driver " , "D:\\cromedriver\\LICENSE.chromedriver\\");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.google.com");
		
		driver.manage().window().maximize();
	}

}
