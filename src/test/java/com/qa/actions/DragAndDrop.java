package com.qa.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://jqueryui.com/droppable/";
	    driver.get(url);
	    
	    
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame(0);
	    
	    WebElement source=driver.findElement(By.id("draggable"));
	    WebElement destination=driver.findElement(By.id("droppable"));
	    
	    
	    Actions action =new Actions(driver);
	    
	    action.clickAndHold(source).moveToElement(destination).release().build().perform();
	    
	    
	    
	    

	}

}
