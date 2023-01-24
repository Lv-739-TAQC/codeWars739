package com.org.ita.kata.implementation.savaxn04;

import com.org.ita.kata.Eight;

import java.util.Arrays;

public class EightImpl implements Eight {
    @Override
    public int Liters(double time) {
        return (int)(time/2);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return Math.round((mpg/2.8248105315f)*100.0f)/100.0f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] resultArray = new int[array.length];
        for(int i = 0; i < resultArray.length; i++){
            if(Math.sqrt(array[i]) == (int)(Math.sqrt(array[i]))){
                resultArray[i] = (int)Math.sqrt(array[i]);
            } else {
                resultArray[i] = (int)Math.pow(array[i],2);
            }
        }
        return resultArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if(input == null || input.length == 0){
            int[] nullArray = new int[0];
            return nullArray;
        }
        int[] resultArray = new int[2];
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                resultArray[0]++;
            } else{
                resultArray[1] += input[i];
            }
        }
        return resultArray;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.valueOf(str);
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return Math.round(number*100.f)/100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(n -> n % divider == 0).toArray();
    }
}
