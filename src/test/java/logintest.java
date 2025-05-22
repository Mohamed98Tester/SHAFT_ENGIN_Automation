import Login.P0_Login;
import Master.*;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;



public class logintest {

    // TODO : Tack object  from Class
    P0_Login P0_login;

    SHAFT.GUI.WebDriver driver ;
    SearchAction search;
    SHAFT.TestData.JSON testData ;
    Master mas;


    @BeforeSuite
    public void SetupBrowser (){
        //TODO :  initializing Chrome
        driver = new SHAFT.GUI.WebDriver(DriverFactory.DriverType.CHROME);
        //TODO : initializing test data
        testData = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/test.json");

        driver.browser().navigateToURL(testData.getTestData("url"));
        //TODO : Login
        P0_login.EnterUsername(testData.getTestData("userNamed"))
                .EnterPassw0rd(testData.getTestData("password"))
                .ClickLoginButton();

        P0_login=new P0_Login(driver);
        mas=new Master(driver);
        search=new SearchAction(driver);


    }

/*
    @AfterTest
    public void CloseBrowser(){
        driver.browser().closeCurrentWindow();
    }

 */





}
