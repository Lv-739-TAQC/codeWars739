package com.org.ita.kata.menus;

import com.org.ita.kata.Four;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

public class MenuFour implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "1.) The Greatest Warrior";

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

    public void getTheGreatestWarriorTask() {

    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks);
            System.out.println("2.) Go back\n");
            System.out.println("Enter number of task : ");
            String taskNumber = SystemInput.input.nextLine();
            switch (taskNumber) {
                case "1":
                    getTheGreatestWarriorTask();
                    break;
                case "2":
                    System.out.println(GO_BACK);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
