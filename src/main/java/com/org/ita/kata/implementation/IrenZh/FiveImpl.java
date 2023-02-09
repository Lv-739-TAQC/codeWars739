package com.org.ita.kata.implementation.IrenZh;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i <= number / 2; i++) {
            if ((number % i) == 0)
                return false;
        }
        return true;
    }

    public static long making(String s, int i, int j) {
        StringBuilder sb = new StringBuilder(s);
        char c = sb.charAt(i);
        sb.deleteCharAt(i);
        sb.insert(j, c);

        return Long.valueOf(sb.toString());
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long firstValue = 0;
        long secondValue = 0;
        for (; m <= n; m++) {
            if (isPrime(m)) {
                if (firstValue < m) {
                    secondValue = m;
                    if (secondValue - firstValue == g) {
                        return new long[]{firstValue, secondValue};
                    }
                }
                firstValue = m;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }
        return res;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        if (m == 0) {
            return 0;
        }
        double sqrt = Math.sqrt(4 * m + 1);
        double num = 1 - sqrt + (2 * m);
        return num / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        long min = n;
        int index1 = 0;
        int index2 = 0;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                if (i != j && making(number, i, j) < min) {
                    min = making(number, i, j);
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return new long[]{min, index1, index2};
    }
}
