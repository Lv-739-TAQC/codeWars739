package com.org.ita.kata.implementation.DenisPitsul;

import com.org.ita.kata.Eight;

import java.util.Arrays;

public class EightImpl implements Eight {
    @Override
    public int Liters(double time) {
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        double kpm = (float) (mpg * 1.609344) / 4.54609188;
        return Math.round(kpm * 100.0) / 100.0f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            int number = (int) Math.sqrt(array[i]);
            if(Math.pow(number, 2) == array[i])
                newArray[i] = (int) Math.sqrt(array[i]);
            else
                newArray[i] = (int) Math.pow(array[i], 2);
        }
        return newArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0)
            return new int[] {};

        int[] newArray = new int[2];
        for(int i = 0; i < input.length; i++) {
            if(input[i] > 0)
                newArray[0]++;
            else if(input[i] < 0)
                newArray[1] += input[i];
        }
        return newArray;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(number -> (number % divider) == 0).toArray();
    }
}
