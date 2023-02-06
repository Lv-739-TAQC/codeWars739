package com.org.ita.kata.providers;

import org.testng.annotations.DataProvider;
import static com.org.ita.kata.providers.StudentProvider.combineDataWithStudent;

public class DataProviderEight {

    @DataProvider(name = "dpTestTwoDecimalPlaces")
    public static Object[][] dpTestTwoDecimalPlaces() {
        Object[][] data = new Object[][]{
                {4.66, 4.659725356},
                {173735326.38, 173735326.3783732637948948},
                {3.45, 3.453223242},
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpTestLiters")
    public static Object[][] dpTestLiters() {
        Object[][] data = new Object[][]{
                {1,2},
                {0,0.97},
                {7,14.64},
                {0,0.82},
                {6,12.83},
                {901,1802.44},
                {30,60.0},
                {10,20.464028408373046},
                {1,3.749356096720057},
                {17,35.34135821901497},
                {4,8.202914267600807},
                {25,51.788813355493275},
                {2,5.07713325652257},
                {2,5.382687624849623},
                {1,3.350949150254774},
                {15,30.546259060975842},
                {3,7.653405763033755}
        };
        return combineDataWithStudent(data);
    }
    @DataProvider(name = "dpSquareOrSquareRoot")
    public static Object[][] dpSquareOrSquareRoot() {
        Object[][] data = new Object[][]{
                {new int[] { 2, 9, 3, 49, 4, 1 }, new int[]{ 4, 3, 9, 7, 2, 1 }},
                {new int[] { 10, 10201, 25, 25, 1, 1 }, new int[] { 100, 101, 5, 5, 1, 1 }},
                {new int[] { 1, 4, 9, 2, 25, 36 }, new int[] { 1, 2, 3, 4, 5, 6 }}
        };
        return combineDataWithStudent(data);
    }
    @DataProvider(name = "dpCountPositivesSumNegatives")
    public static Object[][] dpCountPositivesSumNegatives(){
    	Object[][] data = {
    			{new int[] {10, -65}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}},
    			{new int[] {8, -50}, new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}}};
    	return combineDataWithStudent(data);
    }
   
}
