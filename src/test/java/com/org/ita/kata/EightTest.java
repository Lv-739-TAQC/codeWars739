package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderEight;
import com.org.ita.kata.students.delegator.Student;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class EightTest {
    public Object[][] combineImplWhithTests(Object[][] testsData) {
//        Object[][] data = new Object[][]{
//                { new com.org.ita.kata.implementation.DenisPitsul.EightImpl(), 1, 2},
//                {new com.org.ita.kata.implementation.DenisPitsul.EightImpl(), 0, 0.97},
//                {new com.org.ita.kata.implementation.DenisPitsul.EightImpl(), 7,14.64},
//                {new com.org.ita.kata.implementation.janestadnytska.EightImpl(), 1, 2},
//                {new com.org.ita.kata.implementation.janestadnytska.EightImpl(), 0, 0.97},
//                {new com.org.ita.kata.implementation.janestadnytska.EightImpl(), 7, 14.64}
//        };
        return new Object[][]{};
    }


    @DataProvider(name = "dpTestLiters")
    public Object[][] dpTestLiters() {
//
        Object[][] data = new Object[][]{
                {1, 2},
                {0, 0.97},
                {7, 14.64},

        };
        return combineImplWhithTests(data);
    }

    @Test(dataProvider = "dpTestLiters")
    public void testLiters(Eight eight, int expected, double input) {
        int actual = eight.liters(input);
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testGetVolumeOfCuboid() {
    }

    @Test
    public void testMpgToKPM() {
    }

    @Test(dataProvider = "dpSquareOrSquareRoot", dataProviderClass = DataProviderEight.class)
    public void testSquareOrSquareRoot(StudentRealisation studentRealisation, int[] expected, int[] input) {
        int[] copiedInput = new int[input.length];
        System.arraycopy(input, 0, copiedInput, 0, copiedInput.length);
        int[] actual = studentRealisation.implementationEightKata().squareOrSquareRoot(copiedInput);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCountPositivesSumNegatives() {
    }

    @Test
    public void testStringToNumber() {
    }

    @Test(dataProvider = "dpTestTwoDecimalPlaces", dataProviderClass = DataProviderEight.class)
    public void testTwoDecimalPlaces(StudentRealisation studentRealisation, double expected, double input) {
        double actual = studentRealisation.implementationEightKata().TwoDecimalPlaces(input);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDivisibleBy() {
    }
}