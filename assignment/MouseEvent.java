package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseEvent {

	public static void main(String[] args) {
		System.setProperty(" webdriver.chrome.driver " , "D:\\cromedriver\\LICENSE.chromedriver\\");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/newtours/register.php ");

		
		driver.manage().window().maximize();

	}

}
