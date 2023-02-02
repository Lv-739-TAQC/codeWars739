package com.org.ita.kata.implementation.TafiyJanet;

import com.org.ita.kata.Eight;

import java.util.Arrays;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        double litre = 0.5;
        return (int) Math.floor(time * litre);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new ArithmeticException("Cannot calculate volume with negative number or 0");
        }
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float kpm = mpg * 1.609344f / 4.54609188f;
        return (float) Math.round(kpm * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(x -> {
                    double sqrt = Math.sqrt(x);
                    if (sqrt == Math.floor(sqrt)) {
                        return (int) sqrt;
                    } else {
                        return x * x;
                    }
                })
                .toArray();
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int posNums = 0;
        int negNums = 0;
        for (int i : input) {
            if (i > 0) {
                posNums++;
            } else if (i < 0) {
                negNums += i;
            }
        }
        return new int[]{posNums, negNums};
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
        return Arrays.stream(numbers).filter(x -> x % divider == 0).toArray();
    }
}
