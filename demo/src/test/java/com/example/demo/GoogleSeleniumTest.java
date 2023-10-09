package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

// public class GoogleSeleniumTest {

//    URL local = new URL("http://localhost:9515");
//    WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome()
//    );
//    driver.manage().window().maximize();
//    driver.get("https://www.google.com");
//    driver.findElement(By.name("q")).sendKeys("Selenium");
//            driver.findElement(By.name("btnK")).submit();
    //private WebDriver driver;

//    @BeforeEach
//    public void setUp() {
//        // Set the path to your ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    public void testGoogleSearch() {
//        // Navigate to Google
//        driver.get("https://www.google.com");
//
//        // Find the search input element
//        WebElement searchBox = driver.findElement(By.name("q"));
//
//        // Type a search query
//        searchBox.sendKeys("Selenium automation");
//
//        // Submit the search form
//        searchBox.submit();
//
//        // Wait for the results page to load
//        driver.findElement(By.id("resultStats"));
//
//        // Perform an assertion (e.g., checking the page title)
//        String pageTitle = driver.getTitle();
//        assert pageTitle.contains("Selenium automation");
//    }
//
//    @AfterEach
//    public void tearDown() {
//        // Close the browser
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}