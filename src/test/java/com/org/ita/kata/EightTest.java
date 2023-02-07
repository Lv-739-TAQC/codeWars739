package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderEight;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EightTest {

    @Test(dataProvider = "dpTestLiters", dataProviderClass = DataProviderEight.class)
    public void testLiters(StudentRealisation studentRealisation, int expected, double input) {
        int actual = studentRealisation.implementationEightKata().liters(input);
        Assert.assertEquals(actual, expected);
    }


    @Test(dataProvider = "dpTestVolumeOfCuboid", dataProviderClass = DataProviderEight.class)
    public void testGetVolumeOfCuboid(StudentRealisation studentRealisation, double expected, double length, double width, double height) {
        double actual = studentRealisation.implementationEightKata().getVolumeOfCuboid(length, width, height);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpTestMpgToKPM", dataProviderClass = DataProviderEight.class)
    public void testMpgToKPM(StudentRealisation studentRealisation, float expected, float mpg) {
        float actual = studentRealisation.implementationEightKata().mpgToKPM(mpg);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpSquareOrSquareRoot", dataProviderClass = DataProviderEight.class)
    public void testSquareOrSquareRoot(StudentRealisation studentRealisation, int[] expected, int[] input) {
        int[] copiedInput = new int[input.length];
        System.arraycopy(input, 0, copiedInput, 0, copiedInput.length);
        int[] actual = studentRealisation.implementationEightKata().squareOrSquareRoot(copiedInput);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpCountPositivesSumNegatives", dataProviderClass = DataProviderEight.class)
    public void testCountPositivesSumNegatives(StudentRealisation studentRealisation, int[] expected, int[] input) {
    	int[] actual = studentRealisation.implementationEightKata().countPositivesSumNegatives(input);
    	Assert.assertEquals(actual,expected);
    }

    @Test(dataProvider = "dpTestStringToNumber", dataProviderClass = DataProviderEight.class)
    public void testStringToNumber (StudentRealisation studentRealisation, int expected, String input) {
        Integer actual = studentRealisation.implementationEightKata().stringToNumber(input);
        Assert.assertEquals(actual, expected);
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