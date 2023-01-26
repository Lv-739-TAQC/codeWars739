package com.org.ita.kata.menus;

import com.org.ita.kata.Four;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.factory.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

public class MenuFour implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "ALL TASKS";

    public MenuFour(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    @Override
    public Object whoImplemented() {
        return this.studentRealisationFactory.setUpImplementation().getClass();
    }

    public Four getStudentFourKataRealisation() {
        return this.studentRealisationFactory.setUpImplementation().implementationFourKata();
    }

    public void getFirstTask() {

    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks + "\n");
            System.out.println("Enter number of task : ");
            String taskNumber = SystemInput.input.nextLine();
            switch (taskNumber) {
                case "1":
                    getFirstTask();
                    break;
                case "2":
                    return;
                default:
                    System.out.println("[Incorrect input]");
                    break;
            }
        }
    }
}
