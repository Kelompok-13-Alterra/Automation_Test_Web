package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.EditDataUserInDatabaseUser;

public class EditDataUserInDatabaseUserSteps {

    @Steps
    EditDataUserInDatabaseUser editDataUserInDatabaseUser;

    @And("I click sidebar on database user name")
    public void iClickSidebarOnDatabaseUserName() {
        editDataUserInDatabaseUser.ClickSidebarDatabaseUserName();
    }

    @And("I click button see all in data user")
    public void iClickButtonSeeAll() { editDataUserInDatabaseUser.ClickSeeAllButton();
    }

    @And("I click change button")
    public void iClickButtonChange() { editDataUserInDatabaseUser.ClickButtonChange();
    }

    @And("I enter username {string}")
    public void iEnterUsername(String username) { editDataUserInDatabaseUser.EnterUsername(username);
    }

    @And("I enter username1 {string}")
    public void iEnterUsername1(String username) { editDataUserInDatabaseUser.EnterUsername(username);
    }

    @And("I enter username2 {string}")
    public void iEnterUsername2(String username) { editDataUserInDatabaseUser.EnterUsername(username);
    }

    @And("I enter user email {string}")
    public void iEnterCapacity(String email) {
        editDataUserInDatabaseUser.EnterUserEmail(email);
    }

    @And("I enter user email1 {string}")
    public void iEnterCapacity1(String email) {
        editDataUserInDatabaseUser.EnterUserEmail(email);
    }

    @And("I enter user email2 {string}")
    public void iEnterCapacity2(String email) {
        editDataUserInDatabaseUser.EnterUserEmail(email);
    }

    @And("I enter user password {string}")
    public void iEnterPassword(String password) { editDataUserInDatabaseUser.EnterPassword(password);
    }

    @And("I enter user password1 {string}")
    public void iEnterPassword1(String password) { editDataUserInDatabaseUser.EnterPassword(password);
    }

    @And("I enter user password2 {string}")
    public void iEnterPassword2(String password) { editDataUserInDatabaseUser.EnterPassword(password);
    }

    @Then("I click change account")
    public void iClickChangeAccount() { editDataUserInDatabaseUser.ClickChangeAccount();
    }

    @And("I click yes for change account")
    public void iClickYesForChangeAccount() { editDataUserInDatabaseUser.ClickYesForChangeAccount();
    }

    @And("I click back for no change account")
    public void iClickBackForNoChangeAccount() { editDataUserInDatabaseUser.ClickBackForNoChangeAccount();
    }

    @And("I see notification successfully for change data account")
    public void iSeeNotificationSuccessfullyForChangeDataAccount() {
    }

    @And("I see notification massage error")
    public void iSeeNotificationMassageError() {
    }

    @And("I am back in edit data account page")
    public void iAmBackInEditDataAccountPage() {
        editDataUserInDatabaseUser.openUrl("https://office-buddy-web.vercel.app/database-user/total-user");
    }
}
