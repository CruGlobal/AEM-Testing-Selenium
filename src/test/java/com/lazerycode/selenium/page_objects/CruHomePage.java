package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CruHomePage {

    Query searchicon = new Query(By.className("icon"));
    Query search = new Query(By.name("q"));
    Query button = new Query(By.className("button"));



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

}

