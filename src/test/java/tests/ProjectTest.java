package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectTest extends BaseTest{

    @Test
    public void checkCreateProject() {
        loginStep.loginWithPositiveCred(user, password);
        projectStep.checkCreateProject("Alisa");
    }

    @Test
    public void checkDeleteProject() {
        loginStep.loginWithPositiveCred(user, password);
        projectStep.checkDeleteProject("Alisa");
    }
}
