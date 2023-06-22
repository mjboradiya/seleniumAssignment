package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class windowalert {
public static void main(String[] args) throws InterruptedException {
	System.getProperty(" webdriver.chrome.driver " , "D:\\\\cromedriver\\\\LICENSE.chromedriver\\" );
	WebDriver driver = new EdgeDriver();
	driver.get("https://demoqa.com/alerts ");
	
	// ok button
	WebElement text = driver.findElement(By.xpath("//button[@id='alertButton']"));
    text.click();
	Thread.sleep(2000);
	Alert alret  = driver.switchTo().alert();
	alret.accept(); 
	
	//WebElement text = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	//text.click();
    //Thread.sleep(5000);
    //Alert alret  = driver.switchTo().alert();
    //alret.accept(); 
    
    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	
	//WebElement text = driver.findElement(By.xpath("//button[@id='promtButton']"));
	//text.click();
	//Thread.sleep(3000);
	//Alert alertwindow = driver.switchTo().alert();
	//System.out.println("please enter your name" +alertwindow.getText());
	//alertwindow.sendKeys("hi");
	//alertwindow.accept();

}
}
