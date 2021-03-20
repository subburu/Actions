import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http:omayo.blogspot.com/");

		Thread.sleep(2000);

		Actions actions = new Actions(driver);

		WebElement homeMenu = driver.findElement(By.id("home"));

		actions.clickAndHold(homeMenu).perform();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(homeMenu));
		wait.until(ExpectedConditions.elementToBeClickable(homeMenu));
		actions.release(homeMenu).build().perform();
		System.out.println("Test");
		System.out.println("Testing");

	}

}
