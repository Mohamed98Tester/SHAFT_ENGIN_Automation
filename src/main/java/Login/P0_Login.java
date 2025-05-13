package Login;

import Master.Master;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P0_Login {

    SHAFT.GUI.WebDriver driver ;

    private final By username = By.id("id-Username");
    private final By password = By.id("id-Password");
    private final By loginButton = By.xpath("//button[@loadingicon=\"pi pi-spin pi-spinner\"]");


    public P0_Login (SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }

    public P0_Login  EnterUsername (String userName) {
        driver.element().type(username,userName) ;
        return this ;
    }

    public P0_Login EnterPassw0rd (String pass) {
        driver.element().type(password,pass) ;
        return this ;
    }

    public Master ClickLoginButton (){
        driver.element().click(loginButton);
        return new Master(driver) ;
    }



}
