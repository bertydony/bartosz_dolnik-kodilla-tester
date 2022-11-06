package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement cookiesAc = driver.findElement(By.xpath
                ("//div/button[contains(text(),\"Ok, zgadzam się\")]"));
        wait.until(ExpectedConditions.visibilityOf(cookiesAc)).click();

        WebElement category = driver.findElement(
                By.xpath("//*/div[@class=\"mp7g_oh mr3m_1 s4kyg\"]/select/optgroup/option[3]"));
        wait.until(ExpectedConditions.visibilityOf(category)).click();

        WebElement inputField = driver.findElement(By.xpath("//*/input[@name=\"string\"]"));
        wait.until(ExpectedConditions.visibilityOf(inputField));
        inputField.sendKeys("mavic mini");
        inputField.submit();
    }
}
