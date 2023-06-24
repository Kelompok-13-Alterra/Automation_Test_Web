package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateCoWorkingSpace extends PageObject {

    private By SidebarCoWorkingSpaceName() {
        return By.xpath("//span[contains(text(),'Co-Working Space')]");
    }

    private By ButtonCreateCoWorkingSpace() {
        return By.xpath("//body/div[@id='root']/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]");
    }

    private By officeField() {
        return By.xpath("//input[@id='officeName']");
    }

    private By addressField() {
        return By.xpath("//input[@id='address']");
    }

    private By descriptionField() {
        return By.xpath("//input[@id='description']");
    }

    private By priceField() {
        return By.xpath("//input[@id='price']");
    }

    private By capacityField() {
        return By.xpath("//input[@id='capacity']");
    }

    private By openField() {
        return By.xpath("//input[@id='openTime']");
    }

    private By closeField() {
        return By.xpath("//input[@id='closeTime']");
    }

    private By facilitiesSpeaker() {
        return By.xpath("//body/div[@id='root']/div[2]/div[2]/div[3]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/button[2]");
    }

    private By facilitiesProjector() {
        return By.xpath("//body/div[@id='root']/div[2]/div[2]/div[3]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/button[3]");
    }

    private By facilitiesWhiteboard() {
        return By.xpath("//body/div[@id='root']/div[2]/div[2]/div[3]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/button[4]");
    }

    private By CreateCoWorkingSpaceButton() {
        return By.xpath("//button[contains(text(),'Tambah Co-working Space')]");
    }

    @Step
    public void ClickSidebarCoWorkingSpaceName(){
        $(SidebarCoWorkingSpaceName()).click();
    }
    @Step
    public void ClickButtonCreateCoWorkingSpace(){
        $(ButtonCreateCoWorkingSpace()).click();
    }
    @Step
    public void inputOffice(String office){
        $(officeField()).type(office);
    }
    @Step
    public void inputPrice(String price){
        $(priceField()).type(price);
    }

    @Step
    public void inputCapacity(String capacity){
        $(capacityField()).type(capacity);
    }
    @Step
    public void inputOpen(String OpenTime){
        $(openField()).type(OpenTime);
    }
    @Step
    public void inputClose(String CloseTime){
        $(closeField()).type(CloseTime);
    }
    @Step
    public void ClickFacilitiesSpeaker(){ $(facilitiesSpeaker()).click();}
    @Step
    public void ClickFacilitiesProjector(){ $(facilitiesProjector()).click();}
    @Step
    public void ClickFacilitiesWhiteboard(){ $(facilitiesWhiteboard()).click();}
    @Step
    public void inputDescription(String description){
        $(descriptionField()).type(description);
    }
    @Step
    public void inputAddress(String address){
        $(addressField()).type(address);
    }
    @Step
    public void ClickCreateCoWorkingSpaceButton(){
        $(CreateCoWorkingSpaceButton()).click();
    }

}
