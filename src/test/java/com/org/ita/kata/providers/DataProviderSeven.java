package com.org.ita.kata.providers;

import org.testng.annotations.DataProvider;

public class DataProviderSeven extends StudentProvider {
    @DataProvider(name = "dpTestNewAvg")
    public Object[][] dpTestNewAvg() {
        Object[][] data = new Object[][]{
                {628, new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90},
                {645, new double[]{14, 30, 5, 7, 9, 11, 15}, 92},
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpTestNewAvgException")
    public Object[][] dpTestNewAvgException() {
        Object[][] data = new Object[][]{
                {"--- Exception 1 ---", new double[]{14, 30, 5, 7, 9, 11, 15}, 2}
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpNthSeriesTest")
    public Object[][] dpNthSeriesTest() {
        Object[][] data = new Object[][]{
                {"1.57", 5},
                {"1.77", 9},
                {"1.94", 15}
        };
        return combineDataWithStudent(data);
    }
}



