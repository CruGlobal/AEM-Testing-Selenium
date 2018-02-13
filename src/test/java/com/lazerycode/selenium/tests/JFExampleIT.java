package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.JFHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JFExampleIT extends DriverBase {

    @Test
    public void JFOpenExample() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://stage.jesusfilm.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Check the title of the page
        System.out.println("Page testing stage.jesusfilm.org: " );

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

    //@Test
    //public void JFBrowsePagesExample() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        //WebDriver driver = getDriver();

        // And now use this to visit Google
       // driver.get("https://give-stage2.cru.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        //JFHomePage jfHomePage = new JFHomePage();

        //jfHomePage.botton();
        // Should see: "Browse FIlms"
        //System.out.println("Page Title is: "+ driver.getTitle());
        //System.out.println("Page URL is: " + driver.getCurrentUrl());
        //jfHomePage.page1();
        // Should see: "Watch"
        //System.out.println("Page title is: " + driver.getTitle());
        //System.out.println("Page URL is: " + driver.getCurrentUrl());
        //jfHomePage.page2();
        // Should see: "Strategies & Tools"
        //System.out.println("Page title is: " + driver.getTitle());
        //System.out.println("Page URL is: " + driver.getCurrentUrl());
        //jfHomePage.page3();
        // Should see: "How To Help"
        //System.out.println("Page title is: " + driver.getTitle());
        //System.out.println("Page URL is: " + driver.getCurrentUrl());
        //jfHomePage.page4();
        // Should see: "About"
        //System.out.println("Page title is: " + driver.getTitle());
        //System.out.println("Page URL is: " + driver.getCurrentUrl());

    //}

    @Test
    public void JFSearchMovies() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://stage.jesusfilm.org/watch.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        JFHomePage jfHomePage = new JFHomePage();

        // Check the title of the page
        //System.out.println("Page title is: " + driver.getTitle());

        jfHomePage.clickicon();

        jfHomePage.enterSearchTerm("jesus").submitSearch();
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("search");
            }
        });
        // Should see: "Search Results - Cru"
        System.out.println("Page title is: " + driver.getTitle());

        driver.get("https://stage.jesusfilm.org/search.html?q=jesus");
        jfHomePage.clickmovie();

        jfHomePage.clicklanguagelist();

        jfHomePage.enterSearchLang("arabic").submitSearch();
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("jesus");
            }
        });
        driver.get("https://stage.jesusfilm.org");
        jfHomePage.logo();
        //jfHomePage.botton();
        // Should see: "Browse Films"
        //System.out.println("Page Title is: "+ driver.getTitle());
        //System.out.println("Page URL is: " + driver.getCurrentUrl());
        jfHomePage.page1();
        // Should see: "Watch"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        jfHomePage.page2();
        // Should see: "Strategies & Tools"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        jfHomePage.page3();
        // Should see: "How To Help"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        jfHomePage.page4();
        // Should see: "About"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());

    }
}