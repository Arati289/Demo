package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo5 {
	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Static.html");
		Actions ac = new Actions(wd);

		WebElement drag =wd.findElement(By.id("angular"));
		WebElement drop =wd.findElement(By.id("droparea"));
		
		ac.dragAndDrop(drag, drop).build().perform();

		WebElement dr =wd.findElement(By.id("mongo"));
//		WebElement drp =wd.findElement(By.id("droparea"));
		
		ac.dragAndDrop(dr, drop).build().perform();
		
		WebElement d =wd.findElement(By.id("node"));
//		WebElement p =wd.findElement(By.id("droparea"));
		
		ac.dragAndDrop(d, drop).build().perform();
	}
}
