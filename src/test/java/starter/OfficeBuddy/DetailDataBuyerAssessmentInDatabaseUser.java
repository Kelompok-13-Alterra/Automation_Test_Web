package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailDataBuyerAssessmentInDatabaseUser extends PageObject{

    private By ButtonSeeAll(){ return By.xpath("//body/div[@id='root']/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]");}
    private By DetailsButton(){
        return By.xpath("//tbody/tr[1]/td[5]/div[1]/button[1]");
    }

    @Step
    public void ClickButtonSeeAll(){ $(ButtonSeeAll()).click(); }
    @Step
    public void ClickDetails(){
        $(DetailsButton()).click();
    }
}
