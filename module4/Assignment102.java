package module4;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment102 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		

	}

}
