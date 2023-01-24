package com.org.ita.kata.implementation.savaxn04;

import com.org.ita.kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double number = navg * (arr.length+1);
        double sum = Arrays.stream(arr).sum();
        if(number - sum <= 0){
            throw new IllegalArgumentException("--- Exception 1 ---");
        }
        return (long)Math.ceil(number - sum);
    }

    @Override
    public String seriesSum(int n) {
        if(n == 0){
            return "0.00";
        }
        double result = 1;
        for(int i = 1; i < n; i++){
            result += 1.0/(3.0*i+1.0);
        }
        String str = String.valueOf(Math.round(result * 100.0) / 100.0);
        if(str.length() == 3){
            return str + "0";
        }
        return str;
    }
}
