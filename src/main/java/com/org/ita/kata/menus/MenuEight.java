package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;

import java.util.Arrays;

public class MenuEight extends MenuNumber {

    public MenuEight() {
    }

    public MenuEight(Student student) {
        super(student);
    }

    @NameMethod(name = "Keep Hydrated!")
    public void getKeepHydratedTask() {
        System.out.println("Enter time number : ");
        double time = systemInput.inputDoubleNumber();
        System.out.println("Liters = " + getStudentEightKataRealisation().liters(time));
    }

    @NameMethod(name = "Volume of a Cuboid")
    public void getVolumeOfACuboidTask() {
        System.out.println("Enter length number : ");
        double length = systemInput.inputDoubleNumber();
        System.out.println("Enter width number : ");
        double width = systemInput.inputDoubleNumber();
        System.out.println("Enter height number : ");
        double height = systemInput.inputDoubleNumber();
        System.out.println("V = " + getStudentEightKataRealisation().getVolumeOfCuboid(length, width, height));
    }

    @NameMethod(name = "Miles per gallon to kilometers per liter")
    public void getMilesPerGallonToKilometersPerLiterTask() {
        System.out.println("To convert miles per imperial gallon into kilometers per liter, please, enter the number of miles per imperial gallon to be converted:");
        float mpg = systemInput.inputFloatNumber();
        System.out.println();
        System.out.println(mpg + " miles per imperial gallon = " + getStudentEightKataRealisation().mpgToKPM(mpg) + " kilometers per liter.");
        System.out.println();
    }

    @NameMethod(name = "To square root or no to square")
    public void getToSquareRootOrNoToSquareTask() {
        int[] numbers = systemInput.inputIntArray();
        System.out.print("Entered numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        int[] result = getStudentEightKataRealisation().squareOrSquareRoot(numbers);
        System.out.print("\nResult: ");
        for (int number : result) {
            System.out.print(number + " ");
        }
        System.out.print("\n");
    }

    @NameMethod(name = "Count of positives / sum of negatives")
    public void getCountOfPositivesSumOfNegativesTask() {
        int[] array = systemInput.inputIntArray();
        int[] result = getStudentEightKataRealisation().countPositivesSumNegatives(array);
        System.out.println(Arrays.toString(result));
    }

    @NameMethod(name = "Convert a String to a Number")
    public void getConvertAStringToANumberTask() {
        System.out.println("Enter  string: ");
        String str = systemInput.inputNumber();
        System.out.println("Now it's a number : " + getStudentEightKataRealisation().stringToNumber(str));
    }

    @NameMethod(name = "Formatting decimal places")
    public void getFormattingDecimalPlacesTask() {
        System.out.println("Enter double number with several decimal places : ");
        double doubleNumber = systemInput.inputDoubleNumber();
        System.out.println("Rounded number to two decimal place = " + getStudentEightKataRealisation().TwoDecimalPlaces(doubleNumber));
    }

    @NameMethod(name = "Find numbers which are divisible by given number")
    public void getFindNumbersWhichAreDivisibleByGivenNumberTask() {
        System.out.println("Enter the numbers you want to check, separated by commas: ");
        int[] numbers = systemInput.inputIntArray();
        System.out.println("Enter the number by which the numbers to be checked must be divided: ");
        int divider = systemInput.inputIntNumber();
        System.out.println("Numbers that are evenly divisible by the given divisor: "
                + getStudentEightKataRealisation().divisibleBy(numbers, divider));

    }
}
