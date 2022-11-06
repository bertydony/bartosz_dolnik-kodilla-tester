package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        driver.findElement(By.xpath("//div/button[contains(text(),\"Ok, zgadzam się\")]")).click();

        WebElement category = driver.findElement(
                By.xpath("//*/div[@class=\"mp7g_oh mr3m_1 s4kyg\"]/select/optgroup"));
        Select categorySelect = new Select(category);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement inputField = driver.findElement(By.xpath("//*/input[@name=\"string\"]"));
        inputField.sendKeys("mavic mini");
        inputField.submit();
    }
}
