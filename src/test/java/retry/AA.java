package retry;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base_1.Base_1;

public class AA extends Base_1 {
	@Test
	public void kab() {
		System.out.println("Select3");
		Select drpType = new Select(driver.findElement(By.xpath("//select[@id='inputfuel-01']")));
		drpType.selectByVisibleText("Petrol");
		System.out.println("Successfully selected Fuel Type");

	}

}
