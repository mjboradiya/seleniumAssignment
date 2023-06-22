package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(" webdriver.chrome.driver " , "D:\\\\cromedriver\\\\LICENSE.chromedriver\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		 driver.manage().window().maximize();
		 
		 WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));
		 radio1.click();
		 
		 System.out.println("option 1 clicked");
		 
		 Thread.sleep(2000);
		 
		 WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));
		 radio2.click();
		 
		 System.out.println("option 2 clicked");
		 
		 Thread.sleep(2000);
		 
		 WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"vfb-7-3\"]"));
		 radio3.click();
		 
		 System.out.println("option 3 clicked");
		 
		 
	}

}
