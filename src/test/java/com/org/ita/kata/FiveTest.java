package com.org.ita.kata;

import com.org.ita.kata.students.delegator.Student;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveTest {

    public Object[][] combineImplAndGapTestData(Object[][] testsData) {
        List<Object[]> rowsWithImpl = new ArrayList<>();
        for (Student student: Student.values()) {
            for (Object[] row: testsData) {
                rowsWithImpl.add(new Object[]{student.getStudentRealisation().implementationFiveKata(), row[0], row[1], row[2], row[3]});
            }
        }
        return rowsWithImpl.toArray(Object[][]::new);
    }

    @DataProvider(name = "dpTestGap")
    public Object[][] dpTestGap() {
        Object[][] data = new Object[][]{
                {"[101, 103]", 2, 100, 110},
                {"[103, 107]", 4, 100, 110},
                {"null", 6, 100, 110},
                {"[359, 367]", 8, 300, 400},
                {"[337, 347]", 10, 300, 400},
        };
        return combineImplAndGapTestData(data);
    }

    @Test(dataProvider = "dpTestGap")
    public void testGap(Five five, String expected, int g, long m, long n) {
        String actual = Arrays.toString(five.gap(g, m, n));
        Assert.assertEquals(actual, expected);
    }
}
