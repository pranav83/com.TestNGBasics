package TestNGBasic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Step1TestNG {

    @AfterTest
    public void afterTest(){
        System.out.println("I will execute Last");
    }

    @Test(groups = {"smoke"})
    public void firstTestNG(){
        System.out.println("Hello TestNG");
    }
    @Parameters({"URL","API"})
    @Test
    public void secondTest(String x, String key){
        System.out.println("Hello TestNG I like documentation");
        System.out.println(x);
        System.out.println(key);
    }
}
