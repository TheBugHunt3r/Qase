package tests;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectPage;
import steps.LoginStep;
import steps.ProjectStep;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    LoginPage loginPage;
    ProjectPage projectPage;
    LoginStep loginStep;
    ProjectStep projectStep;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://app.qase.io";
        Configuration.timeout = 15000;
        Configuration.clickViaJs = true;
        //Configuration.headless = true;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-infobars");
        Configuration.browserCapabilities = options;
        //Configuration.assertionMode = AssertionMode.SOFT;

        loginPage = new LoginPage();
        projectPage = new ProjectPage();
        loginStep = new LoginStep();
        projectStep = new ProjectStep();

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                        .screenshots(false)
                //.savePageSource(true)
        );
    }

    @AfterMethod
    public void tearDown() {
        if (getWebDriver() != null) {
            getWebDriver().quit();
        }
    }
}
