package pages;

import com.codeborne.selenide.Condition;
import tests.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static dto.Elements.*;

public class ProjectPage extends BasePage {

    public ProjectPage openPage() {
        open("/projects");
        return this;
    }

    public ProjectPage waitUntilOpen() {
        logo.shouldBe(visible).shouldHave(text(CREATE_NEW_PROJECT));
        return this;
    }

    public ProjectPage createProject(String project) {
        $(byText(CREATE_NEW_PROJECT)).click();
        $(PROJECT_NAME).setValue(project);
        CREATE_PROJECT.click();
        openPage();
        deleteProject(project);
        return this;
    }

    public ProjectPage deleteProject(String project) {
        $(byText(project))
                .ancestor("tr")
                .find(OPEN_ACTION_MENU)
                .click();
        $(REMOVE_BUTTON).click();
        $x(DELETE_PROJECT).click();
        return this;
    }

    public ProjectPage checkProjectIsDeleted(String project) {
        $(project).shouldNotBe(visible);
        return this;
    }
}

