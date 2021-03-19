package com.qa.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Handling auto suggestion text fields using Actions class of Selenium?

public class AutoSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/autoComplete.html");

		WebElement textField = driver.findElement(By.id("tags"));

		textField.sendKeys("a");

		Thread.sleep(2000);

		Actions actions = new Actions(driver);

		actions.sendKeys(textField, Keys.DOWN).sendKeys(Keys.ENTER).build().perform();

	}

}
