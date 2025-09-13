package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void checkPositiveLogin() {
        loginStep.loginWithPositiveCred();
    }

    @Test
    public void checkLoginWithEmptyPassword() {
        loginStep.loginWithEmptyPassword();
    }

    @Test
    public void checkLoginWithEmptyUserName() {
        loginStep.loginWithEmptyUserName();
    }

    @Test
    public void checkLoginWithTestCred() {
        loginStep.loginWithTestCred();
    }
}
