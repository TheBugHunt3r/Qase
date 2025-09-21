package dto;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Elements {

    public static String ERROR_MESSAGE = "This field is required";
    public static SelenideElement logo = $x("//span[text()='Create new project']");
    public static String CREATE_NEW_PROJECT = "Create new project";
    public static String PROJECT_NAME = "#project-name";
    public static String OPEN_ACTION_MENU = "button[aria-label='Open action menu']";
    public static String REMOVE_BUTTON = "[data-testid=remove]";
    public static String DELETE_PROJECT = "//span[text()='Delete project']";
    public static String MARK_IS_FAVORITE = "//a[@tooltip-text='Mark as project favorite.']";
    public static SelenideElement CREATE_PROJECT = $("//button[@type='submit']");
}
