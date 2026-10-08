package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTagName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\fenob\\OneDrive\\Documents\\learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement e1 = driver.findElement(By.tagName("a"));
		e1.click();
		

	}

}
