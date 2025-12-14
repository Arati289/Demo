package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class demo4 {
	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		wd.get("https://practicetestautomation.com/practice-test-login/");
		Actions ac = new Actions(wd);
		WebElement we =wd.findElement(By.id("username"));
		we.sendKeys("pd")
		ac.moveToElement(we).doubleClick().build().perform();
	}
}
