package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.DeleteDataBuyerAssessment;

public class DeleteDataBuyerAssessmentSteps {

    @Steps
    DeleteDataBuyerAssessment deleteDataBuyerAssessment;

    @And("I click delete button in buyer assessment")
    public void iClickDelete() { deleteDataBuyerAssessment.ClickDelete();
    }

    @And("I click yes for delete buyer assessment")
    public void iClickYes() { deleteDataBuyerAssessment.ClickYes();
    }

    @And("I click back for no delete buyer assessment")
    public void iClickBack() { deleteDataBuyerAssessment.ClickBack();
    }

    @Then("I see notification successfully for delete data buyer assessment")
    public void iCanSeeNotificationSuccessfullyForDeleteDataBuyerAssessment() {
    }

    @And("I back in database user page")
    public void backInDatabaseUserPage() {
        deleteDataBuyerAssessment.openUrl("https://office-buddy-web.vercel.app/co-working");
    }
}
