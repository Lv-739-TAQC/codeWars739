package com.org.ita.kata;

import com.org.ita.kata.implementation.AnnaMatviienko.EightImpl;
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

    public Object[][] combineImplAndVolumeOfCuboidTestData(Object[][] testsData) {
        List<Object[]> rowsWithImpl = new ArrayList<>();
        for (Student student : Student.values()) {
            for (Object[] row : testsData) {
                rowsWithImpl.add(new Object[]{student.getStudentRealisation().implementationEightKata(), row[0], row[1], row[2], row[3]});
            }
        }
        return rowsWithImpl.toArray(Object[][]::new);
    }

    @DataProvider(name = "dpTestVolumeOfCuboid")
    public Object[][] dpTestVolumeOfCuboid() {
        Object[][] data = new Object[][]{
                {4, 1, 2, 2},
                {63, 6.3, 2, 5},
                {31.48464, 4.4, 3.56, 2.01}
        };
        return combineImplAndVolumeOfCuboidTestData(data);
    }

    @Test(dataProvider = "dpTestVolumeOfCuboid")
    public void testGetVolumeOfCuboid(Eight eight, double expected, double length, double width, double height) {
        double actual = eight.getVolumeOfCuboid(length, width, height);
        Assert.assertEquals(actual, expected);
    }

    public Object[][] combineImplAndMpgToKPMtestData(Object[][] testsData) {
        List<Object[]> rowsWithImpl = new ArrayList<>();
        for (Student student : Student.values()) {
            for (Object[] row : testsData) {
                rowsWithImpl.add(new Object[]{student.getStudentRealisation().implementationEightKata(), row[0], row[1]});
            }
        }
        return rowsWithImpl.toArray(Object[][]::new);
    }

    @DataProvider(name = "dpTestMpgToKPM")
    public Object[][] dpTestMpgToKPM() {
        Object[][] data = new Object[][]{
                {7.08f, 20},
                {10.62f, 30},
        };
        return combineImplAndMpgToKPMtestData(data);
    }

    @Test(dataProvider = "dpTestMpgToKPM")
    public void testMpgToKPM(Eight eight, float expected, float mpg) {
        float actual = eight.mpgToKPM(mpg);
        Assert.assertEquals(actual, expected);
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
        for (Student student : Student.values()) {
            for (Object[] row : testsData) {
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

    @Test(dataProvider = "dpTestTwoDecimalPlaces")
    public void testTwoDecimalPlaces(Eight eight, double expected, double input) {
        double actual = eight.TwoDecimalPlaces(input);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDivisibleBy() {
    }
}