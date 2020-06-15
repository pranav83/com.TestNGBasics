package TestNGBasic;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Step4HomeLoan {

    @BeforeClass
    public void beforeClass(){
        System.out.println("I will run before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I will run after class");
    }

    @Test (groups = {"smoke"})
    public void webHomeLoan(){
        System.out.println("Selenium");
    }
    @Test
    public void mobileHomeLoan(){

        System.out.println("***************************Appium");
        Assert.assertTrue(false);
    }
    @Test
    public void apiHomeloan(){
        System.out.println("RestAssured Api POstman");
    }

}
