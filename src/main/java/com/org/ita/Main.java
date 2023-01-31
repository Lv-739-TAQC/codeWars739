package com.org.ita;

import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;
import com.org.ita.kata.menus.delegator.MenuNumberFactory;
import com.org.ita.kata.utils.SystemInput;

public class Main {
    public static void main(String[] args) {
        Student.printAllStudents();

        StudentRealisationFactory studentRealisationFactory = new StudentRealisationFactory(SystemInput.inputStudent());
        System.out.println(studentRealisationFactory);

        MenuNumberFactory menuNumberFactory = new MenuNumberFactory(studentRealisationFactory);
        menuNumberFactory.runMenu();
    }
}


