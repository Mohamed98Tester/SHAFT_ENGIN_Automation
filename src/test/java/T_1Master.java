import Login.P0_Login;
import com.shaft.driver.SHAFT;
import org.testng.annotations.Test;


public class T_1Master extends logintest {


    @Test
    public void DealCode (){

        P0_login.EnterUsername(testData.getTestData("userNamed"))
                .EnterPassw0rd(testData.getTestData("password"))
                .ClickLoginButton();

        mas.clickOnMaster().clickONFlight().clickONDealCode();

    }









}

