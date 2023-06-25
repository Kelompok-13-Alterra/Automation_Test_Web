package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeleteDataBuyerAssessment extends PageObject {

    private By Delete(){return By.xpath("//tbody/tr[3]/td[5]/div[1]/button[2]");}
    private By Yes(){
        return By.xpath("//button[contains(text(),'Yes')]");
    }
    private By Back(){
        return By.xpath("//button[contains(text(),'Back')]");
    }

    @Step
    public void ClickDelete(){$(Delete()).click(); }
    @Step
    public void ClickYes(){
        $(Yes()).click();
    }
    @Step
    public void ClickBack(){
        $(Back()).click();
    }
}
