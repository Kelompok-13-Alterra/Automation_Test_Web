package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeleteCoWorkingSpace extends PageObject {

    private By ButtonDelete(){
        return By.xpath("//tbody/tr[3]/td[5]/div[1]/button[2]");
    }
    private By YesButton(){
        return By.xpath("//button[contains(text(),'Yes')]");
    }
    private By BackButton(){
        return By.xpath("//button[contains(text(),'Back')]");
    }

    @Step
    public void ClickButtonDelete(){
        $(ButtonDelete()).click();
    }
    @Step
    public void ClickYesForDelete(){
        $(YesButton()).click();
    }
    @Step
    public void ClickBackForDelete(){
        $(BackButton()).click();
    }
}
