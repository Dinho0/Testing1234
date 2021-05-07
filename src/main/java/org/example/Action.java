package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
    WebDriver driver;

    public void launchBrowser(String url){
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void click(By item){
        driver.findElement(item).click();

    }

    public void inputData(By item, String data){
        driver.findElement(item).sendKeys(data);
    }
}
