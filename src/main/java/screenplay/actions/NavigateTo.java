package screenplay.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.HomePage;

public class NavigateTo implements Task {
    private final Target target;

    public NavigateTo(Target target) {
        this.target = target;
    }

    public static NavigateTo theRecruitmentPage() {
        return new NavigateTo(HomePage.RECRUITMENT_MENU);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(target)
        );
    }
}