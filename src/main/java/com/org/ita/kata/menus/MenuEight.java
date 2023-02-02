package com.org.ita.kata.menus;

import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;
import com.org.ita.kata.utils.SystemInput;

public class MenuEight extends MenuNumber {

	public MenuEight() {}
	
	public MenuEight(Student student) {
        super(student);
    }
    @NameMethod(name = "Keep Hydrated!")
    public void getKeepHydratedTask() {
        System.out.println("Enter time number : ");
        double time = SystemInput.inputDoubleNumber();
        System.out.println("Liters = " + getStudentEightKataRealisation().Liters(time));
    }
    @NameMethod(name = "Volume of a Cuboid")
    public void getVolumeOfACuboidTask() {
        System.out.println("Enter length number : ");
        double length = SystemInput.inputDoubleNumber();
        System.out.println("Enter width number : ");
        double width = SystemInput.inputDoubleNumber();
        System.out.println("Enter height number : ");
        double height = SystemInput.inputDoubleNumber();
        System.out.println("V = " + getStudentEightKataRealisation().getVolumeOfCuboid(length, width, height));
    }
    
    @NameMethod(name = "Miles per gallon to kilometers per liter")
    public void getMilesPerGallonToKilometersPerLiterTask() {

    }
    @NameMethod(name = "To square root or no to square")
    public void getToSquareRootOrNoToSquareTask() {

    }
    @NameMethod(name = "Count of positives / sum of negatives")
    public void getCountOfPositivesSumOfNegativesTask() {

    }
    @NameMethod(name = "Convert a String to a Number")
    public void getConvertAStringToANumberTask() {
        System.out.println("Enter  string: ");
        String str = SystemInput.inputStringToNumber();
        System.out.println("Now it's a number : " + getStudentEightKataRealisation().stringToNumber(str));
    }
    @NameMethod(name = "Formatting decimal places")
    public void getFormattingDecimalPlacesTask() {

    }
    @NameMethod(name = "Find numbers which are divisible by given number")
    public void getFindNumbersWhichAreDivisibleByGivenNumberTask() {

    }
}
