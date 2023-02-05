package com.org.ita.kata.providers;

import org.testng.annotations.DataProvider;

import static com.org.ita.kata.providers.StudentProvider.combineDataWithStudent;

public class DataProviderSix {

    @DataProvider(name = "dpFloatingPointApproximation")
    public static Object[][] dpFloatingPointApproximation() {
        Object[][] data = new Object[][]{
                {1.29999999155e-08, 2.6e-08},
                {6.999999997549999e-10, 1.4e-09},
                {2.499996875007812e-06, 5.0e-06},
                {1.1999999280000085e-07, 2.4e-07},
                {1.29999999155e-8, 2.6e-8},
                {6.999999997549999e-10, 1.4e-9},
                {2.499996875007812e-6, 5.0e-6},
                {1.1999999280000085e-7, 2.4e-7},
                {1.0499999999944874e-11, 2.1e-11},
                {8.499638780702988e-5, 1.7e-4},
                {9.499999548750044e-8, 1.9e-7},
                {8.999999959500001e-9, 1.8e-8},
                {2.0999999779500002e-8, 4.2e-8},
                {3.499938752143656e-5, 7.0e-5},
                {9.499999999548749e-11, 1.9e-10},
                {1.499999887500017e-7, 3.0e-7},
                {1.4998875168718365e-4, 3.0e-4},
                {1.849999999828875e-10, 3.7e-10},
                {8.499996387503072e-7, 1.7e-6},
                {1.6499998638750228e-7, 3.3e-7}
        };
        return combineDataWithStudent(data);
    }
}
