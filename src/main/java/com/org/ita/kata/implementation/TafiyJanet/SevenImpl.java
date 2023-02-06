package com.org.ita.kata.implementation.TafiyJanet;

import com.org.ita.kata.Seven;

import java.text.DecimalFormat;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double number : arr) {
            sum += number;
        }
        long donation = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (donation <= 0) {
            throw new IllegalArgumentException();
        }
        return donation;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + i * 3);
        }
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(sum);
    }
}
