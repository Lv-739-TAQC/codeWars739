package com.org.ita.kata.menus;

import com.org.ita.kata.utils.SystemInput;

import java.util.HashMap;
import java.util.Map;

import static com.org.ita.kata.utils.Constant.ErrorMessages.STUDENT_NOT_FOUND;

public class Students {

    private Map<Integer, String> students;

    public Students() {
        this.students = new HashMap<>() {{
            put(1, "Anna");
            put(2, "Bohdan");
            put(3, "Denys");
            put(4, "Dmytro");
            put(5, "Ilya");
            put(6, "Ira");
            put(7, "Janet");
            put(8, "Maksym");
            put(9, "Tetiana");
            put(10, "Zhanna");
        }};
    }

    @Override
    public String toString() {
        StringBuilder outputStudents = new StringBuilder();
        for (Map.Entry<Integer, String> entry : this.students.entrySet()) {
            outputStudents.append(entry.getKey() + " - " + entry.getValue()).append("\n");
        }
        return "[ALL STUDENTS]\n" + outputStudents;
    }

    public String chooseStudent() {
        while(true) {
            System.out.println("Enter student's name : ");
            String username = SystemInput.input.nextLine();
            if(this.students.containsValue(username)) {
                return username;
            } else {
                System.out.println(STUDENT_NOT_FOUND);
            }
        }
    }
}
