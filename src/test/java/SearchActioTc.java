
import Master.*;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class SearchActioTc extends logintest {

    public final By exportToExel = By.className("mg-end-10");

    public SearchActioTc(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;

    }


    public SearchActioTc() {

    }


    @Test
    public void searchDealCode() {
        P0_login.EnterUsername(testData.getTestData("userNamed"))
                .EnterPassw0rd(testData.getTestData("password"))
                .ClickLoginButton();
        mas.clickOnMaster().clickONFlight().clickONDealCode();

        search.clicksupplier().clickONsupplierCredential().choseactive().clickONSearch()
                .clickOnExportExcel();

        driver.element().assertThat(exportToExel).isVisible().perform();
/*
        String des = search.chcekapprove("Approved","TOF23");
        System.out.println(des);
    */

    }

}







