package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoo {
	public static void main(String[] args) throws InterruptedException {
		  WebDriver wd = new ChromeDriver();
	      // wd.manage().window().maximize();
	       Dimension d= new Dimension(500,750);
	       wd.manage().window().setSize(d);

	       wd.navigate().to("https://www.saucedemo.com/");
	       
	    // USERNAME
	       WebElement we = wd.findElement(By.id("user-name"));
	       we.clear();
	       we.sendKeys("Neha");
	       Thread.sleep(2000);
	       
	       we.clear();
	       we.sendKeys("standard_user");
	       
	       System.out.println(we.getAttribute("value"));
	       Thread.sleep(2000);
	       System.out.println(we.getLocation());
	       System.out.println(we.getTagName());
	       System.out.println(we.isDisplayed());
	       System.out.println(we.isEnabled());
	       System.out.println(we.isSelected());
	       System.out.println(we.getSize());
	       //System.out.println(we.isDisplayed());
	       
	    // PASSWORD
	       WebElement password = wd.findElement(By.id("password"));
	       password.clear();
	       password.sendKeys("secret_sauce");
	       Thread.sleep(2000);
	       
	    // LOGIN BUTTON
	       WebElement loginBtn = wd.findElement(By.id("login-button"));
	       loginBtn.click();
	       
	}

}
