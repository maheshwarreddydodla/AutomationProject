package com.AutomationProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	public static void highLightElement(WebDriver driver, WebElement element) {

		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;

		javaScriptExecutor.executeScript(
				"arguments[0].setAttribute('style','background:yellow;border: 2px solid red;')", element);

	}

	public static void webelementScreenshot(WebDriver driver, WebElement element, String fileName) throws IOException {
		File src = element.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("./target/Screenshots/" + fileName + ".png"));

	}

	public static void webelementScreenshotOldWay(WebDriver driver, WebElement element, String fileName)
			throws IOException {

		TakesScreenshot ts = (TakesScreenshot) element;

		File src = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("./target/Screenshots/" + fileName + ".png"));

	}

	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);

	}

	public static WebElement waitForElementPresentWithFluent(WebDriver driver, final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}

		}

		);

		return element;

	}

	public static void selectOptionFromDropDown(WebElement element, String value) {
		Select ddOptions = new Select(element);

		List<WebElement> optionValues = ddOptions.getOptions();

		for (WebElement option : optionValues) {
			if (option.getText().equals(value)) {
				System.out.println(option.getText());
				option.click();
				break;

			}
		}
	}

}
