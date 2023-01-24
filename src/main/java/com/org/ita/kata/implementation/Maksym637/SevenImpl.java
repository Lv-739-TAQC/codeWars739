package com.org.ita.kata.implementation.Maksym637;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0, count = arr.length + 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long resultOfCounting = (long) Math.ceil(navg * count - sum);
        if (resultOfCounting <= 0) {
            throw new IllegalArgumentException();
        }
        return resultOfCounting;
    }

    @Override
    public String seriesSum(int n) {
        int counter = 1;
        double init = 4;
        double result = 1;
        while (counter < n) {
            result += 1 / init;
            init += 3;
            counter += 1;
        }
        return String.format("%.2f", result);
    }
}
