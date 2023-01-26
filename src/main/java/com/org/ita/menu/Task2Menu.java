package com.org.ita.menu;

import com.org.ita.kata.Eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2Menu {
    private TasksMenu tasksMenu;
    private Scanner in;
    private String inputParam;

    public Task2Menu(TasksMenu tasksMenu) {
        this.tasksMenu = tasksMenu;
    }

    public void enterInputParameters(int propertyNumberParameter, double lengthParameter, double widthParameter, double heightParameter) {
            double length = lengthParameter;
            double width = widthParameter;
            double height = heightParameter;

            String value = "";
            /*
             *  number of iteration in method
             *  0 -> input length
             *  1 -> input width
             *  2 -> input height
             *  3 -> next to chooseStudentsSolutionMenu
             */
            int propertyNumber = propertyNumberParameter;
            while(propertyNumber < 4) {
                try {
                    in = new Scanner(System.in);

                    if (propertyNumber < 3) {
                        System.out.println("----------------------------------------|");
                        System.out.println("Finish program input               -> -1|");
                        System.out.println("Go back input                      -> -2|");
                        System.out.println("----------------------------------------|");
                        System.out.println("Input parameters:                       |");
                        System.out.println("----------------------------------------|");
                    }
                    if(propertyNumber == 0) {
                        System.out.print("Input length: ");
                        value = in.nextLine();
                        switch (value) {
                            case "-1":
                                System.exit(0);
                                break;
                            case "-2":
                                tasksMenu.inputTaskNumber();
                                break;
                            default:
                                length = Double.parseDouble(value);
                                propertyNumber++;
                                break;
                        }
                    }
                    else if (propertyNumber == 1) {
                        System.out.print("Input width: ");
                        value = in.nextLine();
                        switch (value) {
                            case "-1":
                                System.exit(0);
                                break;
                            case "-2":
                                tasksMenu.inputTaskNumber();
                                break;
                            default:
                                width = Double.parseDouble(value);
                                propertyNumber++;
                                break;
                        }
                    }
                    else if (propertyNumber == 2) {
                        System.out.print("Input height: ");
                        value = in.nextLine();
                        switch (value) {
                            case "-1":
                                System.exit(0);
                                break;
                            case "-2":
                                tasksMenu.inputTaskNumber();
                                break;
                            default:
                                height = Double.parseDouble(value);
                                propertyNumber++;
                                break;
                        }
                    }
                    else {
                        chooseStudentsSolutionMenu(length, width, height);
                        propertyNumber++;
                    }
                } catch(InputMismatchException | NumberFormatException e) {
                    System.out.println(e);
                    System.out.println("You have to input correct value.");
                } finally {
                    enterInputParameters(propertyNumber, length, width, height);
                }
            }
    }

    public void chooseStudentsSolutionMenu(double length, double width, double height) {
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
                        enterInputParameters(0, length, width, height);
                        break;
                    case "1":
                        chooseStudentsSolution(length, width, height, Student.AnnaMatvienko);
                        break;
                    case "2":
                        chooseStudentsSolution(length, width, height, Student.DenisPitsul);
                        break;
                    case "3":
                        chooseStudentsSolution(length, width, height, Student.dzobabohdan);
                        break;
                    case "4":
                        chooseStudentsSolution(length, width, height, Student.IrenZh);
                        break;
                    case "5":
                        chooseStudentsSolution(length, width, height, Student.janestadnytska);
                        break;
                    case "6":
                        chooseStudentsSolution(length, width, height, Student.kapustinIlya);
                        break;
                    case "7":
                        chooseStudentsSolution(length, width, height, Student.Maksym637);
                        break;
                    case "8":
                        chooseStudentsSolution(length, width, height, Student.savaxn04);
                        break;
                    case "9":
                        chooseStudentsSolution(length, width, height, Student.TafiyJanet);
                        break;
                    case "10":
                        chooseStudentsSolution(length, width, height, Student.TetianaFilatova);
                        break;
                    default:
                        System.out.println("You have to input number from menu.");
                        chooseStudentsSolutionMenu(length, width, height);
                        break;
                }
                break;
            } catch(InputMismatchException | NumberFormatException e) {
                System.out.println(e);
                System.out.println("You have to input correct number.");
            } finally {
                chooseStudentsSolutionMenu(length, width, height);
            }
        }
    }

    private void chooseStudentsSolution(double length, double width, double height, Student student) {
        Eight eight;
        System.out.print("Result: ");
        switch (student) {
            case AnnaMatvienko:
                eight = new com.org.ita.kata.implementation.AnnaMatviienko.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
            case DenisPitsul:
                eight = new com.org.ita.kata.implementation.DenisPitsul.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
            case dzobabohdan:
                eight = new com.org.ita.kata.implementation.dzobabohdan.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
            case IrenZh:
                eight = new com.org.ita.kata.implementation.IrenZh.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
            case janestadnytska:
                eight = new com.org.ita.kata.implementation.janestadnytska.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
            case kapustinIlya:
                eight = new com.org.ita.kata.implementation.kapustinIlya.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
            case Maksym637:
                eight = new com.org.ita.kata.implementation.Maksym637.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
            case savaxn04:
                eight = new com.org.ita.kata.implementation.savaxn04.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
            case TafiyJanet:
                eight = new com.org.ita.kata.implementation.TafiyJanet.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
            case TetianaFilatova:
                eight = new com.org.ita.kata.implementation.TetianaFilatova.EightImpl();
                System.out.println(eight.getVolumeOfCuboid(length, width, height));
                break;
        }
        System.out.println();
    }
}
