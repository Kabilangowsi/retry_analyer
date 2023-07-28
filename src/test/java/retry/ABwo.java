package retry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base_1.Base_1;

public class ABwo extends Base_1 {

	@Test

	public void next() {

		System.out.println("select 2 ");
		Select drpModel = new Select(driver.findElement(By.xpath("//select[@id='inputmodel-01']")));
		drpModel.selectByVisibleText("New Verna");
		System.out.println("Successfully selected Model");

	}

}
