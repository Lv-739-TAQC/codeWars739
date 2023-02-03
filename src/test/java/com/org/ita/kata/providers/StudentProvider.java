package com.org.ita.kata.providers;

import com.org.ita.kata.students.delegator.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentProvider {
    public static Object[][] combineDataWithStudent(Object[][] testData) {
        List<Object[]> rowsWithImpl = new ArrayList<>();
        for (Student student : Student.values()) {
            for (Object[] row : testData) {
                if (row.length == 2) {
                    rowsWithImpl.add(new Object[]{
                            student.getStudentRealisation(), row[0], row[1]
                    });
                } else if (row.length == 3) {
                    rowsWithImpl.add(new Object[]{
                            student.getStudentRealisation(), row[0], row[1], row[2]
                    });
                } else {
                    rowsWithImpl.add(new Object[]{
                            student.getStudentRealisation(), row[0], row[1], row[2], row[3]
                    });
                }
            }
        }
        return rowsWithImpl.toArray(Object[][]::new);
    }
}
