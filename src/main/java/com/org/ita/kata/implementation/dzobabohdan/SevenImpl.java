package com.org.ita.kata.implementation.dzobabohdan;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        long result = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (result <= 0) throw new IllegalArgumentException();
        return result;
    }

    @Override
    public String seriesSum(int n) {
        if(n == 0) return "0.00";

        double res = 0;
        int count = 0;

        do {
            count++;
            res += 1.0/((count*3.0) - 2.0);
        } while(count != n);

        return String.format("%.2f",res);
    }
}
