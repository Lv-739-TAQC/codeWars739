package com.org.ita.kata.implementation.janestadnytska;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        double liters = time * 0.5;
        return (int) liters;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float imperialGallon = 4.54609188f;
        float mile = 1.609344f;
        float kpm = mpg * mile / imperialGallon;
        return (float) (Math.round(kpm * 100)) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else array[i] = (int) Math.pow(array[i], 2);
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int countPositive = 0;
        int sumNegative = 0;
        for (int num : input) {
            if (num > 0) {
                countPositive += 1;
            } else if (num < 0) {
                sumNegative += num;
            }
        }
        return new int[]{countPositive, sumNegative};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return (Math.round(number * 100.00)) / 100.00;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int num : numbers) {
            if (num % divider == 0) {
                count++;
            }
        }
        int k = 0;
        int[] numbersDivided = new int[count];
        for (int num : numbers) {
            if (num % divider == 0) {
                numbersDivided[k] = num;
                k++;
            }
        }
        return numbersDivided;
    }
}

