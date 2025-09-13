package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectTest extends BaseTest{

    @Test
    public void checkCreateProject() {
        loginStep.loginWithPositiveCred();
        projectStep.checkCreateProject();
    }

    @Test
    public void checkDeleteProject() {
        loginStep.loginWithPositiveCred();
        projectStep.checkDeleteProject();
    }
}
