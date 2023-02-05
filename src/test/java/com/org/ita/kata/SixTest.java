package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderSix;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SixTest {

    public void assertFunctionEquals(double actual, double expected) {
        boolean inRange;
        double eps = 1e-12;
        if (expected == 0.0) {
            inRange = Math.abs(actual) <= eps;
        } else {
            double error = Math.abs((actual - expected) / expected);
            inRange = error <= 1e-12;
        }
        if (!inRange) {
            System.out.println("Expected must be near " + expected + ", but got " + actual);
        }
        Assert.assertTrue(inRange);
    }

    @Test(dataProvider = "dpFloatingPointApproximation", dataProviderClass = DataProviderSix.class)
    public void testFloatingPointApproximation(StudentRealisation studentRealisation,
                                               double expectedResult,
                                               double x) {
        double actualResult = studentRealisation.implementationSixKata().f(x);
        assertFunctionEquals(actualResult, expectedResult);
    }
}
