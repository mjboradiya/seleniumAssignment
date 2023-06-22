package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogo {

	public static void main(String[] args) {
		System.setProperty(" webdriver.chrome.driver " , "D:\\\\cromedriver\\\\LICENSE.chromedriver\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdpGaPXT_gU39-0pT2LKrOuxR35H35MwvTq5l9VQO1p-Z3h29g7sX6vTqT7OpLB_AWMd2VMMLoExb-1-BnI5j-RQMIMGbaQ9IusHn3MJB9bdA&smuh=44094&lh=Ac-KlXR0Vdt7q1ET4OM&wtsid=rdr_0berdX2hB8EcPN6y4");

		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("7600954380");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Manisha2027#");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		WebElement proimage = driver.findElement(By.xpath("//*[@id=\"mount_0_0_o1\"]/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image"));
		proimage.click();
		
		WebElement Logo = driver.findElement(By.xpath("//*[@id=\"mount_0_0_PI\"]/div/div[1]/div/div[2]/div[1]/a/svg/path[1]"));
		Logo.click();
	}

}
