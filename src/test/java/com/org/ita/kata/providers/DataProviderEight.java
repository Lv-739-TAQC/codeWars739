package com.org.ita.kata.providers;

import org.testng.annotations.DataProvider;

import static com.org.ita.kata.providers.StudentProvider.combineDataWithStudent;

public class DataProviderEight {

    @DataProvider (name = "dpTestStringToNumber")
    public static Object [] [] dpTestStringToNumber () {
        Object[][] data = new Object[][]{
                {1234, "1234"},
                {605, "605"},
                {1405, "1405"},
                {-7, "-7"},
        };
        return combineDataWithStudent(data);
    }
}
