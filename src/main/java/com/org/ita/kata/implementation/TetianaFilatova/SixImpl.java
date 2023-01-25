package com.org.ita.kata.implementation.TetianaFilatova;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
            long i = 1;
            long sum = 0;
            long n = 0;

            do{
                sum += (long)Math.pow(i, 3);
                i++;
            } while (sum < m);

            if (sum == m){
                n = i - 1;
            } else if (sum > m){
                n = -1;
            }

            return n;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
