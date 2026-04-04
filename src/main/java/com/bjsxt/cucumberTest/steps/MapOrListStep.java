package com.bjsxt.cucumberTest.steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MapOrListStep { //传参数: it will pass the param which from arguments.feature to here, iterator to run
//right click testng.xml to run

    //这里放置的就是@Given对应的方法体中方法的参数List<Map<String,String>> alist. 省略了传入各个参数执行的方法体步骤，遍历输出.
    /*
    @Given("open jingdonggggg website")
    public void openJingdongggggWebsite(List<String> alist) {
        System.out.println("open jingdonggggg website");
        for(String s : alist){
            System.out.println(s);
        }
    }
*/
/*
    @Given("open jingdonggggg website")
    public void openJingdongggggWebsite(List<Map<String,String>> alist) {
        System.out.println("open jingdonggggg website");
            System.out.println(alist);
    }


    @When("search {string}")
    public void search(String arg0) {
        System.out.println("search "+arg0);
    }

    @Then("display  {string}")
    public void display(String arg0) {
        System.out.println("display "+arg0);
    }

*/


}
