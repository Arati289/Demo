package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		
		// to open browser
		
		WebDriver wd= new ChromeDriver();
//		WebDriver wd= new FirefoxDriver();
//		WebDriver wd= new EdgeDriver();
			//open to website
		wd.manage().window().maximize();
		Thread.sleep(2000);
		wd.get("https://richyapatil8.atlassian.net/jira/software/projects/SCRUM/boards/1");
		
		
//		wd.manage().window().maximize();
		
		wd.close();
		

				//web driver interface in selenium which contain all the require librqaries
				//chrome driver is class in selenium
	}
}
