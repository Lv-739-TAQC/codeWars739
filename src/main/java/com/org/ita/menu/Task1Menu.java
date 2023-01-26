package com.org.ita.menu;

import com.org.ita.kata.Eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1Menu {

    private TasksMenu tasksMenu;
    private Scanner in;
    private String inputParam;

    public Task1Menu(TasksMenu tasksMenu) {
        this.tasksMenu = tasksMenu;
    }

    public void enterInputParameters() {
        inputParam = "";
        while(true) {
            try {
                in = new Scanner(System.in);
                System.out.println("----------------------------------------|");
                System.out.println("Finish program input               -> -1|");
                System.out.println("Go back input                      -> -2|");
                System.out.println("----------------------------------------|");
                System.out.println("Input parameters:                       |");
                System.out.println("----------------------------------------|");
                System.out.println("Choose time:                            |");

                inputParam = in.nextLine();

                switch (inputParam) {
                    case "-1":
                        System.exit(0);
                        break;
                    case "-2":
                        tasksMenu.inputTaskNumber();
                        break;
                    default:
                        chooseStudentsSolutionMenu(Double.parseDouble(inputParam));
                        break;
                }
                break;
            } catch(InputMismatchException | NumberFormatException e) {
                System.out.println(e);
                System.out.println("You have to input number.");
            } finally {
                enterInputParameters();
            }
        }
    }

    public void chooseStudentsSolutionMenu(double time) {
        inputParam = "";
        while(true) {
            try {
                in = new Scanner(System.in);
                System.out.println("----------------------------------------|");
                System.out.println("Finish program input               -> -1|");
                System.out.println("Go back input                      -> -2|");
                System.out.println("----------------------------------------|");
                System.out.println("Choose student's solution:              |");
                System.out.println("----------------------------------------|");
                System.out.println("AnnaMatvienko                      ->  1|");
                System.out.println("DenisPitsul                        ->  2|");
                System.out.println("dzobabohdan                        ->  3|");
                System.out.println("IrenZh                             ->  4|");
                System.out.println("janestadnytska                     ->  5|");
                System.out.println("kapustinIlya                       ->  6|");
                System.out.println("Maksym637                          ->  7|");
                System.out.println("savaxn04                           ->  8|");
                System.out.println("TafiyJanet                         ->  9|");
                System.out.println("TetianaFilatova                    -> 10|");

                inputParam = in.nextLine();

                switch (inputParam) {
                    case "-1":
                        System.exit(0);
                        break;
                    case "-2":
                        enterInputParameters();
                        break;
                    case "1":
                        chooseStudentsSolution(time, Student.AnnaMatvienko);
                        break;
                    case "2":
                        chooseStudentsSolution(time, Student.DenisPitsul);
                        break;
                    case "3":
                        chooseStudentsSolution(time, Student.dzobabohdan);
                        break;
                    case "4":
                        chooseStudentsSolution(time, Student.IrenZh);
                        break;
                    case "5":
                        chooseStudentsSolution(time, Student.janestadnytska);
                        break;
                    case "6":
                        chooseStudentsSolution(time, Student.kapustinIlya);
                        break;
                    case "7":
                        chooseStudentsSolution(time, Student.Maksym637);
                        break;
                    case "8":
                        chooseStudentsSolution(time, Student.savaxn04);
                        break;
                    case "9":
                        chooseStudentsSolution(time, Student.TafiyJanet);
                        break;
                    case "10":
                        chooseStudentsSolution(time, Student.TetianaFilatova);
                        break;
                    default:
                        System.out.println("You have to input number from menu.");
                        chooseStudentsSolutionMenu(time);
                        break;
                }
                break;
            } catch(InputMismatchException | NumberFormatException e) {
                System.out.println(e);
                System.out.println("You have to input correct number.");
            } finally {
                chooseStudentsSolutionMenu(time);
            }
        }
    }

    private void chooseStudentsSolution(double time, Student student) {
        Eight eight;
        System.out.print("Result: ");
        switch (student) {
            case AnnaMatvienko:
                eight = new com.org.ita.kata.implementation.AnnaMatviienko.EightImpl();
                System.out.println(eight.Liters(time));
                break;
            case DenisPitsul:
                eight = new com.org.ita.kata.implementation.DenisPitsul.EightImpl();
                System.out.println(eight.Liters(time));
                break;
            case dzobabohdan:
                eight = new com.org.ita.kata.implementation.dzobabohdan.EightImpl();
                System.out.println(eight.Liters(time));
                break;
            case IrenZh:
                eight = new com.org.ita.kata.implementation.IrenZh.EightImpl();
                System.out.println(eight.Liters(time));
                break;
            case janestadnytska:
                eight = new com.org.ita.kata.implementation.janestadnytska.EightImpl();
                System.out.println(eight.Liters(time));
                break;
            case kapustinIlya:
                eight = new com.org.ita.kata.implementation.kapustinIlya.EightImpl();
                System.out.println(eight.Liters(time));
                break;
            case Maksym637:
                eight = new com.org.ita.kata.implementation.Maksym637.EightImpl();
                eight.Liters(time);
                System.out.println(eight.Liters(time));
                break;
            case savaxn04:
                eight = new com.org.ita.kata.implementation.savaxn04.EightImpl();
                System.out.println(eight.Liters(time));
                break;
            case TafiyJanet:
                eight = new com.org.ita.kata.implementation.TafiyJanet.EightImpl();
                System.out.println(eight.Liters(time));
                break;
            case TetianaFilatova:
                eight = new com.org.ita.kata.implementation.TetianaFilatova.EightImpl();
                System.out.println(eight.Liters(time));
                break;
        }
        System.out.println();
    }
}
