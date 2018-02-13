package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.GiveHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GiveExampleIT extends DriverBase {

    @Test
    public void GiveBrowsePagesExample() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://give-stage2.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        GiveHomePage giveHomePage = new GiveHomePage();

        giveHomePage.botton();
        // Should see: "Ministries"
        System.out.println("Page Title is: "+ driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        giveHomePage.page1();
        // Should see: "Start A New Gift | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        giveHomePage.page2();
        // Should see: "Cart"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        giveHomePage.page3();
        // Should see: "Home | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        giveHomePage.page4();
        // Should see: "More Ways to Give"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());

    }

    @Test
    public void GiveSearchName() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://give-stage2.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        GiveHomePage giveHomePage = new GiveHomePage();

        // Check the title of the page
        System.out.println("Testing Search Icon by Name ");

        giveHomePage.clickicon();

        giveHomePage.enterSearchTerm0("steve bratton").submitSearch0();
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
               return d.getTitle().toLowerCase().startsWith("search");
            }
        });

    }

    @Test
    public void GiveClickSearch() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://give-stage2.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        GiveHomePage giveHomePage = new GiveHomePage();

        // Check the title of the page
        //System.out.println("Page title is: " + driver.getTitle());

        giveHomePage.clickicon();

        giveHomePage.enterSearchTerm1("0478064").submitSearch1();
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("search");
            }
        });

    }

    @Test
    public void GiveBrowseDesignation() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://give-stage2.cru.org/0478064");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        GiveHomePage giveHomePage = new GiveHomePage();

    }

    @Test
    public void GiveBrowseDirectLink() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://give-stage2.cru.org/search-results.html?q=Steve%20Bratton");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        GiveHomePage giveHomePage = new GiveHomePage();

    }

    @Test
    public void GiveOpenHome() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://give-stage2.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        GiveHomePage giveHomePage = new GiveHomePage();
    }
}