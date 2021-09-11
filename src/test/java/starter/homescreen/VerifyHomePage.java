package starter.homescreen;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class VerifyHomePage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(HomeScreen.ORGANIZATION_ICON);
    }
}
