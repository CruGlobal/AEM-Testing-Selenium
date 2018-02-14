package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.JFHomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JFExampleIT extends DriverBase {

    @Test
    public void JFOpenHomePage() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();
        driver.manage().window().setSize(new Dimension(1124, 850));

        // And now use this to visit Google
        driver.get("https://stage.jesusfilm.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Check the title of the page
        System.out.println("Testing site: stage.jesusfilm.org: " );
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    public void JFSearchMovies() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://stage.jesusfilm.org/search.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        JFHomePage jfHomePage = new JFHomePage();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        //jfHomePage.clickicon();

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

    }
    @Test
    public void JFSearchLanguage() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://stage.jesusfilm.org/search.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        JFHomePage jfHomePage = new JFHomePage();

        //jfHomePage.clickmovie();

        //jfHomePage.clicklanguagelist();

        jfHomePage.enterSearchTerm("arabic").submitSearch();
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("search");
            }
        });

    }
    @Test
    public void JFBrowsePages() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        // And now use this to visit Google
        driver.get("https://stage.jesusfilm.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        driver.get("https://stage.jesusfilm.org/watch.html");
        // Should see: "Home Page"
        System.out.println("Page Title is: "+ driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.jesusfilm.org/strategies-and-tools.html");
        // Should see: "Watch"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.jesusfilm.org/strategies-and-tools.html");
        // Should see: "Strategies & Tools"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.jesusfilm.org/how-to-help.html");
        // Should see: "How To Help"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.jesusfilm.org/about.html");
        // Should see: "About"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
        driver.get("https://stage.jesusfilm.org/blog-and-stories.html");
        // Should see: "Blog & Stories"
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
    }
}