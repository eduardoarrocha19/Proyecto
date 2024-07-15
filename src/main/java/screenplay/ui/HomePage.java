package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target RECRUITMENT_MENU = Target.the("Recruitment menu").located(By.linkText("Recruitment"));
}