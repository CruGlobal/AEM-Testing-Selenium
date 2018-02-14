package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.GiveHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GiveExampleIT extends DriverBase {

    @Test
    public void Give() throws Exception {

        WebDriver driver = getDriver();
        driver.manage().window().setSize(new Dimension(1124, 850));

        // And now use this to visit Google
        driver.get("https://give-stage2.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        driver.get("https://give-stage2.cru.org/search-results.html?type=ministries");
        // Should see: "Ministries"
        System.out.println("Page Title is: "+ driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://give-stage2.cru.org/search-results.html");
        // Should see: "Start A New Gift | Cru"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://give-stage2.cru.org/cart.html");
        // Should see: "Cart"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://give-stage2.cru.org/more-ways-to-give.html");
        // Should see: "More Ways to Give"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://give-stage2.cru.org/search-results.html?type=people");
        // Should see: "Missionaries"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://give-stage2.cru.org/search-results.html?type=featured");
        // Should see: "Feature Opportunities"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());

        // Test Search by Name
        driver.get("https://give-stage2.cru.org/search-results.html?q=steve%20bratton");
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
               return d.getTitle().toLowerCase().startsWith("search");
            }
        });

        // Test Search by designation
        driver.get("https://give-stage2.cru.org/search-results.html?q=0478064");

        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d1) {
                return d1.getTitle().toLowerCase().startsWith("search");
            }
        });

        // Browse by designation
        driver.get("https://give-stage2.cru.org/0478064");
        /// Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d2) {
                return d2.getTitle().toLowerCase().startsWith("steve");
            }
        });

    }
}