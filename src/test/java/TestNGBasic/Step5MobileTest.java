package TestNGBasic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Step5MobileTest {

    @Test
    public void mobileLogin(){
        System.out.println("Selenium");
    }
    @Test
    public void mobileName(){
        System.out.println("Appium");
    }
    @Test
    public void mobileRegister(){
        System.out.println("RestAssured Api POstman");
    }
    @Test
    public void mobileApp(){
        System.out.println("RestAssured Api POstman");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I will execute before every method");
    }
    @Test (groups = {"smoke"})
    public void mobileCamera(){
        System.out.println("RestAssured Api POstman");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I will execute after every method");
    }
    @Test
    public void mobileGallery(){
        System.out.println("RestAssured Api POstman");
    }
    @Test
    public void mobileFilemanager(){
        System.out.println("RestAssured Api POstman");
    }
    @Test(timeOut = 4000)
    public void facebookLogin(){
        System.out.println("Hi Facebook");
    }
    @Test
    public void instaLogin(){
        System.out.println("Hello Insta");
    }
    @Test(enabled = false)
    public void whattsappLogin(){
        System.out.println("WhattApp Rock");
    }


}
