package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.CreateCoWorkingSpace;

public class CreateCoWorkingSpaceSteps {

    @Steps
    CreateCoWorkingSpace createCoWorkingSpace;

    @And("I click sidebar on co working space name")
    public void iClickSidebarOnCoWorkingSpaceName() {
        createCoWorkingSpace.ClickSidebarCoWorkingSpaceName();
    }

    @And("I click button create co working space")
    public void iClickButtonCreateCoWorkingSpace() {
        createCoWorkingSpace.ClickButtonCreateCoWorkingSpace();
    }

    @And("I enter correct name {string}")
    public void iEnterCoWorkingSpaceName(String office) {
        createCoWorkingSpace.inputOffice(office);
    }

    @And("I enter incorrect name1 {string}")
    public void iEnterCoWorkingSpaceName1(String office) {
        createCoWorkingSpace.inputOffice(office);
    }

    @And("I enter incorrect name2 {string}")
    public void iEnterCoWorkingSpaceName2(String office) {
        createCoWorkingSpace.inputOffice(office);
    }

    @And("I enter correct address {string}")
    public void iEnterAddress(String address) {
        createCoWorkingSpace.inputAddress(address);
    }

    @And("I enter incorrect address1 {string}")
    public void iEnterAddress1(String address) {
        createCoWorkingSpace.inputAddress(address);
    }

    @And("I enter incorrect address2 {string}")
    public void iEnterAddress2(String address) {
        createCoWorkingSpace.inputAddress(address);
    }

    @And("I enter correct office description {string}")
    public void iEnterOfficeDescription(String description) {
        createCoWorkingSpace.inputDescription(description);
    }

    @And("I enter incorrect office description1 {string}")
    public void iEnterOfficeDescription1(String description) {
        createCoWorkingSpace.inputDescription(description);
    }

    @And("I enter incorrect office description2 {string}")
    public void iEnterOfficeDescription2(String description) {
        createCoWorkingSpace.inputDescription(description);
    }

    @And("I enter correct price {string}")
    public void iEnterPrice(String prices) {
        prices = String.format("123000");
        createCoWorkingSpace.inputPrice(prices);
    }

    @And("I enter incorrect price1 {string}")
    public void iEnterPrice1(String prices) {
        prices = String.format("123000");
        createCoWorkingSpace.inputPrice(prices);
    }

    @And("I enter incorrect price2 {string}")
    public void iEnterPrice2(String prices) {
        prices = String.format("123000");
        createCoWorkingSpace.inputPrice(prices);
    }

    @And("I enter correct capacity {string}")
    public void iEnterCapacity(String capacity) {
        capacity = String.format("21");
        createCoWorkingSpace.inputCapacity(capacity);
    }

    @And("I enter incorrect capacity1 {string}")
    public void iEnterCapacity1(String capacity) {
        capacity = String.format("21");
        createCoWorkingSpace.inputCapacity(capacity);
    }

    @And("I enter incorrect capacity2 {string}")
    public void iEnterCapacity2(String capacity) {
        capacity = String.format("21");
        createCoWorkingSpace.inputCapacity(capacity);
    }

    @And("I enter correct open time {string}")
    public void iEnterOpen(String OpenTime) {
        OpenTime = String.format("08:00:01");
        createCoWorkingSpace.inputOpen(OpenTime);
    }

    @And("I enter incorrect open time1 {string}")
    public void iEnterOpen1(String OpenTime) {
        OpenTime = String.format("08:00:01");
        createCoWorkingSpace.inputOpen(OpenTime);
    }

    @And("I enter incorrect open time2 {string}")
    public void iEnterOpen2(String OpenTime) {
        OpenTime = String.format("08:00:01");
        createCoWorkingSpace.inputOpen(OpenTime);
    }

    @And("I enter correct closing time {string}")
    public void iEnterClose(String CloseTime) {
        CloseTime = String.format("22:00:00");
        createCoWorkingSpace.inputClose(CloseTime);
    }

    @And("I enter incorrect closing time1 {string}")
    public void iEnterClose1(String CloseTime) {
        CloseTime = String.format("22:00:00");
        createCoWorkingSpace.inputClose(CloseTime);
    }

    @And("I enter incorrect closing time2 {string}")
    public void iEnterClose2(String CloseTime) {
        CloseTime = String.format("22:00:00");
        createCoWorkingSpace.inputClose(CloseTime);
    }

    @And("I click correct speaker button")
    public void iClickSpeakerButton() {
        createCoWorkingSpace.ClickFacilitiesSpeaker();
    }

    @And("I click correct speaker button1")
    public void iClickSpeakerButton1() {
        createCoWorkingSpace.ClickFacilitiesSpeaker();
    }

    @And("I click correct projector button")
    public void iClickProjectorButton() {
        createCoWorkingSpace.ClickFacilitiesProjector();
    }

    @And("I click correct projector button1")
    public void iClickProjectorButton1() {
        createCoWorkingSpace.ClickFacilitiesProjector();
    }

    @And("I click correct whiteboard button")
    public void iClickWhiteboardButton() {
        createCoWorkingSpace.ClickFacilitiesWhiteboard();
    }

    @And("I click correct whiteboard button1")
    public void iClickWhiteboardButton1() {
        createCoWorkingSpace.ClickFacilitiesWhiteboard();
    }

    @And("I click correct bni va button")
    public void iClickBniVaButton() {
        createCoWorkingSpace.ClickPaymentBniVa();
    }

    @And("I click correct bni va button1")
    public void iClickBniVaButton1() {
        createCoWorkingSpace.ClickPaymentBniVa();
    }

    @And("I click correct bni va button2")
    public void iClickBniVaButton2() {
        createCoWorkingSpace.ClickPaymentBniVa();
    }

    @Then("I click create co working space button")
    public void iClickCreateCoWorkingSpaceButton() {
        createCoWorkingSpace.ClickCreateCoWorkingSpaceButton();
    }

    @Then("I click x button")
    public void iClickXButton() {
        createCoWorkingSpace.ClickXButton();
    }

    @And("I click yes button")
    public void iClickYesButton() {
        createCoWorkingSpace.ClickYesButton();
    }

    @And("I am on the co working space information page")
    public void iAmOnTheCoWorkingSpaceInformationPage() {
        createCoWorkingSpace.openUrl("https://office-buddy-web.vercel.app/co-working");
    }

    @And("I see massage error")
    public void iSeeMassageError(){
    }
}
