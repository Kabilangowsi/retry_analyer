package retry;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_1.Base_1;

public class BAne extends Base_1 {

	@Test
	public void kabi() {
		kabilan();

		System.out.println("Select 1");

		driver.get("https://clicktobuy.hyundai.co.in/#/bookACar?modelCode=0Y");
		System.out.println("After launch ");
	}
}
