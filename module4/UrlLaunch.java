package module4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlLaunch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement e1 = driver.findElement(By.linkText("About"));
		e1.click();
		//String d1 = driver.getWindowHandle();
		//System.out.println(d1);
		Set <String> d2 = driver.getWindowHandles();
		System.out.println(d2);

	}

}
