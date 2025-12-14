package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {
		public static void main(String[] args) {
			WebDriver wd = new ChromeDriver();
			wd.get("https://practicetestautomation.com/practice-test-login/");
			wd.get("https://practicetestautomation.com/practice-test-login/");

			wd.manage().window().maximize();
//			System.out.println(wd.getTitle());
//			System.out.println(wd.getCurrentUrl());
//			System.out.println(wd.getPageSource());
//			wd.findElement(By.id("username")).sendKeys("student");
//			wd.findElement(By.id("password")).sendKeys("Password123");
//			wd.findElement(By.id("submit")).click();
			wd.navigate().back();
			wd.navigate().forward();


			}
}
