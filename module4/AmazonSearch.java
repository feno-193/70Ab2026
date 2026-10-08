package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("toys");
		WebElement sub = driver.findElement(By.id("nav-search-submit-button"));
		sub.click();
	}

}
