package com.org.ita.kata;
import com.org.ita.kata.providers.DataProviderFive;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Arrays;

public class FiveTest {

    @Test(dataProvider = "dpTestGap", dataProviderClass = DataProviderFive.class)
    public void testGap(StudentRealisation studentRealisation, String expected, int g, long m, long n) {
        String actual = Arrays.toString(studentRealisation.implementationFiveKata().gap(g, m, n));
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpTestPerimeter", dataProviderClass = DataProviderFive.class)
    public void testPerimeter(StudentRealisation studentRealisation, BigInteger expected, BigInteger input) {
        BigInteger actual = studentRealisation.implementationFiveKata().perimeter(input);
        Assert.assertEquals(actual, expected);
    }
}
