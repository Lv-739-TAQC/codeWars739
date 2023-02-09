package com.org.ita;

import com.org.ita.kata.menus.delegator.MenuNumberFactory;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.SystemInput;

public class Main {
    public static void main(String[] args) {
        Student.printAllStudents();

        SystemInput systemInput = new SystemInput();
        Student student = systemInput.inputStudent();
        System.out.println(student);

        MenuNumberFactory menuNumberFactory = new MenuNumberFactory(student);
        menuNumberFactory.runMenu();
    }
}


