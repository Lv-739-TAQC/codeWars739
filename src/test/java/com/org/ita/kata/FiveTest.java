package com.org.ita.kata;
import com.org.ita.kata.providers.DataProviderFive;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FiveTest {

    @Test
    public void testGap() {
    }

    @Test(dataProvider = "dpTestPerimeter", dataProviderClass = DataProviderFive.class)
    public void testPerimeter(StudentRealisation studentRealisation, BigInteger expected, BigInteger input) {
        BigInteger actual = studentRealisation.implementationFiveKata().perimeter(input);
        Assert.assertEquals(actual, expected);
    }
}
