package com.org.ita.kata.implementation.Maksym637;

import com.org.ita.kata.Eight;

import java.util.Arrays;

public class EightImpl implements Eight {
    @Override
    public int Liters(double time) {
        double liters = 0.5;
        return (int) Math.floor(time * liters);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        float result = (mpg * mile) / gallon;
        return (float) Math.round(result * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] newArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (isSquareInteger(array[i])) {
                newArr[i] = (int) Math.sqrt(array[i]);
            } else {
                newArr[i] = array[i] * array[i];
            }
        }
        return newArr;
    }

    static boolean isSquareInteger(double x) {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] emptyArray = {};
        if (input == null || input.length == 0) {
            return emptyArray;
        }
        int count = 0;
        int sum = 0;
        for (int j : input) {
            if (j > 0) {
                count++;
            } else if (j < 0) {
                sum += j;
            }
        }
        return new int[]{count, sum};
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
