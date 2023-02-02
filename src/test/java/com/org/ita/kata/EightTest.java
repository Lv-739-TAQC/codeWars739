package com.org.ita.kata;

import com.org.ita.kata.students.delegator.Student;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class EightTest {
    public Object[][] combineImplWithLitersTests(Object[][] testsData) {
        List<Object[]> rowsWithImpl = new ArrayList<>();
        for (Student student: Student.values()) {
            for (Object[] row: testsData) {
                rowsWithImpl.add(new Object[]{student.getStudentRealisation().implementationEightKata(), row[0], row[1]});
            }
        }
        return rowsWithImpl.toArray(Object[][]::new);
    }

    @DataProvider(name = "dpTestLiters")
    public Object[][] dpTestLiters() {
        Object[][] data = new Object[][]{
                {1, 2},
                {0, 0.82},
                {6, 12.83},
                {901, 1802.44},
                {30, 60.0},
                {10, 20.464028408373046},
                {1, 3.749356096720057},
                {17, 35.34135821901497},
                {4, 8.202914267600807},
                {25, 51.788813355493275},
                {2, 5.07713325652257},
                {2, 5.382687624849623},
                {1, 3.350949150254774},
                {15, 30.546259060975842},
                {3, 7.653405763033755}
        };
        return combineImplWithLitersTests(data);
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

    @Test
    public void testTwoDecimalPlaces() {
    }

    @Test
    public void testDivisibleBy() {
    }
}