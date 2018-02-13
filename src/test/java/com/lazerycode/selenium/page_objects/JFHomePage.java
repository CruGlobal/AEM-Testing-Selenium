package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class JFHomePage {

    Query searchicon = new Query(By.className("icon-search"));
    Query searchfield = new Query(By.name("q"));
    Query browsefilms = new Query(By.xpath("/html/body/div[4]/div/div/div/div/div[3]/div/a/button"));
    Query watch = new Query(By.xpath("//*[@id=\"nav-mobile-hidden\"]/li[1]/a/h6"));
    Query strategies = new Query(By.xpath("//*[@id=\"nav-mobile-hidden\"]/li[2]/a/h6"));
    Query howtohelp = new Query(By.xpath("//*[@id=\"nav-mobile-hidden\"]/li[3]/a/h6"));
    Query about = new Query(By.xpath("//*[@id=\"nav-mobile-hidden\"]/li[4]/a/h6"));
    Query movie = new Query(By.xpath("//*[@id=\"movie\"]/span[1]"));
    Query languagelist = new Query(By.xpath("/html/body/div[3]/div/ul/li[4]"));
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
    public void botton() {
        browsefilms.findWebElement().click();
    }

    public void page1() {
        watch.findWebElement().click();
    }
    public void page2() {
        strategies.findWebElement().click();
    }
    public void page3() {
        howtohelp.findWebElement().click();
    }
    public void page4() {
        about.findWebElement().click();
    }

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

