package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderFive;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Arrays;

public class FiveTest extends DataProviderFive {

    @Test(dataProvider = "dpTestGap")
    public void testGap(StudentRealisation studentRealisation, String expected, int g, long m, long n) {
        String actual = Arrays.toString(studentRealisation.implementationFiveKata().gap(g, m, n));
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpTestSmallest")
    public void testSmallest(StudentRealisation studentRealisation, String expected, long input) {
        String actual = Arrays.toString(studentRealisation.implementationFiveKata().smallest(input));
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpTestPerimeter")
    public void testPerimeter(StudentRealisation studentRealisation, BigInteger expected, BigInteger input) {
        BigInteger actual = studentRealisation.implementationFiveKata().perimeter(input);
        Assert.assertEquals(actual, expected);
    }


    @Test(dataProvider = "dpTestZeros", dataProviderClass = DataProviderFive.class)
    public void testZeros(StudentRealisation studentRealisation, int expected, int input) {
        int actual = studentRealisation.implementationFiveKata().zeros(input);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpSolveTest", dataProviderClass = DataProviderFive.class)
    public void testSolve(StudentRealisation studentRealisation, double input, double expected) {
        double actual = studentRealisation.implementationFiveKata().solve(input);
        Assert.assertEquals(actual, expected);
    }

}
