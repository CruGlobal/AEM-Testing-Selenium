package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class StaffwebHomePage {

    Query username = new Query(By.id("username"));
    Query password = new Query(By.id("password"));
    Query signin = new Query(By.id("btn_signin"));
    Query signout = new Query(By.className("nav-sign-out"));
    Query searchicon = new Query(By.className("search_icon"));
    Query search = new Query(By.name("q"));
    Query searchbutton = new Query(By.id("topSearchButton"));


    public StaffwebHomePage clickicon() {
        searchicon.findWebElement().click();

        return this;
    }
    public StaffwebHomePage clicksearch() {
        searchbutton.findWebElement().click();

        return this;
    }
    public StaffwebHomePage clicksignin() {
        signin.findWebElement().click();

        return this;
    }
    public StaffwebHomePage clicksignout() {
        signout.findWebElement().click();

        return this;
    }
    public StaffwebHomePage enterUsernameTerm(String searchTerm) {
        username.findWebElement().clear();
        username.findWebElement().sendKeys(searchTerm);

        return this;
    }
    public StaffwebHomePage enterPasswordTerm(String searchTerm) {
        password.findWebElement().clear();
        password.findWebElement().sendKeys(searchTerm);

        return this;
    }

    public StaffwebHomePage enterSearchTerm(String searchTerm) {
        search.findWebElement().clear();
        search.findWebElement().sendKeys(searchTerm);

        return this;
    }

    public StaffwebHomePage submitSearch() {
        search.findWebElement().sendKeys(Keys.ENTER);

        return this;
    }

}

