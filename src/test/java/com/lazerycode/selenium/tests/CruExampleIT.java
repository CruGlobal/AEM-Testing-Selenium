package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.CruHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CruExampleIT extends DriverBase {

    @Test
    public void CruOpenExample() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://stage.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        CruHomePage cruHomePage = new CruHomePage();

        // Check the title of the page
        System.out.println("Page testing stage.cru.org" );

        //cruHomePage.enterSearchTerm("Jesus")
        //        .submitSearch();

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        //(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
        //    public Boolean apply(WebDriver d) {
        //       return d.getTitle().toLowerCase().startsWith("Jesus");
        //    }
        //});

        // Should see: "Cru - Google Search"
        //System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    public void cruButtonExample() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://stage.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        CruHomePage cruHomePage = new CruHomePage();

        // Check the title of the page
        //System.out.println("Page title is: " + driver.getTitle());

        cruHomePage.botton();
        // Should see: "cheese! - Google Search"
        System.out.println("Page Title is: Advent - 4-ways-to-prepare-your-heart-for-christmas");
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        cruHomePage.page1();
        // Should see: "How to Know God | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        cruHomePage.page2();
        // Should see: "Train & Grow | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        cruHomePage.page3();
        // Should see: "Communities | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        cruHomePage.page4();
        // Should see: "Opportunities | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        //(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
        //    public Boolean apply(WebDriver d) {
        //        return d.getTitle().toLowerCase().startsWith("milk");
        //    }
        //});

        // Should see: "cheese! - Google Search"
        //System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    public void cruClickSearch() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://stage.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        CruHomePage cruHomePage = new CruHomePage();

        // Check the title of the page
        //System.out.println("Page title is: " + driver.getTitle());

        cruHomePage.clickicon();

        cruHomePage.enterSearchTerm("jesus").submitSearch();
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
               return d.getTitle().toLowerCase().startsWith("search");
            }
        });
        // Should see: "Search Results - Cru"
        System.out.println("Page title is: " + driver.getTitle());

    }
}