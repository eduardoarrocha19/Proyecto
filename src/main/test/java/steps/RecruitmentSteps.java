package steps;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import screenplay.actions.NavigateTo;
import screenplay.actions.AddCandidate;

public class RecruitmentSteps {
    @When("the user navigates to the Recruitment page")
    public void theUserNavigatesToTheRecruitmentPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavigateTo.theRecruitmentPage());
    }

    @When("the user adds a new candidate")
    public void theUserAddsANewCandidate() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddCandidate.withDetails("oscar", "andres", "roa"));
    }

    @Then("the candidate should be added successfully")
    public void theCandidateShouldBeAddedSuccessfully() {
        // Add verification steps here
    }
}