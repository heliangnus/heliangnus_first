package com.bjsxt1.cumberTest.steps1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//When search xiaomiphone
//      Then display xiaomi pro
public class ArgementsStep1 {

    @Given("open jingdong website")
    public void openPhone(){
        System.out.println("open jingdong website>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @When("search xiaomiphone")
    public void searchPhone(){
        System.out.println("search xiaomiphone");
    }


    @Then("display xiaomi pro")
    public void displayPhone(){
        System.out.println("Then display xiaomi pro");
    }


    //When search huawei miphone
    //Then display huawei pro

    @When("search huawei miphone")
    public void search_huawei_miphone(){
        System.out.println("When search huawei miphone");
    }

    @Then("display huawei pro")
    public void displayHuaweiPhone(){
        System.out.println("display huawei pro");
    }

/*   //正则和{string}二选一匹配出现即可
    @When("^search \"(.*)\"$")
    public void search_xiaomi_param(String phone){
        System.out.println("search "+phone);
    }
    @Then("^display \"(.*)\"$")
    public void display(String pro){
        System.out.println("Then display "+pro);
    }
*/
    @When("search {string}")
    public void search_xiaomi_param_01(String phone){
        System.out.println("search "+phone);
    }


    @Then("display {string}")
    public void display_01(String pro){
        System.out.println("Then display "+pro);
    }


    //Scenario-Outline参数化执行
    @When("search_outline {string}")
    public void search_xiaomi_param_outline01(String phone){
        System.out.println("search_outline "+phone);
    }

    @Then("display_outline {string}")
    public void display_outline01(String pro){
        System.out.println("Then display_outline "+pro);
    }


}
