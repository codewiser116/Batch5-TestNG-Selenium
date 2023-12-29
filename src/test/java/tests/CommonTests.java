package tests;

import org.testng.annotations.Test;

public class CommonTests {

    @Test(groups = "smokeTest")
    public void login() {
        System.out.println("This is login method");
    }

    @Test
    public void signUp() {
        System.out.println("This is sign up method");
    }

    @Test
    public void resetPassword() {
        System.out.println("This is reset password method");
    }
}
