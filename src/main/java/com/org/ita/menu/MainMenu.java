package com.org.ita.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner in;
    private String inputIndex;
    private TasksMenu tasksMenu;

    public void openMainMenu() {
        while(true) {
            try {
                in = new Scanner(System.in);

                System.out.println("-------------M A I N  P A G E------------");
                System.out.println("Finish program input               -> -1|");
                System.out.println("----------------------------------------|");
                System.out.println("Run some task                      ->  1|");

                inputIndex = in.nextLine();

                switch (inputIndex) {
                    case "-1":
                        System.exit(0);
                        break;
                    case "1":
                        openTasksMenu();
                        break;
                    default:
                        System.out.println("You have to input number from menu.");
                        openMainMenu();
                        break;
                }
                break;
            } catch(InputMismatchException | NumberFormatException e) {
                System.out.println(e);
                System.out.println("You have to input correct number.");
            } finally {
                openMainMenu();
            }
        }
    }

    private TasksMenu getTasksMenuInstance() {
        if (tasksMenu == null) {
            tasksMenu = new TasksMenu(this);
        }
        return tasksMenu;
    }

    private void openTasksMenu() {
        TasksMenu tasksMenu = getTasksMenuInstance();
        tasksMenu.inputTaskNumber();
    }
}
