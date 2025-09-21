package steps;

import pages.LoginPage;
import pages.ProjectPage;

import static dto.Elements.ERROR_MESSAGE;

public class LoginStep {

    LoginPage loginPage;
    ProjectPage projectPage;

    public LoginStep() {
        loginPage = new LoginPage();
        projectPage = new ProjectPage();
    }

    public void loginWithPositiveCred(String user, String password) {
        loginPage.open().login(user, password);
    }

    public void loginWithEmptyPassword(String user, String password) {
        loginPage.open().login(user, password);
        loginPage.checkErrorMessage(ERROR_MESSAGE);
    }

    public void loginWithEmptyUserName(String user, String password) {
        loginPage.open().login(user, password);
        loginPage.checkErrorMessage(ERROR_MESSAGE);
    }

    public void loginWithTestCred(String user, String password) {
        loginPage.open().login(user, password);
        loginPage.checkPopUpErrorMessage();
    }
}
