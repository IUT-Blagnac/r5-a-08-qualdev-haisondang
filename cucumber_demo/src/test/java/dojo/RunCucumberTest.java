package dojo;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Cucumber.class)
public class RunCucumberTest {
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Given("{string} who wants to buy a drink")
    public void who_wants_to_buy_a_drink(String string) {
        order = new Order();
        order.declareOwner(string);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for(String string) {
        order.declareTarget(string);
    }
    @Then("there is {int} cocktail in the order")
    public void there_is_cocktail_in_the_order(int int1) {
        List<String> cocktails =  order.getCocktails();
        assertEquals(int1, cocktails.size());
    }
}
