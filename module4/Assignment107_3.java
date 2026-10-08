package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment107_3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement e1 = driver.findElement(By.id("fname"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();
		Thread.sleep(4000);
		e1.sendKeys("Fenobin");

	}

}
