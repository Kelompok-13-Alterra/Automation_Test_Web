package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditCoWorkingSpace extends PageObject {

    private By EditButton(){
        return By.xpath("//tbody/tr[5]/td[5]/div[1]/button[1]");
    }
    private By NameField(){ return By.xpath("//input[@id='officeName']");
    }
    private By AddressField(){ return By.xpath("//input[@id='address']");
    }
    private By DescriptionField(){ return By.xpath("//input[@id='description']");
    }
    private By PriceField(){
        return By.xpath("//input[@id='price']");
    }
    private By CapacityField(){
        return By.xpath("//input[@id='capacity']");
    }
    private By OpenTimeField(){
        return By.xpath("//input[@id='openTime']");
    }
    private By ChangeButton(){
        return By.xpath("//button[contains(text(),'Ubah Co-working Space')]");
    }
    private By YesButton(){
        return By.xpath("//button[contains(text(),'Yes')]");
    }
    private By BackButton(){
        return By.xpath("//button[contains(text(),'Back')]");
    }

    @Step
    public void ClickEditButton(){
        $(EditButton()).click();
    }

    @Step
    public void EnterAddress(String address){
        $(AddressField()).clear();
        $(AddressField()).type(address);
    }

    @Step
    public void EnterName(String name){
        $(NameField()).clear();
        $(NameField()).type(name);
    }

    @Step
    public void EnterDescription(String description){
        $(DescriptionField()).clear();
        $(DescriptionField()).type(description);
    }

    @Step
    public void EnterPrice(String price){
        $(PriceField()).clear();
        $(PriceField()).type(price);
    }

    @Step
    public void inputOpen(String capacity){
        $(CapacityField()).clear();
        $(CapacityField()).type(capacity);
    }

    @Step
    public void EnterCapacity(String OpenTime){
        $(OpenTimeField()).clear();
        $(OpenTimeField()).type(OpenTime);
    }

    @Step
    public void ClickChangeButton(){
        $(ChangeButton()).click();
    }

    @Step
    public void ClickYesButton(){
        $(YesButton()).click();
    }

    @Step
    public void ClickBackButton(){
        $(BackButton()).click();
    }
}
