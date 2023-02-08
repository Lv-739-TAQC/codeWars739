package com.org.ita.kata.providers;

import org.testng.annotations.DataProvider;

public class DataProviderEight extends StudentProvider{

    @DataProvider(name = "dpTestLiters")
    public Object[][] dpTestLiters() {
        Object[][] data = new Object[][]{
                {1, 2},
                {0, 0.97},
                {7, 14.64},
                {0, 0.82},
                {6, 12.83},
                {901, 1802.44},
                {30, 60.0},
                {10, 20.464028408373046},
                {1, 3.749356096720057},
                {17, 35.34135821901497},
                {4, 8.202914267600807},
                {25, 51.788813355493275},
                {2, 5.07713325652257},
                {2, 5.382687624849623},
                {1, 3.350949150254774},
                {15, 30.546259060975842},
                {3, 7.653405763033755}
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpTestTwoDecimalPlaces")
    public Object[][] dpTestTwoDecimalPlaces() {
        Object[][] data = new Object[][]{
                {4.66, 4.659725356},
                {173735326.38, 173735326.3783732637948948},
                {3.45, 3.453223242},
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpSquareOrSquareRoot")
    public Object[][] dpSquareOrSquareRoot() {
        Object[][] data = new Object[][]{
                {new int[]{2, 9, 3, 49, 4, 1}, new int[]{4, 3, 9, 7, 2, 1}},
                {new int[]{10, 10201, 25, 25, 1, 1}, new int[]{100, 101, 5, 5, 1, 1}},
                {new int[]{1, 4, 9, 2, 25, 36}, new int[]{1, 2, 3, 4, 5, 6}}
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpCountPositivesSumNegatives")
    public Object[][] dpCountPositivesSumNegatives(){
    	Object[][] data = {
    			{new int[] {10, -65}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}},
    			{new int[] {8, -50}, new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}}};
    	return combineDataWithStudent(data);
    }

    @DataProvider (name = "dpTestStringToNumber")
    public Object [] [] dpTestStringToNumber () {
        Object[][] data = new Object[][]{
                {1234, "1234"},
                {605, "605"},
                {1405, "1405"},
                {-7, "-7"},
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpTestVolumeOfCuboid")
    public Object[][] dpTestVolumeOfCuboid() {
        Object[][] data = new Object[][]{
                {4, 1, 2, 2},
                {60.0, 2.0, 5.0, 6.0},
                {94.5, 6.3, 3.0, 5.0},
                {63.0, 6.3, 2.0, 5.0},
                {23612.15224306011, 14.474130245695571, 55.945566054601855, 29.15932228963061},
                {22481.24468021722, 12.738406767616961, 22.294988402579474, 79.1585788803336},
                {8928.230843684198, 51.665863395283175, 94.87854160142984, 1.821351294938145},
                {165481.85978954672, 98.51402130625462, 51.75391704649124, 32.457055682007926},
                {210561.34601485942, 86.89242144355217, 30.26691020134947, 80.06241020195031},
                {8877.422853212449, 2.5910533623073495, 53.966189418754006, 63.48758337739812},
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpTestMpgToKPM")
    public Object[][] dpTestMpgToKPM() {
        Object[][] data = new Object[][]{
                {3.54f, 10},
                {7.08f, 20},
                {10.62f, 30},
                {1390.18f, 3927.0f},
                {13.1f, 37.0f},
                {1191.94f, 3367.0f},
                {23.36f, 66.0f},
                {792.27f, 2238.0f},
                {578.8f, 1635.0f},
                {1317.96f, 3723.0f}
        };
        return combineDataWithStudent(data);
    }

    @DataProvider (name = "dpTestDivisibleBy")
    public Object[][] dpTestDivisibleBy() {
        Object[][] data = new Object[][]{
                {new int[]{2,4,6}, new int[]{1,2,3,4,5,6}, 2},
                {new int[]{3,6}, new int[]{1,2,3,4,5,6}, 3},
                {new int[]{0,4}, new int[]{0,1,2,3,4,5,6}, 4},
        };
        return combineDataWithStudent(data);
    }
}
