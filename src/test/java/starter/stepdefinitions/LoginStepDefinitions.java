package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.search.WikipediaArticle;

public class LoginStepDefinitions {
    @Given("{actor} has an active account")
    public void has_an_active_account(Actor actor) {
        actor.wasAbleTo(NavigateTo.SerenityDemo());
    }

    @When("{actor} inputs their valid credentials")
    public void inputs_their_valid_credentials(Actor actor) {
        DoLogin.withCredentials("admin","serenity");
    }

    @Then("{actor} should have access to his account")
    public void should_have_access(Actor actor) {

    }
}
