package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;

public class MenuSeven extends MenuNumber {

    public MenuSeven() {
    }

    public MenuSeven(Student student) {
        super(student);
    }

    @NameMethod(name = "Looking for a benefactor")
    public void getLookingForABenefactorTask() {
        System.out.println("Enter financial donations from benefactors : ");
        double[] arr = systemInput.inputDoubleArray();
        System.out.println("Enter the desired average donation : ");
        double nAvg;
        while (true) {
            nAvg = systemInput.inputDoubleNumber();
            try {
                getStudentSevenKataRealisation().newAvg(arr, nAvg);
            } catch (IllegalArgumentException e) {
                System.out.println(e + " : Your  expectations are not great enough. Please enter other donation.");
                continue;
            }
            break;
        }
        System.out.println("To reach the average donation, the next benefactor must give to the association : " + getStudentSevenKataRealisation().newAvg(arr, nAvg));
    }

    @NameMethod(name = "Sum of the first nth term of Series")
    public void getSumOfTheFirstNthTermOfSeriesTask() {
        System.out.println("Enter the number of terms in the series:");
        int n = systemInput.input.nextInt();
        System.out.println("The sum of the series is: " + getStudentSevenKataRealisation().seriesSum(n));
    }
}
