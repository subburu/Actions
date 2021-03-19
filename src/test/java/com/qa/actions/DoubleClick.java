package com.qa.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com/");

		WebElement button = driver.findElement(By.xpath("//button[contains(text(),' Double click Here   ')]"));
		Actions act=new Actions(driver);
		act.doubleClick(button).build().perform();
		

		

	}

}
