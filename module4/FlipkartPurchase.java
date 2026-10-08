package module4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPurchase {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("lipstick"+Keys.ENTER);
		Thread.sleep(4000);
		
		List <WebElement> list = driver.findElements(By.xpath("//a[@class=\"GnxRXv\"]"));
		Thread.sleep(4000);
		list.get(1).click();
		Set<String>pcid = driver.getWindowHandles(); 
		Iterator<String>id=pcid.iterator();
		String pid = id.next();
		String cid = id.next();
		driver.switchTo().window(cid);
		Thread.sleep(4000);
		WebElement addToCart = driver.findElement(By.xpath("//div[text='Add toCart']"));
		addToCart.click();

	}

}
