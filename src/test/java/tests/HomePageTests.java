package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class HomePageTests {
    //BREAK UNTIL 8:25

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.eatthismuch.com/");

        Thread.sleep(20000);
        System.out.println("this is the end of test 1");
    }


    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(15000);
        System.out.println("this is the end of test 2");
    }

    // it took 19 sec
}
