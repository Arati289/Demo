package selenium;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;



public class demo3 {



    public static void main(String[] args) throws Exception {



        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();



        wd.get("https://practicetestautomation.com/practice-test-login/");

        Thread.sleep(2000);



        // Scroll down

        JavascriptExecutor js = (JavascriptExecutor) wd;

        js.executeScript("window.scrollTo(0,750)");



        //Enter Wrong Username

        wd.findElement(By.name("username")).sendKeys("studen");

        wd.findElement(By.id("submit")).click();

        Thread.sleep(2000);



        WebElement usernameError = wd.findElement(By.id("error"));

        String usernameMsg = usernameError.getText();

        System.out.println("Username error: " + usernameMsg);



        // Enter Correct username & password

        wd.findElement(By.name("username")).sendKeys("student"); 

        wd.findElement(By.name("password")).sendKeys("Password12");

        wd.findElement(By.id("submit")).click();

        Thread.sleep(2000);



        WebElement passwordError = wd.findElement(By.id("error"));

        String passwordMsg = passwordError.getText();

        System.out.println("Password error: " + passwordMsg);



        wd.quit();

    }

}