package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzSteps {
    private int input;
    private String output;

    @Given("the FizzBuzz game is available")
    public void theFizzBuzzGameIsAvailable() {
    }

    @When("the number {int} is provided")
    public void theNumberIsProvided(int number) {
        input = number;
        output = FizzBuzz.playFizzBuzz(number);
    }

    @Then("the game should return {string}")
    public void theGameShouldReturn(String expectedOutput) {
        assertEquals(expectedOutput, output);
    }
}
