package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CruHomePage {

    Query searchicon = new Query(By.className("search"));
    Query search = new Query(By.name("q"));
    Query button = new Query(By.className("button"));
    Query menupage0 = new Query(By.id("top-menu-0"));
    Query menupage1 = new Query(By.id("top-menu-1"));
    Query menupage2 = new Query(By.id("top-menu-2"));
    Query menupage3 = new Query(By.id("top-menu-3"));


    public CruHomePage clickicon() {
        searchicon.findWebElement().click();

        return this;
    }

    public CruHomePage enterSearchTerm(String searchTerm) {
        search.findWebElement().clear();
        search.findWebElement().sendKeys(searchTerm);

        return this;
    }

    public CruHomePage submitSearch() {
        search.findWebElement().sendKeys(Keys.ENTER);

        return this;
    }

    public void botton() {
        button.findWebElement().click();
    }

    public void page1() {
        menupage0.findWebElement().click();
    }
    public void page2() {
        menupage1.findWebElement().click();
    }
    public void page3() {
        menupage2.findWebElement().click();
    }
    public void page4() {
        menupage3.findWebElement().click();
    }

}

