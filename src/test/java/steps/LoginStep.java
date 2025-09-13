package steps;

import pages.LoginPage;
import pages.ProjectPage;

public class LoginStep {

    LoginPage loginPage;
    ProjectPage projectPage;

    public LoginStep() {
        loginPage = new LoginPage();
        projectPage = new ProjectPage();
    }

    public void loginWithPositiveCred() {
        loginPage.open().login("qaengin33r@gmail.com", "gtyqqWe265Waab");
    }

    public void loginWithEmptyPassword() {
        loginPage.open().login("qaengin33r@gmail.com", "");
        loginPage.checkErrorMessage("This field is required");
    }

    public void loginWithEmptyUserName() {
        loginPage.open().login("", "gtyqqWe265Waab");
        loginPage.checkErrorMessage("This field is required");
    }

    public void loginWithTestCred() {
        loginPage.open().login("Test", "Test");
        loginPage.checkPopUpErrorMessage();
    }
}
