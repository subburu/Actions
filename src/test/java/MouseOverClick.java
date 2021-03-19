import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.omayo.blogspot.com");
		
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		
		WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
		
		actions.moveToElement(blogsMenu).perform();
	
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(blogsMenu));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		

		
		WebElement seleniumByArunOption = driver.findElement(By.linkText("SeleniumByArun"));
		
		actions.moveToElement(seleniumByArunOption).click().build().perform();
		
		driver.quit();
		

	}

}
