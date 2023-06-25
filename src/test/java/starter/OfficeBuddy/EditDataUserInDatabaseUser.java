package starter.OfficeBuddy;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditDataUserInDatabaseUser extends PageObject {

    private By SidebarDatabaseUserName(){
        return By.xpath("//body/div[@id='root']/div[2]/div[1]/a[4]/ul[1]");
    }
    private By SeeAllButton(){
        return By.xpath("//body/div[@id='root']/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]");
    }
    private By ButtonChange(){
        return By.xpath("//tbody/tr[8]/td[5]/div[1]/button[1]");
    }
    private By UsernameField(){
        return By.xpath("//input[@id='name']");
    }
    private By UserEmailField(){
        return By.xpath("//input[@id='email']");
    }
    private By PasswordField(){
        return By.xpath("//input[@id='password']");
    }
    private By ChangeAccount(){
        return By.xpath("//button[contains(text(),'Ubah Akun')]");
    }
    private By YesForChangeAccount(){
        return By.xpath("//button[contains(text(),'Yes')]");
    }
    private By BackForNoChangeAccount(){
        return By.xpath("//button[contains(text(),'Back')]");
    }

    @Step
    public void ClickSidebarDatabaseUserName(){
        $(SidebarDatabaseUserName()).click();
    }

    @Step
    public void ClickSeeAllButton(){
        $(SeeAllButton()).click();
    }

    @Step
    public void ClickButtonChange(){
        $(ButtonChange()).click();
    }

    @Step
    public void EnterUsername(String username){
        $(UsernameField()).clear();
        $(UsernameField()).type(username);
    }

    @Step
    public void EnterUserEmail(String email){
        $(UserEmailField()).type(email);
    }

    @Step
    public void EnterPassword(String password){
        $(PasswordField()).type(password);
    }

    @Step
    public void ClickChangeAccount(){
        $(ChangeAccount()).click();
    }

    @Step
    public void ClickYesForChangeAccount(){
        $(YesForChangeAccount()).click();
    }

    @Step
    public void ClickBackForNoChangeAccount(){
        $(BackForNoChangeAccount()).click();
    }
}
