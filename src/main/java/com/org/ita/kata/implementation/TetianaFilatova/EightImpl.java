package com.org.ita.kata.implementation.TetianaFilatova;

import com.org.ita.kata.Eight;
import java.util.ArrayList;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        double liters = time / 2;
        int rLiters = (int)liters;

        return rLiters;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {

        double v = length * width * height;

        return v;
    }

    @Override
    public float mpgToKPM(float mpg) {

        float igToLiter = 4.54609188f;
        float mToKm = 1.609344f;
        float result = mpg * mToKm/igToLiter;

        return Math.round(result*100) / 100.00f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        for(int i = 0; i < array.length; i++){
            double sqrt = Math.sqrt(array[i]);
            int intSqrt = (int)Math.round(sqrt);

            if(sqrt == intSqrt ){
                array[i] = intSqrt;
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {

        int p = 0;
        int n = 0;

        if (input == null){
            int[] emptyArray = {};
            return emptyArray;
        } else if(input.length == 0){
            int[] emptyArray = {};
            return emptyArray;
        }

        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                p++;
            } else if(input[i] < 0) {
                n += input[i];
            }
        }
        int[] array = {p, n};
        return array;
    }

    @Override
    public int stringToNumber(String str) {

        int number = Integer.parseInt(str);

        return number;
    }

    @Override
    public double TwoDecimalPlaces(double number) {

        String x = String.format("%.2f", number);
        double y = Double.parseDouble(x);

        return y;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0) {
                num.add(numbers[i]);
            }
        }

        return num.stream().mapToInt(el -> el).toArray();
    }
}
