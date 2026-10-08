package module4;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		int count = list.size();
	    System.out.println(count);
	    list.get(0).click();

	}

}
