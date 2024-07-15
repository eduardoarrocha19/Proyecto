package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.LoginPage;

public class PerformLogin implements Task {
    private final String username;
    private final String password;

    public PerformLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static PerformLogin withCredentials(String username, String password) {
        return new PerformLogin(username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
