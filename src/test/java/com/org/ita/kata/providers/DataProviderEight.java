package com.org.ita.kata.providers;

import org.testng.annotations.DataProvider;

import static com.org.ita.kata.providers.StudentProvider.combineDataWithStudent;

public class DataProviderEight {

    @DataProvider(name = "dpSquareOrSquareRoot")
    public static Object[][] dpSquareOrSquareRoot() {
        Object[][] data = new Object[][]{
                {new int[] { 2, 9, 3, 49, 4, 1 }, new int[]{ 4, 3, 9, 7, 2, 1 }},
                {new int[] { 10, 10201, 25, 25, 1, 1 }, new int[] { 100, 101, 5, 5, 1, 1 }},
                {new int[] { 1, 4, 9, 2, 25, 36 }, new int[] { 1, 2, 3, 4, 5, 6 }}
        };
        return combineDataWithStudent(data);
    }
}
