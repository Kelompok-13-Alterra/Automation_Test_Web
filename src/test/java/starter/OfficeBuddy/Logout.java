package starter.OfficeBuddy;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Logout extends PageObject {
    private By LogoutButton(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/button/img");
    }
    private By YesLogoutButton(){
        return By.xpath("/html/body/div[2]/div/div/div/div/div/div/button[2]/span");
    }
    private By BackLogoutButton(){
        return By.xpath("/html/body/div[2]/div/div/div/div/div/div/button[1]/span");
    }

    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl(targetUrl);
    }
    @Step
    public void ClickLogoutButton(){
        $(LogoutButton()).click();
    }
    @Step
    public void ClickYesLogoutButton(){
        $(YesLogoutButton()).click();
    }
    @Step
    public void ClickBackLogoutButton(){
        $(BackLogoutButton()).click();
    }



}
