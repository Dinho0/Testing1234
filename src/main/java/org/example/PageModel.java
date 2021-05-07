package org.example;

import org.openqa.selenium.By;

public class PageModel {
    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");
    By category = By.xpath("//*[@id=\"n/22\"]/span/a/span");
    By itemType = By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[3]/div/div/div[1]/a");
    By addToCart = By.name("submit.add-to-cart");


}
