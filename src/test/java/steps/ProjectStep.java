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

    public void checkCreateProject(String  project) {
        projectPage.waitUntilOpen()
                .createProject(project)
                .openPage()
                .waitUntilOpen();
    }

    public void checkDeleteProject(String project) {
        checkCreateProject(project);
        projectPage.deleteProject(project)
                .checkProjectIsDeleted(project);
    }
}
