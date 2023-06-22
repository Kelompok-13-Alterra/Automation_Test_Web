package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.DeleteOffice;

public class DeleteSteps {
    @Steps
    DeleteOffice deleteOffice;
    @And("I click button delete office")
    public void iClickButtonDeleteOffice() { deleteOffice.ClickDeleteOfficeButton();

    }

    @And("I click yes of delete office")
    public void iClickYesOfDeleteOffice() { deleteOffice.ClickYesDeleteOfficeButton();

    }
    @And("I click back of delete office")
    public void iClickBackOfDeleteOffice() { deleteOffice.ClickBackDeleteOfficeButton();
    }

    @Then("I can see notif successfully delete office")
    public void iCanSeeNotifSuccessfullyDeleteOffice() {
    }


}
