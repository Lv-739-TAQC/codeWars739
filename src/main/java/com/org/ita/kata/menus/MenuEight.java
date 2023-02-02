package com.org.ita.kata.menus;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.org.ita.kata.Eight;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

public class MenuEight implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "1.) Keep Hydrated!\n"
            + "2.) Volume of a Cuboid\n"
            + "3.) Miles per gallon to kilometers per liter\n"
            + "4.) To square root or no to square\n"
            + "5.) Count of positives / sum of negatives\n"
            + "6.) Convert a String to a Number\n"
            + "7.) Formatting decimal places\n"
            + "8.) Find numbers which are divisible by given number";

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

    public void getKeepHydratedTask() {
        System.out.println("Enter time number : ");
        double time = SystemInput.inputDoubleNumber();
        System.out.println("Liters = " + getStudentEightKataRealisation().Liters(time));
    }

    public void getVolumeOfACuboidTask() {
        System.out.println("Enter length number : ");
        double length = SystemInput.inputDoubleNumber();
        System.out.println("Enter width number : ");
        double width = SystemInput.inputDoubleNumber();
        System.out.println("Enter height number : ");
        double height = SystemInput.inputDoubleNumber();
        System.out.println("V = " + getStudentEightKataRealisation().getVolumeOfCuboid(length, width, height));
    }

    public void getMilesPerGallonToKilometersPerLiterTask() {

    }

    public void getToSquareRootOrNoToSquareTask() {

    }
    
    // Author = Kapustin Ilya
    public void getCountOfPositivesSumOfNegativesTask() {
    	int[] array = SystemInput.inputIntArray();
    	int[] result = getStudentEightKataRealisation().countPositivesSumNegatives(array);
    	System.out.println(Arrays.toString(result));
    }

    public void getConvertAStringToANumberTask() {

    }

    public void getFormattingDecimalPlacesTask() {

    }

    public void getFindNumbersWhichAreDivisibleByGivenNumberTask() {

    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks);
            System.out.println("9.) Go back\n");
            System.out.println("Enter number of task : ");
            String taskNumber = SystemInput.input.nextLine();
            switch (taskNumber) {
                case "1":
                    getKeepHydratedTask();
                    break;
                case "2":
                    getVolumeOfACuboidTask();
                    break;
                case "3":
                    getMilesPerGallonToKilometersPerLiterTask();
                    break;
                case "4":
                    getToSquareRootOrNoToSquareTask();
                    return;
                case "5":
                    getCountOfPositivesSumOfNegativesTask();
                    break;
                case "6":
                    getConvertAStringToANumberTask();
                    break;
                case "7":
                    getFormattingDecimalPlacesTask();
                    break;
                case "8":
                    getFindNumbersWhichAreDivisibleByGivenNumberTask();
                    break;
                case "9":
                    System.out.println(GO_BACK);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
