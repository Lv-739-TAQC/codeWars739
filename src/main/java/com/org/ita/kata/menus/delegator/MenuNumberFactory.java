package com.org.ita.kata.menus.delegator;

import com.org.ita.kata.factory.delegator.StudentRealisationFactory;
import com.org.ita.kata.menus.*;

import com.org.ita.kata.utils.SystemInput;

public class MenuNumberFactory {

    private String katas = "1.) Kata 8\n" + "2.) Kata 7\n" + "3.) Kata 6\n" + "4.) Kata 5\n" + "5.) Kata 4\n";

    private StudentRealisationFactory studentRealisationFactory;

    public MenuNumberFactory(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    public void runMenu() {
        while (true) {
            System.out.println("[ALL KATAS]\n" + katas + "\n");
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
                case "6":
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("[Incorrect input]");
                    break;
            }
        }
    }
}
