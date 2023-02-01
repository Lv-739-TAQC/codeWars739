package com.org.ita.kata.menus;

import com.org.ita.kata.Five;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

import java.util.Arrays;

public class MenuFive implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "1.) Gap in Primes\n"
            + "2.) Trailing zeros in factorial\n"
            + "3.) Perimeter of squares in a rectangle\n"
            + "4.) Which x for that sum?\n"
            + "5.) Find the smallest";

    public MenuFive(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    @Override
    public Object whoImplemented() {
        return this.studentRealisationFactory.setUpImplementation().getClass();
    }

    public Five getStudentFiveKataRealisation() {
        return this.studentRealisationFactory.setUpImplementation().implementationFiveKata();
    }

    public void getGapInPrimesTask() {
        long m, n;
        int g;
        while (true) {
            System.out.println("Enter the start number of the search (m > 2) : ");
            m = SystemInput.inputLongNumber();
            if (m > 2) {
                break;
            } else {
                System.out.println(INCORRECT_INPUT);
            }
        }
        while (true) {
            System.out.println("Enter the end number of the search (n >= " + m + ") : ");
            n = SystemInput.inputLongNumber();
            if (n >= m) {
                break;
            } else {
                System.out.println(INCORRECT_INPUT);
            }
        }
        while (true) {
            System.out.println("Enter the gap we are looking for between " + m + " and " + n + " (g >= 2) : ");
            g = SystemInput.inputIntNumber();
            if (g >= 2) {
                break;
            } else {
                System.out.println(INCORRECT_INPUT);
            }
        }
        System.out.println("The first pair between " + m + " and " + n + " with a " + g + "-gap = " + Arrays.toString(getStudentFiveKataRealisation().gap(g, m, n)));
    }

    public void getTrailingZerosInFactorialTask() {

    }

    public void getPerimeterOfSquaresInARectangleTask() {

    }

    public void getWhichXForThatSumTask() {

    }

    public void getFindTheSmallestTask() {

    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks);
            System.out.println("6.) Go back\n");
            System.out.println("Enter number of task : ");
            String taskNumber = SystemInput.input.nextLine();
            switch (taskNumber) {
                case "1":
                    getGapInPrimesTask();
                    break;
                case "2":
                    getTrailingZerosInFactorialTask();
                    break;
                case "3":
                    getPerimeterOfSquaresInARectangleTask();
                    break;
                case "4":
                    getWhichXForThatSumTask();
                    break;
                case "5":
                    getFindTheSmallestTask();
                    break;
                case "6":
                    System.out.println(GO_BACK);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
