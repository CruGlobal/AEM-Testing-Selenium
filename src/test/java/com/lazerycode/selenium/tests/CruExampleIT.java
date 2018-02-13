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
    public void CruOpenHomPage() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://stage.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");


        // Check the title of the page
        System.out.println("Testing stage.cru.org" );
        System.out.println("Page title is: " + driver.getTitle());

    }

    @Test
    public void CruBrowsePages() throws Exception {
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

        driver.get("https://stage.cru.org/us/en/train-and-grow/life-and-relationships/holidays/christmas/4-ways-to-prepare-your-heart-for-christmas.html");
        // Should see: "4 way to prepare your heart"
        System.out.println("Page Title is: Advent - 4-ways-to-prepare-your-heart-for-christmas");
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.cru.org/us/en/how-to-know-god.html");
        // Should see: "How to Know God | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.cru.org/us/en/train-and-grow.html");
        // Should see: "Train & Grow | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.cru.org/us/en/communities.html");
        // Should see: "Communities | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.cru.org/us/en/opportunities.html");
        // Should see: "Opportunities | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.cru.org/us/en/about.html");
        // Should see: "About | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.cru.org/us/en/communities/locations/africa.html");
        // Should see: "Africa | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());


    }

    @Test
    public void CruSearch() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://give-stage2.cru.org/search-results.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        CruHomePage cruHomePage = new CruHomePage();

        // Check the title of the page
        //System.out.println("Page title is: " + driver.getTitle());

        //cruHomePage.clickicon();

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