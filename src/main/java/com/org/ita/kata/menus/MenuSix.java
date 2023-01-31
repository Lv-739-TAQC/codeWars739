package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.Six;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

public class MenuSix implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "ALL TASKS";

    public MenuSix(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    @Override
    public Object whoImplemented() {
        return this.studentRealisationFactory.setUpImplementation().getClass();
    }

    public Six getStudentSixKataRealisation() {
        return this.studentRealisationFactory.setUpImplementation().implementationSixKata();
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

    public void getSixthTask() {

    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks);
            System.out.println("Enter number of task : ");
            String taskNumber = SystemInput.input.nextLine();
            switch (taskNumber) {
                case "1":
                    getFirstTask();
                    break;
                case "2":
                    getSecondTask();
                    break;
                case "3":
                    getThirdTask();
                    break;
                case "4":
                    getFourthTask();
                    break;
                case "5":
                    getFifthTask();
                    break;
                case "6":
                    getSixthTask();
                    break;
                case "7":
                    System.out.println(GO_BACK);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
