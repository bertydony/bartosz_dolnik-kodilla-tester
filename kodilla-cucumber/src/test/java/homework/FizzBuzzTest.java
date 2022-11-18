package homework;

import io.cucumber.java8.En;
import org.junit.Assert;
import seasonchecker.SeasonChecker;

public class FizzBuzzTest implements En {
    private int number;
    private String answer;

    public FizzBuzzTest(){

        Given("given number is {int}", (Integer num) -> {
            this.number = num;
        });
        When("When is not 'None' make action", () -> {
            FizzBuzz fizzBuzz2 = new FizzBuzz();
            this.answer = fizzBuzz2.fizzBuzz(this.number);
        });

        Then("Is given {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
