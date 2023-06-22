package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.EditCoWorkingSpace;

public class EditCoWorkingSpaceSteps {

    @Steps
    EditCoWorkingSpace editCoWorkingSpace;

    @And("I click edit button")
    public void iClickEditButton() { editCoWorkingSpace.ClickEditButton();
    }

    @And("I enter name {string}")
    public void iEnterName(String name) { editCoWorkingSpace.EnterName(name);
    }

    @And("I enter address {string}")
    public void iEnterAddress(String address) { editCoWorkingSpace.EnterAddress(address);
    }

    @And("I enter office description {string}")
    public void iEnterDescription(String description) { editCoWorkingSpace.EnterDescription(description);
    }

    @And("I enter capacity {string}")
    public void iEnterCapacity(String capacity) {
        capacity = String.format("99");
        editCoWorkingSpace.EnterCapacity(capacity);
    }

    @And("I enter price {string}")
    public void iEnterPrice(String price) {
        price = String.format("280000");
        editCoWorkingSpace.EnterPrice(price);
    }

    @And("I enter open time {string}")
    public void iEnterOpen(String OpenTime) {
        OpenTime = String.format("08:30:00");
        editCoWorkingSpace.inputOpen(OpenTime);
    }

    @Then("I click change Co-Working Space")
    public void iClickChangeButton() { editCoWorkingSpace.ClickChangeButton();
    }

    @And("I click yes for change data")
    public void iClickYesButton() { editCoWorkingSpace.ClickYesButton();
    }

    @And("I see notification successfully for change")
    public void iSeeNotificationSuccessfullyForChange() {
    }

    @And("I see massage error for change data")
    public void iSeeMassageErrorForChangeData() {
    }
}
