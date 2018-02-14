package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.StaffwebHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;


public class StaffwebExampleIT extends DriverBase {
    public final String testUser = System.getProperty ("testUser");
    public final String testPassword = System.getProperty("testPassword");

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

        staffwebHomePage.enterUsernameTerm(testUser);
        staffwebHomePage.enterPasswordTerm(testPassword)
                .clicksignin();

        // And now use this to visit Google
        driver.get("https://staffweb-stage.cru.org/search-results.html?q=vacation");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("search");
            }
        });
        // Should see: "Search Results - Staffweb"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());

        driver.get("https://staffweb-stage.cru.org/search-results.html?q=payroll");

        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d1) {
                return d1.getTitle().toLowerCase().startsWith("search");
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