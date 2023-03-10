package com.org.ita.kata.implementation.TetianaFilatova;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    private static boolean isPrime(long k) {
        for (int i = 2; i < (k / 2); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long bonus = 0;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (i - bonus == g) {
                    return new long[]{bonus, i};
                }
                bonus = i;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {

        int zeroes = 0;
        int number = 5;
        while (number < n) {
            zeroes += n / number;
            number *= 5;
        }
        return zeroes;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {

        BigInteger X = BigInteger.valueOf(0);
        BigInteger Y = BigInteger.valueOf(1);
        BigInteger Z = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i <= n.intValue(); i++) {
            X = Y;
            Y = Z;
            Z = X.add(Y);
            sum = sum.add(X);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        double b = -2 * m - 1;
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * m * m)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        long min = n;
        int indexGet = 0;
        int indexPut = 0;
        String numberString = String.valueOf(n);

        for (int i = 0; i < numberString.length(); i++) {
            for (int j = 0; j < numberString.length(); j++) {
                StringBuffer sb = new StringBuffer(numberString);
                char c = sb.charAt(i);
                sb.deleteCharAt(i);
                sb.insert(j, c);
                Long newNumber = Long.valueOf(sb.toString());

                if (i != j && newNumber < min) {
                    min = newNumber;
                    indexGet = i;
                    indexPut = j;
                }
            }
        }
        return new long[]{min, indexGet, indexPut};
    }
}
