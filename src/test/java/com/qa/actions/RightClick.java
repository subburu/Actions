package com.qa.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://swisnl.github.io/jQuery-contextMenu/demo.html";
	    driver.get(url);
	    
	    driver.manage().window().maximize();
	    
	    Actions action =new Actions(driver);
	    
	    WebElement rightClickButton= driver.findElement(By.cssSelector(".context-menu-one"));
	    
	    action.contextClick(rightClickButton).build().perform();
	    
	    WebElement copy=driver.findElement(By.cssSelector(".context-menu-icon context-menu-icon-copy"));
	     String s=copy.getText();
	     System.out.println(s);
	     copy.click();
	    
	    
	    
		
	}

}
