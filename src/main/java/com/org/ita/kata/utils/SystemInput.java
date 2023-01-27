package com.org.ita.kata.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.org.ita.kata.utils.Constant.ErrorMessages.INCORRECT_DOUBLE_INPUT;
import static com.org.ita.kata.utils.Constant.ErrorMessages.INCORRECT_INT_INPUT;
import static com.org.ita.kata.utils.Constant.ErrorMessages.FILE_NOT_FOUND;

public class SystemInput {
    public static final Scanner input = new Scanner(System.in);

    public static int inputIntNumber() {
        int value = 0;
        while (true) {
            try {
                value = Integer.parseInt(input.nextLine());
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(INCORRECT_INT_INPUT);
                return inputIntNumber();
            }
        }
        return value;
    }

    public static double inputDoubleNumber() {
        double value = 0;
        while (true) {
            try {
                value = Double.parseDouble(input.nextLine());
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(INCORRECT_DOUBLE_INPUT);
                return inputDoubleNumber();
            }
        }
        return value;
    }

    public static int[] inputIntArray() {
        System.out.println("Enter array length: ");
        int arrayLength = inputIntNumber();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(i + ": ");
            array[i] = inputIntNumber();
        }
        return array;
    }

    public static double[] inputDoubleArray() {
        System.out.println("Enter array length: ");
        int arrayLength = inputIntNumber();
        double[] array = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(i + ": ");
            array[i] = inputDoubleNumber();
        }
        return array;
    }

    public static String readFromFile() {
        while (true) {
            System.out.println("Enter path to file:");
            try (BufferedReader br = new BufferedReader(new FileReader(input.nextLine()));) {
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
}
