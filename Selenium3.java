package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
		public static void main(String[] args) {
			
			WebDriver wd = new ChromeDriver();
			String pw=wd.getWindowHandle();
			wd.get("https://www.cricbuzz.com/");
			wd.switchTo().newWindow(WindowType.TAB);
			String cw=wd.getWindowHandle();

			wd.get("https://www.flipkart.com/");
			wd.switchTo().newWindow(WindowType.TAB);
			String lw=wd.getWindowHandle();

			wd.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=13791536208269111258&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9215777&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
			wd.manage().window().maximize();
			wd.switchTo().window(pw);
			wd.switchTo().window(cw);
			wd.switchTo().window(lw);
			
			}
}
