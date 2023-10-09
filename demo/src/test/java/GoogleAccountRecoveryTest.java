//package com.example.demo.student.repository;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.mockito.verification.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GoogleAccountRecoveryTest {
    public static WebDriver driver = null;
    //WebDriverWait wait;

    @BeforeTest
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void firstTestCase() {
        try {
            System.out.println("Launch Gmail");
            driver.get("https://www.gmail.com/");
            Assert.assertEquals("Gmail", driver.getTitle());

            System.out.println("Enter email");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
            Assert.assertEquals(true, email_phone.isDisplayed());
            email_phone.sendKeys("testexamplesample16@gmail.com");

            System.out.println("Click Next button");
            WebElement nextBtn = driver.findElement(By.id("identifierNext"));
            Assert.assertEquals(true, nextBtn.isDisplayed());
            nextBtn.click();

            System.out.println("Click Forgot Password link");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement forget_password = driver.findElement(By.xpath("//span[text()='Forgot password?']"));

            wait.until(ExpectedConditions.visibilityOf(forget_password));
            Assert.assertEquals(true, forget_password.isDisplayed());
            forget_password.click();
            System.out.println("Enter last known password");
            WebElement tryLink = driver.findElement(By.xpath("//span[text()='Try another way']"));

            wait.until(ExpectedConditions.visibilityOf(tryLink));
            Assert.assertEquals(true, tryLink.isDisplayed());
            WebElement lastPasswd = driver.findElement(By.name("password"));
            lastPasswd.sendKeys("testdemEX24$");

            System.out.println("Click Next");
            WebElement pwd_next = driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span"));
            Assert.assertEquals(true, pwd_next.isDisplayed());
            pwd_next.click();

            System.out.println("Check Get a verification code shown");
            WebElement get_ver_code = driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form" + "/span/section/header/div/h2/span"));

            wait.until(ExpectedConditions.visibilityOf(get_ver_code));
            Assert.assertEquals(true, get_ver_code.isDisplayed());
        } catch (Exception e) {
        }
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        System.out.println("The driver has been closed.");
    }
}