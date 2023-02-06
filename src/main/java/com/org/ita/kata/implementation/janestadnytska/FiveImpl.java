package com.org.ita.kata.implementation.janestadnytska;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    // if we find a prime, check if the number after the gap is also a prime
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
        BigInteger X;
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
        if (m == 0) {
            return 0;
        }
        //S=x+2x**2+3x**3+4x**4+... Multiplying by x both sides:
        //xS=x**2+2x*3+3x**4+... Subtracting both the equations:
        //S(1-x)=x+x**2+x**3+x**4+...
        //S(1-x)=x/(1-x) applying sum of GP for ∞ terms:
        //S=x/(1-x)**2
        double sqrt = Math.sqrt(4 * m + 1);
        double num = 1 - sqrt + (2 * m);
        return num / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        String number = Long.toString(n);
        long[] arr = new long[3];
        arr[0] = n;
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                //  remove the digit at index i
                String checkTwoNumbers = number.substring(i, i + 1);
                String temp1 = number.substring(0, i) + number.substring(i + 1);
                // then insert it at index j
                String temp2 = temp1.substring(0, j) + checkTwoNumbers + temp1.substring(j);
                if (Long.parseLong(temp2) < arr[0]) {
                    arr[0] = Long.parseLong(temp2);
                    arr[1] = i;
                    arr[2] = j;
                }
            }
        }
        return arr;
    }
}
