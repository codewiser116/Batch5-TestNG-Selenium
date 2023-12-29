package tests;

import org.testng.annotations.Test;

public class SupportedDietsTests {


    @Test(groups = {"smokeTest", "regressionTest"})
    public void vegetarianDietTest(){
        System.out.println("vegetarianDietTest");
    }

    @Test (groups = "regressionTest")
    public void mediterraneanDietTest(){
        System.out.println("mediterraneanDietTest");
    }

    @Test(groups = {"smokeTest", "regressionTest"})
    public void ketoDietTest(){
        System.out.println("ketoDietTest");
    }

    @Test (groups = "regressionTest")
    public void paleoDietTest(){
        System.out.println("paleoDietTest");
    }

}
