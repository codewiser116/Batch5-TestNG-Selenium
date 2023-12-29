package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class HomePageTests {


    //BREAK UNTIL 8:25

    @Test(groups = "smokeGroup")
    public void test1() throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.eatthismuch.com/");

        System.out.println("this is the end of test 1");
    }


    @Test(groups = "regression")
    public void test2() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        System.out.println("this is the end of test 2");
    }

    // it took 19 sec
}
