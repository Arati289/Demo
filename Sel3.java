package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel3 {
		public static void main(String[] args) {
			WebDriver wd = new ChromeDriver();
			wd.get("https://demo.automationtesting.in/Register.html");
//			wd.get("https://practicetestautomation.com/practice-test-login/");

			wd.manage().window().maximize();
//			wd.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Sakshita");
//			wd.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Bodke");
//			wd.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Ghatkopar");
//			wd.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("sakshita@gmail.com");
//			wd.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234455667");
//			wd.findElement(By.xpath("//input[@value='FeMale']")).click();
//			wd.findElement(By.xpath("//input[@value='Movies']")).click();
//			wd.findElement(By.xpath("//input[@value='Cricket']")).click();
//			wd.findElement(By.xpath("//div[@id=\"msdd\"]"));
//			WebElement we = wd.findElement(By.xpath("//select[@ng-model='Skill']"));
//			Select skill = new Select(we);
//			skill.selectByIndex(5);
//			skill.selectByVisibleText("C");
			WebElement wc = wd.findElement(By.xpath("//span[@role='combobox']"));
			Select country = new Select(wc);
			country.selectByIndex(2);
			
//			WebElement we = wd.findElement(By.xpath("//select[@placeholder='Year']"));
//			Select Year = new Select(we);
//			Year.selectByIndex(5);
//
//			WebElement we1 = wd.findElement(By.xpath("//select[@placeholder='Month']"));
//			Select Month = new Select(we1);
//			Month.selectByIndex(5);
//			
//			WebElement we2 = wd.findElement(By.xpath("//select[@placeholder='Day']"));
//			Select Day = new Select(we2);
//			Day.selectByIndex(5);
		
//			System.out.println(wd.getTitle());
//			System.out.println(wd.getCurrentUrl());
//			System.out.println(wd.getPageSource());
//			wd.findElement(By.id("password")).sendKeys("Password123");
//			wd.findElement(By.id("submit")).click();
//			wd.navigate().back();
//			wd.navigate().forward();


			}
}

