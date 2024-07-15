package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.HomePage;

public class GoToRecruitment implements Task {

    public static GoToRecruitment recruitmentPage() {
        return new GoToRecruitment();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(HomePage.RECRUITMENT_MENU)
        );
    }
}
