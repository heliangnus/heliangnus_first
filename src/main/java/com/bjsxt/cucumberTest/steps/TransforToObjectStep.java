package main.java.com.bjsxt.cucumberTest.steps;

import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class TransforToObjectStep { //传参数: it will pass the param which from arguments.feature to here, iterator to run
//right click testng.xml to run
/*
    @DataTableType(replaceWithEmptyString = "[blank]")  //dataSource provider which send to the method by iterator.
    public Autor transferToAutor(Map<String,String> smap){
            return new Autor(smap.get("firstNa"),
                    smap.get("secNa"),
                    smap.get("birth"));
    }
//blank means if setvalue show as ''

    @Given("open baidu website")
    public void openBaiduWebsite(List<Autor> autors) {
        System.out.println("open jing website");
            System.out.println(autors);
    }

/*
    //封装成单个对象输出,对应的feature也得 改变
    @Given("open baidu website")
    public void openBaiduWebsite(@Transpose List<Autor> autors) {
        System.out.println("open jing website");
        System.out.println(autors);
    }
*/
/*
    @When("search {string}")
    public void search(String arg0) {
        System.out.println("search "+arg0);
    }

    @Then("display  {string}")
    public void display(String arg0) {
        System.out.println("display "+arg0);
    }

*/

// 这里看成@Given 关联起来： public void openPage(List<Autors> alist> 参数与*.feature |×|×|对应起来，
// 里面省略了for循环输出相关参数传入各自传入的方法体操作. it miss the iterator to output the setps which pass the each params.
//如果是 json对象作为参数需要在@docStringType来作关联，然后通过@Given来串接 by 参数.

  //  这里放置的就是@Given对应的方法体中方法的参数List<Autor> autors. 省略了传入各个参数执行的方法体步骤，遍历输出.
}
