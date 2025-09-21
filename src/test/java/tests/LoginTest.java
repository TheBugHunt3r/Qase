package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void checkPositiveLogin() {
        loginStep.loginWithPositiveCred(user, password);
    }

    @Test
    public void checkLoginWithEmptyPassword() {
        loginStep.loginWithEmptyPassword(user, "");
    }

    @Test
    public void checkLoginWithEmptyUserName() {
        loginStep.loginWithEmptyUserName("", password);
    }

    @Test
    public void checkLoginWithTestCred() {
        loginStep.loginWithTestCred("test", "test");
    }
}
