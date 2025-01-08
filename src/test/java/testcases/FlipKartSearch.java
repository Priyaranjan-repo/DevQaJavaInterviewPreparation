package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FlipKartSearch {

	@Test
	public void getsearchList() throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://flipkart.com");
		WebElement searchBox = driver
				.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		String product = "iphone 15";
		searchBox.sendKeys(product);
		Thread.sleep(3000);

		// ul[@class='_1sFryS _2x2Mmc']/li/div/a/div/div/span
	}
}
