package steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import screenplay.actions.Login;

public class LoginSteps {
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").wasAbleTo(Open.browserOn().the(LoginPage.class));
    }

    @When("the user logs in with valid credentials")
    public void theUserLogsInWithValidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials("Admin", "admin123"));
    }

    @Then("the user should see the home page")
    public void theUserShouldSeeTheHomePage() {
        // Add verification steps here
    }
}