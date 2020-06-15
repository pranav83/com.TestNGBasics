package TestNGBasic;

import org.testng.annotations.*;

import java.net.URL;


public class Step3CarLoan {

    @AfterSuite
    public void afterSuite(){
        System.out.println("I will stop testing");
    }


   @Parameters("URL")
   @Test
    public void webCarLoan(String urlname){
        System.out.println("Selenium - ");
        System.out.print(urlname);
    }
    @Parameters({"URL"})
    @Test
    public void mobileCarLoan(String y){
        System.out.println("Appium");
        System.out.println(y);
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I will start test NOw ");
    }
    @Test(dependsOnMethods = {"webCarLoan"})
    public void apiCarloan(){
        System.out.println("RestAssured Api POstman");
    }

}
