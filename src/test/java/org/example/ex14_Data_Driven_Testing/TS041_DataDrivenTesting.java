package org.example.ex14_Data_Driven_Testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TS041_DataDrivenTesting {

    @Test(dataProvider = "getData")
    public void loginTest(String email, String password) {
        System.out.println(email + " |" + password);
    }

    @DataProvider()
    public  Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin@gmail", "pass1234"},
                new Object[]{"admin@gmail", "pass123"},
                new Object[]{"admin@gmail", "pass12"}
        };

    }


}
