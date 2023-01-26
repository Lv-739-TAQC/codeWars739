package com.org.ita.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TasksMenu {

    private MainMenu mainMenu;
    private Scanner in;
    private String inputIndex;
    private Task1Menu task1Menu;
    private Task2Menu task2Menu;

    public TasksMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public void inputTaskNumber() {
        inputIndex = "";
        while(true) {
            try {
                in = new Scanner(System.in);

                System.out.println("----------------------------------------|");
                System.out.println("Finish program input               -> -1|");
                System.out.println("Go back input                      -> -2|");
                System.out.println("----------------------------------------|");
                System.out.println("Choose task number:                     |");
                System.out.println("----------------------------------------|");
                System.out.println("Task 1 - Keep Hydrated!            ->  1|");
                System.out.println("Task 2 - Volume of a cuboid        ->  2|");

                inputIndex = in.nextLine();

                switch (inputIndex) {
                    case "-1":
                        System.exit(0);
                        break;
                    case "-2":
                        mainMenu.openMainMenu();
                        break;
                    case "1":
                        openTask1Menu();
                        break;
                    case "2":
                        openTask2Menu();
                        break;
                    default:
                        System.out.println("You have to input number from menu.");
                        inputTaskNumber();
                        break;
                }
                break;
            } catch(InputMismatchException | NumberFormatException e) {
                System.out.println(e);
                System.out.println("You have to input correct number.");
            } finally {
                inputTaskNumber();
            }
        }
    }


    private Task1Menu getTask1MenuInstance() {
        if (task1Menu == null) {
            task1Menu = new Task1Menu(this);
        }
        return task1Menu;
    }

    private Task2Menu getTask2MenuInstance() {
        if (task2Menu == null) {
            task2Menu = new Task2Menu(this);
        }
        return task2Menu;
    }

    private void openTask1Menu() {
        Task1Menu task1Menu = getTask1MenuInstance();
        task1Menu.enterInputParameters();
    }

    private void openTask2Menu() {
        Task2Menu task2Menu = getTask2MenuInstance();
        task2Menu.enterInputParameters(0, 0, 0, 0);
    }
}
