package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeDependOnTests {

    /*
        1. wakeUp
        2. eat
        3. brushTeeth
        4. driveToCity
        5. work
        6. driveHome
        7. eatDinner
        8. goToSleep

        create 2 tests: smoke and regression
            inside smoke test:
                - wakeup, goToSleep
            inside regression test:
                - all methods from this class
     */

    @BeforeClass (groups = "smoke")
    public static void beforeClass(){
        System.out.println("THIS IS BEFORE CLASS");
    }

    @BeforeTest(groups = "smoke")
    public static void beforeTest(){
        System.out.println("THIS IS BEFORE TEST");
    }

    @BeforeGroups (groups = "smoke")
    public static void beforeGroup(){
        System.out.println("THIS IS BEFORE GROUP");
    }

    @Test(groups = "smoke")
    public void noDepend(){
        System.out.println("no depend");
    }


    @Test (groups = "smoke")
    public void wakeUp(){
        System.out.println("wake up");
    }

    @Test (dependsOnMethods = "brushTeeth")
    public void driveToCity(){
        System.out.println("drive to city");
    }

    @Test (dependsOnMethods = "wakeUp")
    public void eat(){
        System.out.println("eat");
    }

    @Test (dependsOnMethods = "eat")
    public void brushTeeth(){
        System.out.println("brush teeth");
    }


    @Test(dependsOnMethods = "eatDinner")
    public void goToSleep(){
        System.out.println("go to sleep");
    }

    @Test (dependsOnMethods = "driveHome")
    public void eatDinner(){
        System.out.println("eat dinner");
    }

    @Test (dependsOnMethods = "work")
    public void driveHome(){
        System.out.println("drive home");
    }

    @Test (dependsOnMethods = "driveToCity")
    public void work(){
        System.out.println("work");
    }





}
