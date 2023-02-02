package com.org.ita.kata.menus.delegator;

import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.menus.*;

import com.org.ita.kata.utils.SystemInput;

public class MenuNumberFactory {

    public static final String INCORRECT_INPUT = "Incorrect input";
    public static final String EXIT_PROGRAM = "Exit";

    private String katas = "1. Eight level kata\n" + 
    						"2. Seven level kata\n" + 
    						"3. Six level kata\n" + 
    						"4. Five level kata\n" + 
    						"5. Four level kata";

    private Student student;

    public MenuNumberFactory(Student student) {
        this.student = student;
    }

    public void runMenu() {
        while (true) {
            System.out.println("[ALL KATAS]\n" + katas);
            System.out.println("0. Exit\n");
            System.out.println("Please enter number of kata : ");
            String kata = SystemInput.input.nextLine();
            
            switch (kata) {
                case "1":
                    (new MenuEight(student)).getAllTasks();
                    break;
                case "2":
                    (new MenuSeven(student)).getAllTasks();
                    break;
                case "3":
                    (new MenuSix(student)).getAllTasks();
                    break;
                case "4":
                    (new MenuFive(student)).getAllTasks();
                    break;
                case "5":
                    (new MenuFour(student)).getAllTasks();
                    break;
                case "0":
                    System.out.println(EXIT_PROGRAM);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
