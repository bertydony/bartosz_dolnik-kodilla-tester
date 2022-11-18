package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public WebElement randomResult(){
        Random random = new Random();
        int randomPageId = random.nextInt(results.size());
        WebElement webElement = results.get(randomPageId);

        System.out.println(webElement.getTagName());
        System.out.println(webElement);

        return results.get(randomPageId);

    }
}