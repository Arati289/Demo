package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) throws Exception {
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.navigate().to("https://demo.automationtesting.in/Alerts.html");
//		Thread.sleep(2000);
		
		
		wd.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(2000);
//		wd.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
//		Alert al=wd.switchTo().alert();
//		System.out.println(al.getText());
//		al.accept();
		
		wd.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert a2=wd.switchTo().alert();
		System.out.println(a2.getText());
		a2.dismiss();
		
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("window.scrollTo(0, 750)");
	}
}