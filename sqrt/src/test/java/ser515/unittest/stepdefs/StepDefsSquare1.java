
package ser515.unittest.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;
import ser515.unittest.SimpleSquareRootFunction;

public class StepDefsSquare1 {
    int testInt;
    double result;

    @Given("I have an integer square {string}")
    public void i_have_an_integer_square(String string) {
        // Write code here that turns the phrase above into concrete actions
        testInt = Integer.parseInt(string);
    }

    @When("I compute the square function of this number")
    public void i_compute_the_square_root() {
        result = SimpleSquareRootFunction.squareMe(testInt);
    }

    @Then("I should return a positive number after square")
    public void i_should_return_a_positive_number_square() {
        assertTrue(result > 0.0);
    }
}
