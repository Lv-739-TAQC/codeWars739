package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.Six;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

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

    public void getEasyBalanceCheckingTask() {

    }

    public void getFloatingPointApproximationITask() {
        System.out.println("Enter x near zero for f(x) function : ");
        double x = SystemInput.inputNearZeroNumber();
        System.out.println("Good approximation of f(x) is : " + getStudentSixKataRealisation().f(x));
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
