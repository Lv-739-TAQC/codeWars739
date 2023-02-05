package com.org.ita.kata.implementation.AnnaMatviienko;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        int n = arr.length + 1;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double donation = navg * n - sum;
        if (donation < 0) {
            throw new IllegalArgumentException();
        }
        return (long) (Math.ceil(donation));
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.00;
        if (n == 0) {
            return String.valueOf(sum);
        } else {
            for (int i = 0; i < n; i++) {
                sum += 1d / (double) (1 + i * 3);
            }
            return String.format("%.2f", sum);
        }
    }
}
