package com.org.ita.kata.providers;

import org.testng.annotations.DataProvider;

import static com.org.ita.kata.providers.StudentProvider.combineDataWithStudent;

public class DataProviderEight {

    @DataProvider(name = "dpTestLiters")
    public static Object[][] dpTestLiters() {
        Object[][] data = new Object[][]{
                {1, 2},
                {0, 0.97},
                {7, 14.64},

        };
        return combineDataWithStudent(data);
    }
}
