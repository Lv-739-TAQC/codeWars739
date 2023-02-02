package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.Six;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

import java.io.*;
import java.util.Scanner;

import static com.org.ita.kata.utils.SystemInput.readFromFile;

public class MenuSix implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "1.) Build a pile of Cubes\n"
            + "2.) Easy balance checking\n"
            + "3.) Floating-point Approximation (I)\n"
            + "4.) Rainfall\n"
            + "5.) Ranking NBA\n"
            + "6.) Help the bookseller!";

    public MenuSix(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    @Override
    public Object whoImplemented() {
        return this.studentRealisationFactory.setUpImplementation().getClass();
    }

    public Six getStudentSixKataRealisation() {
        return this.studentRealisationFactory.setUpImplementation().implementationSixKata();
    }

    public void getBuildAPileOfCubesTask() {

    }

    public boolean exitMenu;

    public void getEasyBalanceCheckingTask() {
        exitMenu = false;
        Scanner scanner = new Scanner(System.in);
        String file1Content = "";
        String file2Content = "";
        String file3Content = "";
        String path = "src/main/resources/balance/";
        File input1 = new File(path + "input1.txt");
        File input2 = new File(path + "input2.txt");
        File input3 = new File(path + "input3.txt");
        System.out.println();
        System.out.println("Please, choose one of three files to work with while Balance Checking task execution: ");
        System.out.println();
        file1Content = getContent("First", input1);
        file2Content = getContent("Second", input2);
        file3Content = getContent("Third", input3);
        while (!exitMenu) {
            System.out.println("Enter '1' to work with input1.txt");
            System.out.println("Enter '2' to work with input2.txt");
            System.out.println("Enter '3' to work with input3.txt");
            System.out.println();
            System.out.println("Make Your choice: ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println(getStudentSixKataRealisation().balance(file1Content));
                    System.out.println();
                    return;
                case 2:
                    System.out.println(getStudentSixKataRealisation().balance(file2Content));
                    System.out.println();
                    return;
                case 3:
                    System.out.println(getStudentSixKataRealisation().balance(file3Content));
                    System.out.println();
                    return;
                default:
                    System.out.println("Please, enter correct value: 1, 2 or 3.");
                    System.out.println();
            }
        }
        scanner.close();
    }

    public String getContent(String fileNum, File input) {
        StringBuilder sb =new StringBuilder();
        try {
            Scanner scanner = new Scanner(input);
            System.out.println(fileNum + " file name: " + input.getName());
            System.out.println(fileNum + " file content: ");
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append("\n");
            }
            System.out.println();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found, please, make sure, the path is correct.");
            System.out.println();
            exitMenu = true;
        }
        return sb.toString();
    }


    public void getFloatingPointApproximationITask() {

    }

    public void getRainfallTask() {

    }

    public void getRankingNBATask() {

    }

    public void getHelpTheBooksellerTask() {

    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks);
            System.out.println("7.) Go back\n");
            System.out.println("Enter number of task : ");
            String taskNumber = SystemInput.input.nextLine();
            switch (taskNumber) {
                case "1":
                    getBuildAPileOfCubesTask();
                    break;
                case "2":
                    getEasyBalanceCheckingTask();
                    break;
                case "3":
                    getFloatingPointApproximationITask();
                    break;
                case "4":
                    getRainfallTask();
                    break;
                case "5":
                    getRankingNBATask();
                    break;
                case "6":
                    getHelpTheBooksellerTask();
                    break;
                case "7":
                    System.out.println(GO_BACK);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
