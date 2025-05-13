package Master;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Master {

    SHAFT.GUI.WebDriver driver ;



        public Master (SHAFT.GUI.WebDriver driver){
            this.driver = driver ;
        }

            private final By master = By.xpath("//a[@href=\"/master\"]");
        private final By flight = By.xpath("(//a[@class='ng-star-inserted'])[1]");
        private final By dealCode = By.cssSelector("[href=\"/master/flight/deal-code\"]");
        private final By searchButton = By.cssSelector("[type=\"submit\"]");

    private final By supplierSelect = By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder ng-star-inserted'][normalize-space()='Select'])[1]");



             public Master clickOnMaster (){
                 driver.element().click(master);
                 return this;
             }

    public Master clickONFlight (){
        driver.element().click(flight);
        return this;
    }
                public SearchAction clickONDealCode (){
                 driver.element().click(dealCode);
                 return new SearchAction(driver);
                }


              /*  public Master ClickOnSearchButton (){
                 driver.element().click(searchButton);
                 return this;
                }
            */


}
