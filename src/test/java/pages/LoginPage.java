package pages;

import com.codeborne.selenide.Selenide;

import java.util.concurrent.locks.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private final String USER_FIELD = "[name=email]";
    private final String PASSWORD_FIELD = "//*[@name='password']";
    private final String ERROR_MESSAGE = "//small";

    public LoginPage open() {
        Selenide.open("/login");
        return this;
    }

    public ProjectPage login(String user, String password) {
        $(USER_FIELD).setValue(user);
        $x(PASSWORD_FIELD).setValue(password).submit();
        return new ProjectPage();
    }

    public void checkErrorMessage(String error) {
        $x(ERROR_MESSAGE).shouldHave(text(error));
    }

    public LoginPage checkPopUpErrorMessage() {
        $(byText("Value 'Test' does not match format email of type string")).shouldBe(visible);
        return this;
    }
}
