package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement signIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signIn.click();
		Thread.sleep(6000);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("fenobin@gmail.com"+Keys.ENTER);
		Thread.sleep(6000);
		
		WebElement pswd = driver.findElement(By.name("password"));
		pswd.sendKeys("S"+Keys.ENTER);
		Thread.sleep(6000);
		
		
		
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes for women");
		Thread.sleep(6000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		list.get(0).click();
		
		List<WebElement> image = driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']/img"));
		image.get(0).click();
		
		WebElement cart = driver.findElement(By.name("submit.add-to-cart"));
		cart.click();
		WebElement proceed = driver.findElement(By.name("proceedToRetailCheckout"));
		proceed.click();
		
		
		
		
		
		
		
		

	}

}
