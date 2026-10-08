package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//WebElement e1 = driver.findElement(By.linkText("Beauty&Personal care"));
		//e1.click();
		
		WebElement e2 = driver.findElement(By.partialLinkText("Personal care"));
		e2.click();
		

	}

}
