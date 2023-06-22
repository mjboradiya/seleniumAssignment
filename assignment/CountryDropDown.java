package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CountryDropDown {

	public static void main(String[] args) {

		System.setProperty(" webdriver.chrome.driver " , "D:\\\\cromedriver\\\\LICENSE.chromedriver\\");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/newtours/register.php ");

		
		driver.manage().window().maximize();
		
		WebElement Country = driver.findElement(By.name("country"));
		Country.click();
		
		//Select Country1= new Select(driver.findElement(By.name("country")));

		//if(Country1.isMultiple()){
			
			//Country1.selectByValue("INDIA");
		//}
		
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("INDIA");

	}

}
