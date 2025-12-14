package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) {
		WebDriver wd= new ChromeDriver();
		wd.navigate().to("https://www.saucedemo.com/");
		WebElement we = wd.findElement(By.id("user-name"));
				we.click();
				we.sendKeys("Welcome");
				we.clear();
				we.sendKeys("Hello");
				Dimension d=new Dimension(500,750);
				wd.manage().window().setSize(d);
				System.out.println(we.getLocation());
				System.out.println(we.getTagName());
				System.out.println(we.isDisplayed());
				System.out.println(we.isEnabled());
				System.out.println(we.isSelected());
				System.out.println(we.getSize());
				System.out.println(we.getAttribute("value"));
	}
	
}
