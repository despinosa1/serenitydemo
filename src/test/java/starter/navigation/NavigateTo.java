package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable SerenityDemo() {
        return Task.where("{0} opens the Serenity Demo home page",
                Open.browserOn().the(SerenityDemoHomepage.class));
    }
}
