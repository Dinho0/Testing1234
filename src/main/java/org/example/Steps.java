package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps  extends Action{

    PageModel pageModel =  new PageModel();
    public void launchBrowser(){
       launchBrowser("https://Amazon.com");
    }

    public void login(){

    }

    public void searchProduct(){

      inputData(pageModel.searchBox, "Who are thou");
      click(pageModel.searchButton);
      click(pageModel.category);
      click(pageModel.itemType);
    }

    public void addItem(){
        click(pageModel.addToCart);
    }

    public void closeBrowser(){
        driver.close();
    }
}
