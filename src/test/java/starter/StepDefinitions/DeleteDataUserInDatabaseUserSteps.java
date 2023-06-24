package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.DeleteDataUserInDatabaseUser;

public class DeleteDataUserInDatabaseUserSteps {

    @Steps
    DeleteDataUserInDatabaseUser deleteDataUserInDatabaseUser;

    @And("I click delete button in list user")
    public void iClickDeleteButton() { deleteDataUserInDatabaseUser.ClickDeleteButton();
    }

    @And("i click yes for delete data user")
    public void iClickYesForDeleteDataUser() { deleteDataUserInDatabaseUser.YesForDeleteDataUser();
    }

    @And("I click back for no delete data user")
    public void iClickBackForNoDeleteDataUser() { deleteDataUserInDatabaseUser.BackForNoDeleteDataUser();
    }

    @Then("I see notification successfully for delete data user")
    public void iSeeNotificationSuccessfullyForDelete() {
    }

    @And("I am back in database user page")
    public void iBackInDatabaseUserPage() {
        deleteDataUserInDatabaseUser.openUrl("https://office-buddy-web.vercel.app/database-user/total-user");
    }
}
