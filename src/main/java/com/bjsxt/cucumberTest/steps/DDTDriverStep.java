package main.java.com.bjsxt.cucumberTest.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DDTDriverStep {

    @Given("openBaidu page")
    public void openbaiduPage() {
        System.out.println("openBaidu page");
    }

    @When("getput {string}")
    public void getput(String query) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(query);
    }

    @Then("output {string}")
    public void outputShow(String title) {
        System.out.println(title);
    }


}
