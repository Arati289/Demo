package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
  @Test
  public void f() {
	  WebDriver d=new ChromeDriver();
	  d.get("https://www.google.com/");
  }
}
