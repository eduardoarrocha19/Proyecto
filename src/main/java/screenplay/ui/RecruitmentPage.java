package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage {
    public static final Target ADD_BUTTON = Target.the("add button").located(By.cssSelector(".oxd-button--secondary:nth-child(1)"));
    public static final Target FIRST_NAME_FIELD = Target.the("first name field").located(By.name("firstName"));
    public static final Target MIDDLE_NAME_FIELD = Target.the("middle name field").located(By.name("middleName"));
    public static final Target LAST_NAME_FIELD = Target.the("last name field")).located(By.name("lastName"));
}