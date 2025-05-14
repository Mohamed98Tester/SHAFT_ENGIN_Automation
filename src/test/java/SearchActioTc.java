
import Master.*;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


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

       // driver.element().assertThat(exportToExel).isVisible().perform();

        List<WebElement> approvalStatusCell = search.approvalStatusCell();

        System.out.println("Size: " + approvalStatusCell.size());

        for (WebElement cell : approvalStatusCell ) {
            String statusText  = cell.getText().trim();
            SHAFT.Validations.assertThat()
                    .object(statusText)
                    .isEqualTo("Approved").perform();
        }














/*
        String des = search.chcekapprove("Approved","TOF23");
        System.out.println(des);
    */

    }

}







