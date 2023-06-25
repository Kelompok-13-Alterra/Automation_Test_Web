package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.Logout;

public class LogoutSteps {
    @Steps
    Logout logout;
    @And("I click logout button")
    public void iClickLogoutButton() { logout.ClickLogoutButton();

    }

    @Then("I click yes button of logout")
    public void iClickYesButtonOfLogout() { logout.ClickYesLogoutButton();

    }
    @Then("I click back button of logout")
    public void iClickBackButtonOfLogout() { logout.ClickBackLogoutButton();
    }

    @And("I am on the landing pages")
    public void iAmOnTheLandingPages() {
    }


}
