package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class GiveHomePage {

    Query searchicon = new Query(By.className("search-icon-off"));
    Query searchinput = new Query(By.className("search-input"));
    Query searchbox = new Query(By.name("q"));
    Query search = new Query(By.xpath("/html/body/div/div/div[1]/div/search-results/div/section[1]/div/div/div/form/div/input"));

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
    public GiveHomePage enterSearchTerm2(String searchTerm) {
        search.findWebElement().clear();
        search.findWebElement().sendKeys(searchTerm);

        return this;
    }

    public GiveHomePage submitSearch2() {
        search.findWebElement().sendKeys(Keys.ENTER);

        return this;
    }


    public void page3() {
        home.findWebElement().click();
    }


}

