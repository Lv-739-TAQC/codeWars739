package com.org.ita;

import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.menus.delegator.MenuNumberFactory;
import com.org.ita.kata.utils.SystemInput;

public class Main {
    public static void main(String[] args) {
        Student.printAllStudents();

        Student student = SystemInput.inputStudent();
        System.out.println(student);

        MenuNumberFactory menuNumberFactory = new MenuNumberFactory(student);
        menuNumberFactory.runMenu();
    }
}


