package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class JFHomePage {

    Query searchicon = new Query(By.className("icon-search"));
    Query searchfield = new Query(By.name("q"));

    Query movie = new Query(By.xpath("//*[@id=\"movie\"]/span[1]"));
    Query languagelist = new Query(By.className("tab-link language"));
    Query langsearch = new Query(By.id("langSearch"));
    Query logo = new Query(By.id("logo"));



    public JFHomePage clickicon() {
        searchicon.findWebElement().click();

        return this;
    }

    public JFHomePage enterSearchTerm(String searchTerm) {
        searchfield.findWebElement().clear();
        searchfield.findWebElement().sendKeys(searchTerm);

        return this;
    }

    public JFHomePage submitSearch() {
        searchfield.findWebElement().submit();

        return this;
    }

    public void logo() { logo.findWebElement().click(); }


    public JFHomePage clickmovie() {
        movie.findWebElement().click();

        return this;
    }

    public JFHomePage clicklanguagelist() {
        languagelist.findWebElement().click();

        return this;
    }
    public JFHomePage enterSearchLang(String searchTerm) {
        langsearch.findWebElement().clear();
        langsearch.findWebElement().sendKeys(searchTerm);

        return this;
    }

}

