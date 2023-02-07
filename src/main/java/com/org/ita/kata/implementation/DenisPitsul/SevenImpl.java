package com.org.ita.kata.implementation.DenisPitsul;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double nextDonation = (arr.length + 1) * navg;
        for (double v : arr) {
            nextDonation -= v;
        }
        if (nextDonation <= 0) throw new IllegalArgumentException();
        return (long) Math.ceil(nextDonation);
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        int divider = 1;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / divider;
            divider += 3;
        }
        sum = Math.round(sum * 100.0) / 100.0;
        return String.format("%.2f", sum);
    }
}
