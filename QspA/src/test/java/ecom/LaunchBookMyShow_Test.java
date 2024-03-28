package ecom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class LaunchBookMyShow_Test {
	@Test
	public void bookMyShow() {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		driver.quit();
	}
}
