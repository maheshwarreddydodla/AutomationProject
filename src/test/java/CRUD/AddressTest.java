package CRUD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddressTest {

	private WebDriver driver;
	private AddressPage addressPage;

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://a.testaddressbook.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("session_email")).sendKeys("mahesh1992.selenium@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Chandana@1996");
		driver.findElement(By.name("commit")).submit();
		addressPage=new AddressPage(driver);

	}
	
	@Test(enabled=false)
	public void createAddressTest()
	{
		Address address=new Address("Naresh","K","Mahaboob","Kosgi","509104");
		addressPage.addAdress(address);
		
	}
	
	@Test
	public void updateAddressTest()
	{
		Address address=new Address("Naresh","K","Mahaboob","Kosgi","509104");
		address.setAddress("Sec");
		address.setLastName("D");
		String successMsg=addressPage.updateAddress(address, address.getFirstName());
		Assert.assertEquals(successMsg, "Address was successfully updated.");
	
	}
	
	@Test
	public void deleteAddressTest()
	{
		
	addressPage.deleteAddress("Naresh");
	
	}

	@AfterTest
	public void AfterTest() {

		//driver.quit();

	}

}
