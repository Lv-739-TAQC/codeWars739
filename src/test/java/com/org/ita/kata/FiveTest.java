package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderFive;
import com.org.ita.kata.students.delegator.Student;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveTest {

    @Test(dataProvider = "dpTestGap", dataProviderClass = DataProviderFive.class)
    public void testGap(StudentRealisation studentRealisation, String expected, int g, long m, long n) {
        String actual = Arrays.toString(studentRealisation.implementationFiveKata().gap(g, m, n));
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpTestSmallest", dataProviderClass = DataProviderFive.class)
    public void testSmallest(Five five, String expected, long input) {
        String actual = Arrays.toString(five.smallest(input));
        Assert.assertEquals(actual, expected);
    }
}
