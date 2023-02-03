package com.org.ita.kata.providers;

import com.org.ita.kata.students.delegator.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentProvider {
    public static Object[][] combineDataWithStudent(Object[][] testData) {
        List<Object[]> rowsStudentImplementation = new ArrayList<>();
        for (Student student : Student.values()) {
            for (Object[] row : testData) {
                Object[] object = new Object[row.length + 1];
                object[0] = student.getStudentRealisation();
                System.arraycopy(row, 0, object, 1, row.length);
                rowsStudentImplementation.add(object);
            }
        }
        return rowsStudentImplementation.toArray(Object[][]::new);
    }
}
