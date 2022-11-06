package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroCssTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement cookiesAccept = driver.findElement(By.cssSelector(".msts_pt > button"));
        wait.until(ExpectedConditions.visibilityOf(cookiesAccept)).click();

        WebElement category = driver.findElement(By.cssSelector(".mp7g_oh > select"));
        Select categorySelect = new Select(category);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement inputField = driver.findElement(By.cssSelector("div > form > input"));
        wait.until(ExpectedConditions.visibilityOf(inputField));
        inputField.sendKeys("mavic mini");
        inputField.submit();

        List<WebElement> searchItem = driver.findElements(By.cssSelector("section > article"));
        System.out.println(searchItem.get(1).getText());
        System.out.println("--------");
        System.out.println(searchItem.get(2).getText());
        System.out.println("--------");
        System.out.println(searchItem.get(60).getText());
    }
}
