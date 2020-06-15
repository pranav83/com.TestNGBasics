package TestNGBasic;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Step2Loan {

    @Test(groups = {"smoke"})
    public void ploan(){
        System.out.println("Good");
    }
    @BeforeTest
    public void prerequiest(){
        System.out.println("I will run first");
    }
}
