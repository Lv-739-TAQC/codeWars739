package com.org.ita.kata.implementation.AnnaMatviienko;

import com.org.ita.kata.Eight;

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
        final double gallon = 4.54609188;
        final double mile = 1.609344;
        double res = (mpg * mile) / gallon;
        return (float) Math.round(res * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int positives = 0;
        int negatives = 0;
        int[] output = new int[2];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                positives++;
            } else {
                negatives += input[i];
            }
        }
        output[0] = positives;
        output[1] = negatives;
        return output;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return (double) Math.round(number * 100) / 100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }

        int[] divisible = new int[count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                divisible[j++] = numbers[i];
            }
        }
        return divisible;
    }
}
