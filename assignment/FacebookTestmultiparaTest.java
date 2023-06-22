package assignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class FacebookTestmultiparaTest {

	String email;
	String password;
	
	public FacebookTest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	static WebDriver driver;
	
	
	@BeforeClass
	public static void OpenBrowser() {
		String url = "https://www.facebook.com/";
	   driver = DriverConnection.getConnection(url);
	   
	}
	
	@Test
	void test() {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passele = driver.findElement(By.id("pass"));
		passele.clear();
		passele.sendKeys(password);
		
	}
	
	@Test
	public static List<Object[]> passData() {
		Object o[][] = new Object[4][2];

		o[0][0] = "invalidemail@gmail.com";
		o[0][1] = "invalipass";

		o[1][0] = "invalidemail@gmail.com";
		o[1][1] = "valipass";

		o[2][0] = "validemail@gmail.com";
		o[2][1] = "invalipass";

		o[3][0] = "validemail@gmail.com";
		o[3][1] = "valipass";

		return Arrays.asList(o);
	}
}
