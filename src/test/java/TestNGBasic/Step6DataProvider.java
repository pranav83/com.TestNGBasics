package TestNGBasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

public class Step6DataProvider {




    @Test(dataProvider = "getData")
    public void setData(String username, String password){
        System.out.println("I have to excuete three times");
        System.out.println(username);
        System.out.println(password);

    }

    @DataProvider
    public Object[][] getData(){
// 1st combination username and password
// 2nd combination access key
// 3rd eye scan
       Object [] [] data = new Object [3] [2];
       //First combination
       data [0][0] ="FirstName";
       data [0][1] ="Firstpassword";
       // Second Combination
        data [1][0] ="SecondName";
        data [1][1] ="Secondpassword";

        data [2][0] ="ThirdName";
        data [2][1] ="Thirdpassword";



        return data;
    }


}

