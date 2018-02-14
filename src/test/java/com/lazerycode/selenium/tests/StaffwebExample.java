package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.StaffwebHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class StaffwebExample extends DriverBase {

    @Test
    public void StaffwebOpenHomPage() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();
        driver.manage().window().setSize(new Dimension(1124, 850));

        // And now use this to visit Google
        driver.get("https://staffweb-stage.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");
        StaffwebHomePage staffwebHomePage = new StaffwebHomePage();

        // Check the title of the page
        System.out.println("Testing Staffweb-stage.cru.org" );
        System.out.println("Page title is: " + driver.getTitle());

        staffwebHomePage.enterUsernameTerm($username);
        staffwebHomePage.enterPasswordTerm($password)
                .clicksignin();
        //driver.get("https://staffweb-stage.cru.org/system/sling/logout.html");
        // Check the title of the page
        //System.out.println("Testing stage.cru.org" );
        //System.out.println("Page title is: " + driver.getTitle());

    }

    @Test
    public void StaffwebSearch() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://staffweb-stage.cru.org/search-results.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        StaffwebHomePage staffwebHomePage = new StaffwebHomePage();

        staffwebHomePage.enterSearchTerm("vacation").submitSearch();
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("search");
            }
        });
        // Should see: "Search Results - Staffweb"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());

        driver.get("https://staffweb-stage.cru.org/search-results.html");

        staffwebHomePage.enterSearchTerm("payroll").submitSearch();
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("search");
            }
        });
        // Should see: "Search Results - Staffweb"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());


        driver.get("https://staffweb-stage.cru.org/system/sling/logout.html");
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());



    }


}