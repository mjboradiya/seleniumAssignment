package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationGmail {
 public static <JavascriptExecutor> void main(String[] args) throws InterruptedException {
	 System.setProperty(" webdriver.chrome.driver " , "D:\\cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("manisha");
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("boradiya");
		// driver.findElement(By.name("Next")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
		@SuppressWarnings("unchecked")
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		((RemoteWebDriver) executor).executeScript("arguments[0].click();", element);
		
		Thread.sleep(2000);
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("January");
		
		WebElement day = driver.findElement(By.name("day"));
		day.sendKeys("20");
		
		WebElement year = driver.findElement(By.name("year"));
		year.sendKeys("1991");          
		
		Select Gender = new Select(driver.findElement(By.id("gender")));
		Gender.selectByVisibleText("Female");
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/div[3]"));
		@SuppressWarnings("unchecked")
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		((RemoteWebDriver) executor1).executeScript("arguments[0].click();", element1);
		
		
	//	List<WebElement> rlist = driver.findElements(By.className("enBDyd "));
		//System.out.println(rlist.size());
		
		
		
		//WebElement rbutton = driver.findElement(By.className("enBDyd "));
		//rbutton.click();
		
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
		@SuppressWarnings("unchecked")
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		((RemoteWebDriver) executor2).executeScript("arguments[0].click();", element2);
		
		
}
}
