package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeleteDataUserInDatabaseUser extends PageObject {

    private By ClickDelete(){ return By.xpath("//tbody/tr[2]/td[5]/div[1]/button[2]");}
    private By ClickYes(){
        return By.xpath("//button[contains(text(),'Yes')]");
    }
    private By ClickBack(){
        return By.xpath("//button[contains(text(),'Back')]");
    }

    @Step
    public void ClickDeleteButton(){ $(ClickDelete()).click(); }
    @Step
    public void YesForDeleteDataUser(){
        $(ClickYes()).click();
    }
    @Step
    public void BackForNoDeleteDataUser(){
        $(ClickBack()).click();
    }
}
