package com.org.ita.kata.implementation.dzobabohdan;

import com.org.ita.kata.Eight;

import java.text.DecimalFormat;
import java.util.Arrays;

public class EightImpl implements Eight {
    @Override
    public int Liters(double time) {
        return (int) Math.floor(time/2.0);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float kpm = mpg/2.824809363f;
        DecimalFormat df = new DecimalFormat("0.00");
        String result = df.format(kpm);
        return Float.parseFloat(result);
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 != 0) {
                newArray[i] = (int) Math.pow(array[i], 2);
            }
            else  {
                newArray[i] = (int) Math.sqrt(array[i]);
            }
        }
        return newArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        int[] result = new int[]{0, 0};
        for (int num : input) {
            if (num > 0) result[0]++;
            else result[1] += num;
        }
        return result;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        String result = df.format(number);
        return Double.parseDouble(result);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(i -> i % divider == 0).toArray();
    }
}
