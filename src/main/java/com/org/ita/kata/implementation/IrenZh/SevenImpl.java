package com.org.ita.kata.implementation.IrenZh;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double number : arr) {
            sum += number;
        }
        long res = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (res <= 0)
            throw new IllegalArgumentException();
        else
            return res;
    }


    @Override
    public String seriesSum(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);
        return String.format("%.2f", sum);
    }

}

