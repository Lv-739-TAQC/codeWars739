package com.org.ita;

import com.org.ita.kata.factory.delegator.StudentRealisationFactory;
import com.org.ita.kata.menus.Students;
import com.org.ita.kata.menus.delegator.MenuNumberFactory;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        System.out.println(students);

        StudentRealisationFactory studentRealisationFactory = new StudentRealisationFactory(students.chooseStudent());
        System.out.println(studentRealisationFactory);

        MenuNumberFactory menuNumberFactory = new MenuNumberFactory(studentRealisationFactory);
        menuNumberFactory.runMenu();
    }
}


