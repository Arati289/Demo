package Demo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class NewTesttt {

    WebDriver wd;  

    @BeforeTest

    public void beforeTest() throws InterruptedException {

        wd = new ChromeDriver();   

        wd.manage().window().maximize();

        wd.get("https://practicetestautomation.com/practice-test-login/");

        Thread.sleep(3000);

    }



    @Test

    public void f() throws InterruptedException, IOException {
    	
    	Properties p = new Properties();
    	FileInputStream fs = new FileInputStream("C:\\Users\\dac30\\eclipse-workspace\\wokspace\\Test\\src\\Demo\\Input.properties");
    	p.load(fs);
        wd.findElement(By.name("username")).sendKeys(p.getProperty("username"));

        wd.findElement(By.name("password")).sendKeys(p.getProperty("password"));

        wd.findElement(By.id("submit")).click();

        Thread.sleep(3000);

    }



    @AfterTest

    public void afterTest() {

        wd.quit();   

    }

}