package com.org.ita.kata.implementation.TetianaFilatova;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {

        double sum = 0;
        double newDon = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / (arr.length + 1);
        }
        newDon = (navg - sum) * (arr.length + 1);

        if (newDon <= 0) {
            throw new IllegalArgumentException();
        }
        return (long) Math.ceil(newDon);
    }

    @Override
    public String seriesSum(int n) {

        Double sum = 0.00;
        String sSum = String.valueOf(sum);

        if (n == 0) {
            return sSum;
        } else {
            for (Integer i = 0; i < n; i++) {
                sum += Double.valueOf(1) / Double.valueOf(1 + i * 3);
            }
            return String.format("%.2f", sum);
        }
    }
}
