package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private String today;
    private String actualAnswer;

    @Given("^today is (.+)$")
    public void today_is(String day) {
        today = day;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = isItFriday(today);
    }

    @Then("I should be told (.+)$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    private String isItFriday(String today) {
        // Implement logic to check if it's Friday
        // For simplicity, let's assume it's Friday if today is "Friday"
        return today.equals("Friday") ? "TGIF" : "Nope";
    }
}
