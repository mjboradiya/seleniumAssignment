package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty(" webdriver.chrome.driver " , "D:\\\\cromedriver\\\\LICENSE.chromedriver\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	
	driver.manage().window().maximize();
	
	//Select se = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[1]")));
	
	
	//se.selectByVisibleText("Group 2, option 1");
	
//	List<WebElement> lst = select.getOptions();
	
	
	
	Select oSel = new Select(driver.findElement(By.xpath("//select[@id='cars'] ")));

			if(oSel.isMultiple()){
				
				//Selecting multiple values by index
				oSel.selectByIndex(1);
				oSel.selectByIndex(2);
 
				Thread.sleep(2000);
			
				//Or selecting by values
				oSel.selectByValue("volvo");
				oSel.selectByValue("audi");

				Thread.sleep(2000);
				
				//Or selecting by visible text
				oSel.selectByVisibleText("Volvo");
				oSel.selectByVisibleText("Opel");
				
				Thread.sleep(2000);
			}

	        Select select = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[6]/div/div/select")));

	       
	        //Get list of web elements
	        List<WebElement> lst = select.getOptions();

	        
	        System.out.println("The dropdown options are:");
	        for(WebElement options: lst)
	            System.out.println(options.getText());

	      
	        System.out.println("Select the Option by Index 1");
	        select.selectByIndex(1);
	        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

	        Thread.sleep(2000);
	       
	        System.out.println("Select the Option by Text Blue");
	        select.selectByVisibleText("Blue");
	        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

	      
	        Thread.sleep(2000);
	        
	        System.out.println("Select the Option by value 6");
	        select.selectByValue("6");
	        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

	        driver.quit();

	
}
}
