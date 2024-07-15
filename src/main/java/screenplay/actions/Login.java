package screenplay.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.LoginPage;

public class Login implements Task {
    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login withCredentials(String username, String password) {
        return new Login(username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
            Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
            Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}