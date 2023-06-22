package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGgroupTest {
	WebDriver driver;

  @Test
  public void checkTitleTest() {
	  String testTitle = "Free QA Automation Tools For Everyone";
      String originalTitle = driver.getTitle();
     Assert.assertEquals(originalTitle, testTitle);
  }

  @Test
  public void click_elementTest() {
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
      System.out.println("Home Page heading is displayed");
  }

  @Test
  public void starting_pointTest() {
	  System.out.println("This is the starting point of the test");
  	
  	 driver = new ChromeDriver();
  	 driver.get("https://demoqa.com/");
  }
}
