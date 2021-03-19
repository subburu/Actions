import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		driver.findElement(By.id("input-firstname")).sendKeys("Arun");
		Thread.sleep(1000);
		driver.findElement(By.id("input-lastname")).sendKeys("Motoori");
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys(System.currentTimeMillis()+"arun.motoori@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-telephone")).sendKeys("9123456789");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("amotoori");
		Thread.sleep(1000);
		driver.findElement(By.id("input-confirm")).sendKeys("amotoori");
		Thread.sleep(1000);
  	   driver.findElement(By.cssSelector("input[type='checkbox'][name='agree']")).click();
		Thread.sleep(1000);
		actions.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();
		
		
		
		
	}

}



