package com.org.ita.kata.utils;

import com.org.ita.kata.students.delegator.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class SystemInput {

    public static final String INCORRECT_INT_INPUT = "The required type is [int]";
    public static final String INCORRECT_LONG_INPUT = "The required type is [long]";
    public static final String INCORRECT_DOUBLE_INPUT = "The required type is [double]";
    public static final String INCORRECT_FLOAT_INPUT = "The required type is [float]";
    public static final String INCORRECT_NUMBER_INPUT = "This number is not close to zero";
    public static final String INCORRECT_WARRIOR_INPUT = "This field must starts from 1";
    public static final String STUDENT_NOT_FOUND = "Student not found";
    public static final String FILE_NOT_FOUND = "File not found";
    public static final String INCORRECT_BIGINTEGER_INPUT = "The required type is [BigInteger]";


    public Scanner input;

    public SystemInput() {
        this.input = new Scanner(System.in);
    }

    public Student inputStudent() {
        while (true) {
            System.out.println("Enter student's name : ");
            String name = input.nextLine();
            try {
                return Student.getStudentByName(name);
            } catch (Exception exception){
                System.out.println(STUDENT_NOT_FOUND);
            }
        }
    }

    public int inputIntNumber() {
        int value = 0;
        try {
            value = Integer.parseInt(input.nextLine());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println(INCORRECT_INT_INPUT);
            return inputIntNumber();
        }
        return value;
    }

    public long inputLongNumber() {
        long value = 0;
        try {
            value = Long.parseLong(input.nextLine());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println(INCORRECT_LONG_INPUT);
            return inputLongNumber();
        }
        return value;
    }

    public float inputFloatNumber() {
        float value = 0;
        try {
            value = Float.parseFloat(input.nextLine());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println(INCORRECT_FLOAT_INPUT);
            return inputFloatNumber();
        }
        return value;
    }

    public double inputDoubleNumber() {
        double value = 0;
        try {
            value = Double.parseDouble(input.nextLine());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println(INCORRECT_DOUBLE_INPUT);
            return inputDoubleNumber();
        }
        return value;
    }

    public double inputNearZeroNumber() {
        while (true) {
            double number = inputDoubleNumber();
            if (number > 0 && number < 1) {
                return number;
            } else {
                System.out.println(INCORRECT_NUMBER_INPUT);
            }
        }
    }

    public int inputCorrectData() {
        while (true) {
            int level = inputIntNumber();
            if (level >= 1) {
                return level;
            } else {
                System.out.println(INCORRECT_WARRIOR_INPUT);
            }
        }
    }

    public int[] inputIntArray() {
        System.out.println("Enter array length: ");
        int arrayLength = inputIntNumber();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(i + ": ");
            array[i] = inputIntNumber();
        }
        return array;
    }

    public double[] inputDoubleArray() {
        System.out.println("Enter array length: ");
        int arrayLength = inputIntNumber();
        double[] array = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(i + ": ");
            array[i] = inputDoubleNumber();
        }
        return array;
    }

    public String readFromFile() {
        while (true) {
            System.out.println("Enter path to file:");
            try (BufferedReader br = new BufferedReader(new FileReader(input.nextLine()))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                return sb.toString();
            } catch (IOException e) {
                System.out.println(FILE_NOT_FOUND);
            }
        }
    }

    public BigInteger inputBigInteger() {
        BigInteger value;
        try {
            value = BigInteger.valueOf(Long.parseLong(input.nextLine()));
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println(INCORRECT_BIGINTEGER_INPUT);
            return inputBigInteger();
        }
        return value;
    }


    public String inputNumber() {
        String str;
        try {
            str = input.nextLine();
            Integer.parseInt(str);
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println(INCORRECT_INT_INPUT);
            return inputNumber();
        }
        return str;
    }

    public String[] inputString() {
        return input.nextLine().split("\\s");
    }
}
