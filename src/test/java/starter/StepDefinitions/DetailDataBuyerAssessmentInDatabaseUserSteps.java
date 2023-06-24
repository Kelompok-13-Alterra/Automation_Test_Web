package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.DetailDataBuyerAssessmentInDatabaseUser;

public class DetailDataBuyerAssessmentInDatabaseUserSteps {

    @Steps
    DetailDataBuyerAssessmentInDatabaseUser detailDataBuyerAssessmentInDatabaseUser;

    @And("I click button see all in data buyer assessment")
    public void iClickButtonSeeAll() { detailDataBuyerAssessmentInDatabaseUser.ClickButtonSeeAll();
    }
    @And("I click details")
    public void iClickDetails() { detailDataBuyerAssessmentInDatabaseUser.ClickDetails();
    }
    @And("I can see assessment from buyer")
    public void iCanSeeAssessmentFromBuyer() {
    }
}
