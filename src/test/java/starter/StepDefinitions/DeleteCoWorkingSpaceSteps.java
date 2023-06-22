package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.DeleteCoWorkingSpace;

public class DeleteCoWorkingSpaceSteps {

    @Steps
    DeleteCoWorkingSpace deleteCoWorkingSpace;

    @And("I click button delete")
    public void iClickButtonDelete() { deleteCoWorkingSpace.ClickButtonDelete();
    }

    @And("I click yes for delete")
    public void iClickYesForDelete() { deleteCoWorkingSpace.ClickYesForDelete();
    }

    @And("I click back for no delete")
    public void iClickBackForDelete() { deleteCoWorkingSpace.ClickBackForDelete();
    }

    @Then("I can see notification successfully delete")
    public void iCanSeeNotificationSuccessfullyDelete() {
    }

    @And("I on the co working space information page")
    public void iOnTheCoWorkingSpaceInformationPage() {
        deleteCoWorkingSpace.openUrl("https://office-buddy-web.vercel.app/co-working");
    }
}

