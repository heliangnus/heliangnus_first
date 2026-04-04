package com.bjsxt.cucumberTest.steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArgumentsStep { //´«²ÎÊý: it will pass the param which from arguments.feature to here, iterator to run
//right click testng.xml to run

    @Given("open jingdong website")
    public void open_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("open jingdong website");
    }

    @When("search {string}  {int}")
    public void search_phone(String name, Integer no) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("search "+name+"no: "+no);
    }

    @Then("display  {string}")
    public void display(String name) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("display "+name);
    }



    @When("I have a {color} ball")
    public void search(Colour color) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(color);
    }



    // user defined Parameters as datasources
    @ParameterType(value = "red|yellow|green")
    public Colour color(String color){
        return new Colour(color);
    }
    @Then("display test")
    public void display_test() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("display test");
    }



}
