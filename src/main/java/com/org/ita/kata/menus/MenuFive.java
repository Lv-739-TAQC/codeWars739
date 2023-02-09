package com.org.ita.kata.menus;


import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;
import com.org.ita.kata.utils.SystemInput;

import java.util.Arrays;
import java.math.BigInteger;
import java.util.Scanner;

public class MenuFive extends MenuNumber {

    public MenuFive() {
    }

    public MenuFive(Student student) {
        super(student);
    }

    @NameMethod(name = "Gap in Primes")
    public void getGapInPrimesTask() {
        long m, n;
        int g;
        while (true) {
            System.out.println("Enter the start number of the search (m > 2) : ");
            m = systemInput.inputLongNumber();
            if (m > 2) {
                break;
            } else {
                System.out.println(INCORRECT_INPUT);
            }
        }
        while (true) {
            System.out.println("Enter the end number of the search (n >= " + m + ") : ");
            n = systemInput.inputLongNumber();
            if (n >= m) {
                break;
            } else {
                System.out.println(INCORRECT_INPUT);
            }
        }
        while (true) {
            System.out.println("Enter the gap we are looking for between " + m + " and " + n + " (g >= 2) : ");
            g = systemInput.inputIntNumber();
            if (g >= 2) {
                break;
            } else {
                System.out.println(INCORRECT_INPUT);
            }
        }
        System.out.println("The first pair between " + m + " and " + n + " with a " + g + "-gap = " + Arrays.toString(getStudentFiveKataRealisation().gap(g, m, n)));
    }

    @NameMethod(name = "Trailing zeros in factorial")
    public void getTrailingZerosInFactorialTask() {

        System.out.println("Enter the number for calculating the number of trailing zeros in a factorial: ");
        int n = SystemInput.inputIntNumber();
        System.out.println("The number of trailing zeros in a factorial of a given number: "
                + getStudentFiveKataRealisation().zeros(n));

    }

    @NameMethod(name = "Perimeter of squares in a rectangle")
    public void getPerimeterOfSquaresInARectangleTask() {
        BigInteger n= BigInteger.ZERO;
        while (n.intValue()<=0) {
            System.out.println("Enter the quantity of squares : ");
            n= systemInput.inputBigInteger();
        }
        System.out.println("The total perimeter of all squares in a rectangle when there are n + 1 squares will be : " + getStudentFiveKataRealisation().perimeter(n));
    }

    @NameMethod(name = "Which x for that sum?")
    public void getWhichXForThatSumTask() {
        System.out.println("Enter a decimal value:");
        double m = SystemInput.input.nextDouble();
        System.out.println("The solution is: " + getStudentFiveKataRealisation().solve(m));
    }

    @NameMethod(name = "Find the smallest")
    public void getFindTheSmallestTask() {
        long m = 0;
        while (m <= 0) {
            System.out.println("Enter a positive number consisting of digits : ");
            m = systemInput.inputLongNumber();
        }
        System.out.println("The smallest number = " + Arrays.toString(getStudentFiveKataRealisation().smallest(m)));
    }
}
