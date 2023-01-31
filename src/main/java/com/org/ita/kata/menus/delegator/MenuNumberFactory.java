package com.org.ita.kata.menus.delegator;

import com.org.ita.kata.students.delegator.StudentRealisationFactory;
import com.org.ita.kata.menus.*;

import com.org.ita.kata.utils.SystemInput;

public class MenuNumberFactory {

    public static final String INCORRECT_INPUT = "Incorrect input";
    public static final String EXIT_PROGRAM = "Exit";

    private String katas = "1.) Kata 8\n" + "2.) Kata 7\n" + "3.) Kata 6\n" + "4.) Kata 5\n" + "5.) Kata 4";

    private StudentRealisationFactory studentRealisationFactory;

    public MenuNumberFactory(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    public void runMenu() {
        while (true) {
            System.out.println("[ALL KATAS]\n" + katas);
            System.out.println("6.) Exit\n");
            System.out.println("Please enter number of kata : ");
            String kata = SystemInput.input.nextLine();
            switch (kata) {
                case "1":
                    (new MenuEight(studentRealisationFactory)).getAllTasks();
                    break;
                case "2":
                    (new MenuSeven(studentRealisationFactory)).getAllTasks();
                    break;
                case "3":
                    (new MenuSix(studentRealisationFactory)).getAllTasks();
                    break;
                case "4":
                    (new MenuFive(studentRealisationFactory)).getAllTasks();
                    break;
                case "5":
                    (new MenuFour(studentRealisationFactory)).getAllTasks();
                    break;
                case "6":
                    System.out.println(EXIT_PROGRAM);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
