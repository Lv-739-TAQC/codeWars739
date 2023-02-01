package com.org.ita.kata.menus;

import com.org.ita.kata.Five;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

import java.math.BigInteger;

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

    }

    public void getTrailingZerosInFactorialTask() {

    }

    public void getPerimeterOfSquaresInARectangleTask() {
        System.out.println("Enter the quantity of squares : ");
        BigInteger n= SystemInput.inputBigInteger();
        System.out.println("The total perimeter of all squares in a rectangle when there are n + 1 squares will be : " + getStudentFiveKataRealisation().perimeter(n));
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
