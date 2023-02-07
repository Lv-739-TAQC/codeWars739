package com.org.ita.kata.implementation.janestadnytska;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double nAvg) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        long result = (long) Math.ceil(nAvg * (arr.length + 1) - sum);
        if (result <= 0) {
            throw new IllegalArgumentException();
        } else return result;
    }

    @Override
    public String seriesSum(int n) {
        Double sum = 0.00;
        if (n == 0) {
            return String.valueOf(sum);
        } else {
            for (int i = 0; i < n; i++) {
                sum += (double) 1 / ((double) 1 + i * (double) 3);
            }
            return String.format("%.2f", sum);
        }
    }
}
