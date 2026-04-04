package com.bjsxt.cucumberTest.steps;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestNgTest {

    @Test(groups = {"systemtest"})
    @Parameters("test1")
    public void paramTest(String test1) {
        System.out.println("dddddoooo  " + test1);
    }

    @Test(enabled = false)
    public void justTest() {
        System.out.println("yyyyyyyyyyyy  ");
    }


    //define dataprovider as datasource.
    @DataProvider(name = "user")
    public Object[][] User() {
        return new Object[][]{
                {"root", "heliang"},
                {"clm.com", "tankxiao"},
                {"tank", "xiao"}
        };
    };


    //test group
    @Test(groups = {"functiontest"}, dataProvider = "user")  //iterator to use the datasource
    public void verfiUser(String uname, String pwd){
        System.out.println("username: " + uname + "  " + "pwd: " + pwd);
    }



    @Test(groups={"functiontest"})
    public  void showGroup(){
        System.out.println("i am the same group");
    }


    public static void main(String[] args){
         Object[][] userte = new Object[][]{
                        {"root", "heliang"},
                        {"clm.com", "tankxiao"},
                        {"tank", "xiao"}
                };
         List list = new ArrayList();
         list.add("root");
         list.add("heliang");
         list.add("climcn");
         list.add("tankxiao");
         System.out.println(list);

        System.out.println( Arrays.asList(userte));
        for(int i=0;i<userte.length;i++){
            for(int j=0;j<userte[i].length;j++){
                System.out.print(userte[i][j] +" ");
            }
            System.out.println();
        }

    }
}