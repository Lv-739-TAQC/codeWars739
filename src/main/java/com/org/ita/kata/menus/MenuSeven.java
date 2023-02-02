package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;
import com.org.ita.kata.utils.SystemInput;

public class MenuSeven extends MenuNumber {

    public MenuSeven(Student student) {
        super(student);
    }
    @NameMethod(name = "Looking for a benefactor")
    public void getLookingForABenefactorTask() {
        System.out.println("Enter financial donations from benefactors : ");
        double[] arr = SystemInput.inputDoubleArray();
        System.out.println("Enter the desired average donation : " );
        double nAvg = SystemInput.inputDoubleNumber();
        System.out.println("To reach the average donation, the next benefactor must give to the association : " + getStudentSevenKataRealisation().newAvg(arr, nAvg));
    }
    @NameMethod(name = "Sum of the first nth term of Series")
    public void getSumOfTheFirstNthTermOfSeriesTask() {

    }
}
