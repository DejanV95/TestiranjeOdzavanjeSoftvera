//package com.example.demo;
//
//import java.io.IOException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ChromeTest {
//
//    /**
//     * @param args
//     * @throws InterruptedException
//     * @throws IOException
//     */
//    public static void main(String[] args) throws InterruptedException, IOException {
//        // Telling the system where to find the Chrome driver
//        System.setProperty(
//                "webdriver.chrome.driver",
//                "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//
//        WebDriver webDriver = new ChromeDriver();
//
//        // Open google.com
//        webDriver.navigate().to("http://www.google.com");
//
//        String html = webDriver.getPageSource();
//
//        // Printing result here.
//        System.out.println(html);
//
//        webDriver.close();
//        webDriver.quit();
//    }
//}