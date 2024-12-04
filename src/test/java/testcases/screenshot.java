package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class screenshot {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.out.println("setUp method executed");
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("url opened");
	}

	@AfterClass
	void tearDown() {
		System.out.println("teardown method");
		driver.quit();
	}

}
