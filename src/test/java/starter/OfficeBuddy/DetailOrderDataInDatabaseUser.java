package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailOrderDataInDatabaseUser extends PageObject {

    private By ClickButtonSeeAll(){
        return By.xpath("//body/div[@id='root']/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/a[1]");
    }

    @Step
    public void IClickButtonSeeAll(){ $(ClickButtonSeeAll()).click(); }
}
