package tests;

import org.testng.annotations.Test;

public class BrowseFoodsTests {

    /*
    ADD 3 TEST METHODS WITH SOME PRINTS
    ADD THIS CLASS IN SMOKE TEST XML FILE
     */

    @Test(groups = {"smokeGroup", "regression"}, priority = 3)
    public void eat(){
        System.out.println("eating in browser foods");
    }

    @Test (priority = 1)
    public void sleep(){
        System.out.println("sleeping in browse foods");
    }

    @Test(groups = "smokeGroup", priority = 2)
    public  void drink(){
        System.out.println("drinking in browse foods");
    }

}
