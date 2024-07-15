package screenplay.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.RecruitmentPage;

public class AddCandidate implements Task {
    private final String firstName;
    private final String middleName;
    private final String lastName;

    public AddCandidate(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public static AddCandidate withDetails(String firstName, String middleName, String lastName) {
        return new AddCandidate(firstName, middleName, lastName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(RecruitmentPage.ADD_BUTTON),
            Enter.theValue(firstName).into(RecruitmentPage.FIRST_NAME_FIELD),
            Enter.theValue(middleName).into(RecruitmentPage.MIDDLE_NAME_FIELD),
            Enter.theValue(lastName).into(RecruitmentPage.LAST_NAME_FIELD)
        );
    }
}