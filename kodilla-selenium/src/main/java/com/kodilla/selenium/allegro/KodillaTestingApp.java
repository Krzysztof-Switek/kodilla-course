package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class KodillaTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-drivers/Chrome/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(" --remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // Update WebDriverWait constructor with a Duration object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://kodilla.com/pl/test/store");

            List<WebElement> products = driver.findElements(By.cssSelector("#elements-wrapper"));

            // Wyświetl informacje o produkcie
            for (WebElement product : products) {
                String productInfo = product.getText();
                System.out.println(productInfo);
                System.out.println("-------------------------------");
            }

            driver.quit();

    }
}
