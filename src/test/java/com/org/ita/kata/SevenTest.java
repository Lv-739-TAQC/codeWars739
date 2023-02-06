package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderSeven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest {
    @Test(dataProvider = "dpTestNewAvg", dataProviderClass = DataProviderSeven.class)
    public void testNewAvg(StudentRealisation studentRealisation, long expectedResult, double[] arr, double nAvg) {
        long actualResult = studentRealisation.implementationSevenKata().newAvg(arr, nAvg);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProvider = "dpTestNewAvgException", dataProviderClass = DataProviderSeven.class, expectedExceptions = IllegalArgumentException.class)
    public void testIllegalArgumentExceptionNewAvg(StudentRealisation studentRealisation, String expectedResult, double[] arr, double nAvg) {
        long actualResult = studentRealisation.implementationSevenKata().newAvg(arr, nAvg);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProvider = "dpNthSeriesTest", dataProviderClass = DataProviderSeven.class)
    public void nthSeriesTest(StudentRealisation studentRealisation, String expectedResult, int input){
        String actualResult = studentRealisation.implementationSevenKata().seriesSum(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

}



