package steps;

import pages.LoginPage;
import pages.ProjectPage;

public class ProjectStep {

    LoginPage loginPage;
    ProjectPage projectPage;

    public ProjectStep() {
        loginPage = new LoginPage();
        projectPage = new ProjectPage();
    }

    public void checkCreateProject() {
        projectPage.waitUntilOpen()
                .createProject("Alisa")
                .openPage()
                .waitUntilOpen();
    }

    public void checkDeleteProject() {
        projectPage.waitUntilOpen()
                .createProject("Alisa")
                .openPage()
                .waitUntilOpen();
        projectPage.deleteProject("Alisa")
                .checkProjectIsDeleted("Alisa");
    }
}
