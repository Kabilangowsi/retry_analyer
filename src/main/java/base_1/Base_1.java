package base_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_1 {

	public static WebDriver driver;

	public static WebDriver kabilan() {
		driver = new ChromeDriver();
		return driver;

	}

}
