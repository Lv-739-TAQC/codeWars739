package com.org.ita.kata.menus;


import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;
import com.org.ita.kata.utils.SystemInput;

import java.util.Arrays;
import java.math.BigInteger;

public class MenuFive extends MenuNumber {
	
	public MenuFive() {}

	public MenuFive(Student student) {
        super(student);
    }
    @NameMethod(name = "Gap in Primes")
    public void getGapInPrimesTask() {

    }
    @NameMethod(name = "Trailing zeros in factorial")
    public void getTrailingZerosInFactorialTask() {

    }
    @NameMethod(name = "Perimeter of squares in a rectangle")
    public void getPerimeterOfSquaresInARectangleTask() {
        System.out.println("Enter the quantity of squares : ");
        BigInteger n= SystemInput.inputBigInteger();
        System.out.println("The total perimeter of all squares in a rectangle when there are n + 1 squares will be : " + getStudentFiveKataRealisation().perimeter(n));
    }
    @NameMethod(name = "Which x for that sum?")
    public void getWhichXForThatSumTask() {

    }
    @NameMethod(name = "Find the smallest")
    public void getFindTheSmallestTask() {
        long m = 0;
        while(m <= 0){
            System.out.println("Enter a positive number consisting of digits : ");
            m = SystemInput.inputLongNumber();
        }
        System.out.println("The smallest number = " + Arrays.toString(getStudentFiveKataRealisation().smallest(m)));
    }
}
