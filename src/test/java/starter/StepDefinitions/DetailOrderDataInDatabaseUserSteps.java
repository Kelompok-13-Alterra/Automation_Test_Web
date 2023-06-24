package starter.StepDefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.DetailOrderDataInDatabaseUser;

public class DetailOrderDataInDatabaseUserSteps {

    @Steps
    DetailOrderDataInDatabaseUser detailOrderDataInDatabaseUser;

    @And("I click button see all in order data")
    public void iClickButtonSeeAll() { detailOrderDataInDatabaseUser.IClickButtonSeeAll();
    }
    @And("I can see customer order data")
    public void iCanSeeCustomerOrderData() {
    }
}
