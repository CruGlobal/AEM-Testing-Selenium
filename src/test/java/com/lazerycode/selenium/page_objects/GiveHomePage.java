package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class GiveHomePage {

    Query searchicon = new Query(By.className("search-icon"));
    Query searchinput = new Query(By.className("search-input"));
    Query searchbox = new Query(By.name("q"));
    Query ministries = new Query(By.xpath("//*[@id=\"give-hero\"]/div[2]/div[2]/a/div"));
    Query startnewgift = new Query(By.xpath("//*[@id=\"sub-navigation\"]/div/ul[2]/li[2]"));
    Query cart = new Query(By.xpath("//*[@id=\"sub-navigation\"]/div/ul[2]/li[3]"));
    Query morewaytogive = new Query(By.xpath("//*[@id=\"sub-navigation\"]/div/ul[2]/li[8]"));
    Query home = new Query(By.className("sub-nav-logo"));

    public GiveHomePage clickicon() {
        searchicon.findWebElement().click();

        return this;
    }

    public GiveHomePage enterSearchTerm0(String searchTerm) {
        searchinput.findWebElement().clear();
        searchinput.findWebElement().sendKeys(searchTerm);

        return this;
    }

    public GiveHomePage submitSearch0() {
        searchinput.findWebElement().sendKeys(Keys.ENTER);

        return this;
    }
    public GiveHomePage enterSearchTerm1(String searchTerm) {
        searchbox.findWebElement().clear();
        searchbox.findWebElement().sendKeys(searchTerm);

        return this;
    }

    public GiveHomePage submitSearch1() {
        searchbox.findWebElement().sendKeys(Keys.ENTER);

        return this;
    }

    public void botton() {
        ministries.findWebElement().click();
    }
    public void page1() {
        startnewgift.findWebElement().click();
    }
    public void page2() {
        cart.findWebElement().click();
    }
    public void page3() {
        home.findWebElement().click();
    }
    public void page4() { morewaytogive.findWebElement().click(); }

}

