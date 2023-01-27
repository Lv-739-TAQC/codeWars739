package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.Seven;
import com.org.ita.kata.factory.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

import static com.org.ita.kata.utils.Constant.ErrorMessages.INCORRECT_INPUT;
import static com.org.ita.kata.utils.Constant.MenuSteps.GO_BACK;

public class MenuSeven implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "ALL TASKS";

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

    public void getFirstTask() {

    }

    public void getSecondTask() {

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
                    System.out.println(GO_BACK);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
