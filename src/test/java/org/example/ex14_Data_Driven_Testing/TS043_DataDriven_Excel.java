package org.example.ex14_Data_Driven_Testing;

import org.testng.annotations.Test;

public class TS043_DataDriven_Excel {

//   @Test(dataProvider = "getData", dataProviderClass = UtileExcel.class)
//    public void test_login_Test(String email, String password){ //       System.out.println( email+" | "+ password );
//    }
    @Test(dataProvider = "getData",dataProviderClass = UtileExcel.class)
    public void test_VWOLogin(String email, String password) {
        System.out.println("Email - " + email);
        System.out.println("Password - " + password);


    }
}
