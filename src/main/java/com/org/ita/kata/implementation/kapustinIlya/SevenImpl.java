package com.org.ita.kata.implementation.kapustinIlya;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sumArr = 0.0;
        for (double d : arr) {
            sumArr += d;
        }
        double result = navg * (arr.length + 1) - sumArr;
        if (result <= 0) {
            throw new IllegalArgumentException();
        }
        return (long) Math.ceil(result);
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0) return "0.00";
        int coef = 4;
        double sum = 1;
        for (int i = 0; i < n - 1; i++) {
            sum += 1.0 / (coef + 3 * i);
        }
        return String.format("%.2f", sum);
    }
}
