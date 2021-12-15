package CRUD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPage {

	private WebDriver driver;

	private By firstName = By.id("address_first_name");
	private By lastName = By.id("address_last_name");
	private By address1 = By.id("address_street_address");
	private By city = By.id("address_city");
	private By zipCode = By.id("address_zip_code");
	private By newAdressLink = By.linkText("New Address");
	private By createAddress = By.name("commit");
	private By successMsg = By.cssSelector(".alert.alert-notice");
	private By addressesLink = By.linkText("Addresses");

	public AddressPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAddresses() {
		driver.findElement(addressesLink).click();

	}

	public void clickNewAdressLink() {
		driver.findElement(newAdressLink).click();

	}

	public String fillAddressForm(Address address) {
		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys(address.getFirstName());

		driver.findElement(lastName).clear();
		driver.findElement(lastName).sendKeys(address.getLastName());

		driver.findElement(address1).clear();
		driver.findElement(address1).sendKeys(address.getAddress());

		driver.findElement(city).clear();
		driver.findElement(city).sendKeys(address.getCity());

		driver.findElement(zipCode).clear();
		driver.findElement(zipCode).sendKeys(address.getZipCode());
		driver.findElement(createAddress).click();

		return driver.findElement(successMsg).getText();
	}
	
	
	public String addAdress(Address address) {
		clickAddresses();
		clickNewAdressLink();
		return fillAddressForm(address);

	}

	public String updateAddress(Address address, String fName) {
		clickAddresses();
		driver.findElement(By.xpath("//*[text()='" + fName + "']//following-sibling::*//*[text()='Edit']")).click();
		return fillAddressForm(address);

	}

	public String deleteAddress(String fName) {
		driver.findElement(By.xpath("//*[text()='" + fName + "']//following-sibling::*//*[text()='Destroy']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		return driver.findElement(successMsg).getText();

	}

}
