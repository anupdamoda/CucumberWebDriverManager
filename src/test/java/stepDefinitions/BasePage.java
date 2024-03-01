package stepDefinitions;

import io.cucumber.java.en.Given;

import static pages.HomePage.click_hamburger_menu;
import static pages.HomePage.click_signIn_link;

public class BasePage {
    @Given("^User navigates to the Login page$")
    public void user_navigates_to_the_Login_page() throws Throwable {
        click_hamburger_menu();
        click_signIn_link();

    }
}