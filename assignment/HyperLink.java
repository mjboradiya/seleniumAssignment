package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty(" webdriver.chrome.driver " , "D:\\cromedriver\\LICENSE.chromedriver\\");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.guru99.com/test/web-table-element.php ");

		driver.manage().window().maximize();
		
		
		WebElement Selenium = driver.findElement(By.xpath( "/html/body/div/div[1]/div[2]/table/tbody/tr/td[2]/a[2]"));
		Selenium.click();
		
		//YES Bank Ltd.
		Thread.sleep(3000);

		//WebElement YES = driver.findElement(By.partialLinkText( "YES"));
		//YES.click(); 
		
		System.out.println("page navigate to " + driver.getTitle());
		
		System.out.println("page navigate to " + driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
