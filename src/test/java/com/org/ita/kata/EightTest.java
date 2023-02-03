package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderEight;
import com.org.ita.kata.students.delegator.Student;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class EightTest {

    @Test(dataProvider = "dpTestLiters", dataProviderClass = DataProviderEight.class)
    public void testLiters(StudentRealisation studentRealisation, int expected, double input) {
        int actual = studentRealisation.implementationEightKata().liters(input);
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

    @Test(dataProvider = "dpTestTwoDecimalPlaces")
    public void testTwoDecimalPlaces(Eight eight, double expected, double input) {
        double actual = eight.TwoDecimalPlaces(input);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDivisibleBy() {
    }
}