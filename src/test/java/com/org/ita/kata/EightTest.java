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

    @Test
    public void testSquareOrSquareRoot() {
    }

    @Test
    public void testCountPositivesSumNegatives() {
    }

    @Test
    public void testStringToNumber() {
    }

    public Object[][] combineImplAndTwoDecimalPlacesTestData(Object[][] testsData) {
        List<Object[]> rowsWithImpl = new ArrayList<>();
        for (Student student: Student.values()) {
            for (Object[] row: testsData) {
                rowsWithImpl.add(new Object[]{student.getStudentRealisation().implementationEightKata(), row[0], row[1]});
            }
        }
        return rowsWithImpl.toArray(Object[][]::new);
    }

    @DataProvider(name = "dpTestTwoDecimalPlaces")
    public Object[][] dpTestTwoDecimalPlaces() {
        Object[][] data = new Object[][]{
                {4.66, 4.659725356},
                {173735326.38, 173735326.3783732637948948},
                {3.45, 3.453223242},
        };
        return combineImplAndTwoDecimalPlacesTestData(data);
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