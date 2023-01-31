package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.Seven;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

public class MenuSeven implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "1.) Looking for a benefactor\n"
            + "2.) Sum of the first nth term of Series";

    public MenuSeven(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    @Override
    public Object whoImplemented() {
        return this.studentRealisationFactory.setUpImplementation().getClass();
    }

    public Seven getStudentSevenKataRealisation() {
        return this.studentRealisationFactory.setUpImplementation().implementationSevenKata();
    }

    public void getLookingForABenefactorTask() {
        System.out.println("Enter financial donations from benefactors : ");
        double[] arr = SystemInput.inputDoubleArray();
        System.out.println("Enter the desired average donation : " );
        double nAvg = SystemInput.inputDoubleNumber();
        System.out.println("To reach the average donation, the next benefactor must give to the association : " + getStudentSevenKataRealisation().newAvg(arr, nAvg));
    }

    public void getSumOfTheFirstNthTermOfSeriesTask() {

    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks);
            System.out.println("3.) Go back\n");
            System.out.println("Enter number of task : ");
            String taskNumber = SystemInput.input.nextLine();
            switch (taskNumber) {
                case "1":
                    getLookingForABenefactorTask();
                    break;
                case "2":
                    getSumOfTheFirstNthTermOfSeriesTask();
                    break;
                case "3":
                    System.out.println(GO_BACK);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
