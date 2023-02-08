package com.org.ita.kata.menus.delegator;

import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.menus.*;

import com.org.ita.kata.utils.SystemInput;

public class MenuNumberFactory {

    public static final String INCORRECT_INPUT = "Incorrect input";
    public static final String EXIT_PROGRAM = "Exit";

    private final String katas = "1. Eight level kata\n" +
            "2. Seven level kata\n" +
            "3. Six level kata\n" +
            "4. Five level kata\n" +
            "5. Four level kata";

    private final Student student;

    public MenuNumberFactory(Student student) {
        this.student = student;
    }

    public void runMenu() {
        while (true) {
            System.out.println("[ALL KATAS]\n" + katas);
            System.out.println("0. Exit\n");
            System.out.println("Please enter name of kata : ");
            String kata = SystemInput.input.nextLine();
            if (kata.equals("0")) {
                System.out.println(EXIT_PROGRAM);
                return;
            }
            try {
                MenuNumber menuNumber = MenuLevel.valueOf(kata.toUpperCase()).getMenuNumber();
                menuNumber.SetStudent(student);
                menuNumber.getAllTasks();
            } catch (Exception e) {
                System.out.println(INCORRECT_INPUT);
            }
        }
    }
}
