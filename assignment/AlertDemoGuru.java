package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoGuru {
   public static void main(String[] args) {
		System.setProperty(" webdriver.chrome.driver " , "D:\\cromedriver\\LICENSE.chromedriver\\");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.guru99.com/test/delete_customer.php ");
		
		driver.manage().window().maximize();
		
		WebElement CusId = driver.findElement(By.name("cusid"));
		CusId.sendKeys("12345");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertmessage = driver.switchTo().alert().getText();
		
		System.out.println( alertmessage );
		
		
		alert.accept();
		
		
		
		
}
}
