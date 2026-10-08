package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement e1 = driver.findElement(By.name("email"));
		e1.sendKeys("fenobin@gmail.com");
		
		WebElement e2 = driver.findElement(By.name("pass"));
		e2.sendKeys("Gee2876!!"+Keys.ENTER);
		
		

	}

}
