package com.org.ita.kata.providers;

import org.testng.annotations.DataProvider;

import static com.org.ita.kata.providers.StudentProvider.combineDataWithStudent;

public class DataProviderFive {

    @DataProvider(name = "dpTestGap")
    public static Object[][] dpTestGap() {
        Object[][] data = new Object[][]{
                {"[101, 103]", 2, 100, 110},
                {"[103, 107]", 4, 100, 110},
                {"null", 6, 100, 110},
                {"[359, 367]", 8, 300, 400},
                {"[337, 347]", 10, 300, 400},
        };
        return combineDataWithStudent(data);
    }
}
