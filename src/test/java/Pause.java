import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pause {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		
		Actions actions = new Actions(driver);
		actions.pause(5000).perform();
		WebElement homeMenu = driver.findElement(By.id("home"));
		actions.moveToElement(homeMenu).perform();
		actions.pause(5000);
		actions.contextClick().perform();

		

	}

}
