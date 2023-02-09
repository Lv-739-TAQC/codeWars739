package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderSeven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest extends DataProviderSeven {
    @Test(dataProvider = "dpTestNewAvg")
    public void testNewAvg(StudentRealisation studentRealisation, long expectedResult, double[] arr, double nAvg) {
        long actualResult = studentRealisation.implementationSevenKata().newAvg(arr, nAvg);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "dpTestNewAvgException", expectedExceptions = IllegalArgumentException.class)
    public void testIllegalArgumentExceptionNewAvg(StudentRealisation studentRealisation, String expectedResult, double[] arr, double nAvg) {
        String actualResult = String.valueOf(studentRealisation.implementationSevenKata().newAvg(arr, nAvg));
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "dpNthSeriesTest")
    public void nthSeriesTest(StudentRealisation studentRealisation, String expectedResult, int input) {
        String actualResult = studentRealisation.implementationSevenKata().seriesSum(input);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
