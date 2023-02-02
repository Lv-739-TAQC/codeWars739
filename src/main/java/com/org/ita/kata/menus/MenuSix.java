package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;
import com.org.ita.kata.utils.SystemInput;

public class MenuSix extends MenuNumber {
	
	public MenuSix() {}

	public MenuSix(Student student) {
        super(student);
    }
    @NameMethod(name = "Build a pile of Cubes")
    public void getBuildAPileOfCubesTask() {
        System.out.println("Enter the total volume of the building : ");
        long volume = SystemInput.inputLongNumber();
        System.out.println("Number of cubes = " + getStudentSixKataRealisation().findNb(volume));
    }
    
    @NameMethod(name = "Easy balance checking")
    public void getEasyBalanceCheckingTask() {

    }
    @NameMethod(name = "Floating-point Approximation (I)")
    public void getFloatingPointApproximationITask() {
        System.out.println("Enter x near zero for f(x) function : ");
        double x = SystemInput.inputNearZeroNumber();
        System.out.println("Good approximation of f(x) is : " + getStudentSixKataRealisation().f(x));
    }
    @NameMethod(name = "Rainfall")
    public void getRainfallTask() {

    }
    @NameMethod(name = "Ranking NBA")
    public void getRankingNBATask() {

    }
    @NameMethod(name = "Help the bookseller!")
    public void getHelpTheBooksellerTask() {

    }
}
