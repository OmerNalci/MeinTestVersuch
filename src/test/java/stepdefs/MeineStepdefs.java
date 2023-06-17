package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MeineStepdefs extends BaseSteps {

    @Given("Benutzer geht auf {string}")
    public void benutzerGehtAuf(String url) {
        driver.get(url);
    }

    @When("Benutzer loggt sich ein")
    public void benutzerLoggtSichEin() {
        click(lMyAccountLink);
        click(lLoginLink);
        sendKeys(lFormEmail, eMail);
        sendKeys(lFormPassword, password);
        click(lLoginButton);
    }

    @Then("Benutzer ist auf der Startseite")
    public void benutzerIstAufDerStartseite() {
        click(lMyAccountLink);
        waitVisibility(lLogoutButton);
    }

    @Then("Warten zum Ansehen")
    public void wartenZumAnsehen() {
        sleep(3000);
    }
}
