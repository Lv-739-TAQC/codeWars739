package com.org.ita.kata.menus;

import com.org.ita.kata.Eight;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.factory.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

public class MenuEight implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "1.) Keep Hydrated!\n" + "2.) Volume of a Cuboid\n" +
            "3.) Miles per gallon to kilometers per liter\n" + "n.) ... ";

    public MenuEight(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    @Override
    public Object whoImplemented() {
        return this.studentRealisationFactory.setUpImplementation().getClass();
    }

    public Eight getStudentEightKataRealisation() {
        return this.studentRealisationFactory.setUpImplementation().implementationEightKata();
    }

    public void getFirstTask() {

    }

    public void getSecondTask() {
        System.out.println("Enter length number : ");
        double length = SystemInput.input.nextDouble();
        System.out.println("Enter width number : ");
        double width = SystemInput.input.nextDouble();
        System.out.println("Enter height number : ");
        double height = SystemInput.input.nextDouble();
        System.out.println("V = " + getStudentEightKataRealisation().getVolumeOfCuboid(length, width, height));
    }

    public void getThirdTask() {

    }

    public void getFourthTask() {

    }

    public void getFifthTask() {

    }

    public void getSixthTask() {

    }

    public void getSeventhTask() {

    }

    public void getEighthTask() {

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
                    return;
                case 5:
                    getFifthTask();
                    break;
                case 6:
                    getSixthTask();
                    break;
                case 7:
                    getSeventhTask();
                    break;
                case 8:
                    getEighthTask();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("[Incorrect input]");
                    break;
            }
        }
    }
}
