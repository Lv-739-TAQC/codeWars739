package com.org.ita.kata.menus;

import com.org.ita.kata.Five;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.factory.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

public class MenuFive implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "ALL TASKS";

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

    public void getFirstTask() {

    }

    public void getSecondTask() {

    }

    public void getThirdTask() {

    }

    public void getFourthTask() {

    }

    public void getFifthTask() {

    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks + "\n");
            System.out.println("Enter number of task : ");
            int taskNumber = SystemInput.input.nextInt();
            switch (taskNumber) {
                case 1:
                    getFirstTask();
                    break;
                case 2:
                    getSecondTask();
                    break;
                case 3:
                    getThirdTask();
                    break;
                case 4:
                    getFourthTask();
                    break;
                case 5:
                    getFifthTask();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("[Incorrect input]");
                    break;
            }
        }
    }
}
