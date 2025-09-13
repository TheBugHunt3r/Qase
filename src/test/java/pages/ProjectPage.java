package pages;

import com.codeborne.selenide.Condition;
import tests.BaseTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProjectPage extends BasePage {

    public ProjectPage openPage() {
        open("/projects");
        return this;
    }

    public ProjectPage waitUntilOpen() {
        $(byText("Create new project")).shouldBe(visible);
        return this;
    }

    public ProjectPage createProject(String project) {
        $(byText("Create new project")).click();
        $("#project-name").setValue(project);
        $(byText("Create project")).click();
        return this;
    }

    public ProjectPage deleteProject(String project) {
        $(byText(project))
                .ancestor("tr")
                .find("button[aria-label='Open action menu']")
                .click();
        $("[data-testid=remove]").click();
        $x("//span[text()='Delete project']").click();
        return this;
    }

    public ProjectPage checkProjectIsDeleted(String project) {
        $(project).shouldNotBe(visible);
        return this;
    }
}

