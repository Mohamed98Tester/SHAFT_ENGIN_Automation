package Master;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchAction {
    SHAFT.GUI.WebDriver driver ;
    public SearchAction (SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }

    private final By dealCodeLabel =By.cssSelector("[placeholder=\"Deal Code\"]");
    private final By supplier = By.xpath("(//span[contains(@class, 'p-dropdown-label')])[1]");
    private final By supplierCredential = By.xpath("(//span[contains(@class,\"p-dropdown-label\")])[2]");
    private final  By inactive = By.xpath("(//div[contains(@class,\"p-radiobutton-box\")])[1]");
    private final By active = By.xpath("(//div[contains(@class,\"p-radiobutton-box\")])[2]");
    private final By both = By.xpath("(//div[contains(@class,\"p-radiobutton-box\")])[3]");
    private final By searchButton = By.cssSelector("[type=\"submit\"]");
    public final By exportToExel = By.className("mg-end-10");
    public final By grid = By.xpath(" /html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-deal-code/div/tilde-data-table/div/div/div/div/div[2]");
    public  final By dealcode=By.xpath("//*[@id=\"pr_id_11-table\"]/tbody/tr[1]/td[2]");

        //TODO: write deal Code
        public SearchAction writeDealCode   (String dealCode ){
            driver.element().type(dealCodeLabel,dealCode);
            return this;
        }
    //TODO : Chose supplier

    public SearchAction clicksupplier (){
        driver.element().select(supplier,"Galileo");
        return this;
    }
    //TODO : Chose Supplier Credential
    public SearchAction clickONsupplierCredential (){
            driver.element().select(supplierCredential,"Galileo Live UAE");
            return this;
    }

    //TODO : chose inactive radio button
    public SearchAction choseinactive (){
            driver.element().click(inactive);
            return this;
    }


    //TODO : chose active radio button
    public SearchAction choseactive (){
        driver.element().click(active);
        return this;
    }

    //TODO : chose both radio button
    public SearchAction choseBoth (){
        driver.element().click(both);
        return this;
    }

    public SearchAction clickONSearch (){
            driver.element().click(searchButton);
            return this;
    }

    public SearchAction clickOnExportExcel (){
            driver.element().click(exportToExel);
            return this;
    }
/*
    public String chcekapprove(String app,String desed) {

        boolean found = false;
        String det="";

        List<WebElement> deals=driver.getDriver().findElements(grid);

        while(true){

        for (WebElement deal:deals){

            WebElement der=deal.findElement(By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-deal-code/div/tilde-data-table/div/div/div/div/div[2]"));
            String status=der.getText();
            WebElement dea=deal.findElement(dealcode);
            det=dea.getText();


            if(status.equalsIgnoreCase(app)&&det.equalsIgnoreCase(desed)){
                found=true;
                break;
            }
            if (found){
                break;
            }

            }
        return det;

        }


    }

    /*

    // جلب كل النصوص من العمود الخامس (Approval Status)
    List<String> approvalStatusList = driver.element()
            .getTextList(By.xpath("//table//tr/td[5]"));

    List<String> approvalStatus = driver.element().getText()


     */

}
