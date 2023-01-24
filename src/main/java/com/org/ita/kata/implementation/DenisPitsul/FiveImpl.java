package com.org.ita.kata.implementation.DenisPitsul;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;
            }
        }
        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int numOfZeroes=0;
        while(n!= 0){
            numOfZeroes += (int)Math.floor(n/5);
            n/=5;
        }
        return numOfZeroes;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger[] fib = new BigInteger[n.intValue()+1];
        for (int i = 0; i <= n.intValue(); i++) {
            if (i == 0 || i == 1) {
                fib[i]=BigInteger.valueOf(1);
            } else {
                fib[i]=((fib[i - 1]).add(fib[i - 2]));
            }
        }

        BigInteger sum=BigInteger.valueOf(0);
        for(BigInteger e:fib) {
            sum=sum.add(e);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        double a = m;
        double b = 2 * m + 1;
        double D = 4 * m + 1;
        return (b - Math.sqrt(D)) / (2 * a);
    }

    @Override
    public long[] smallest(long n) {
        String stringNumber = String.valueOf(n);
        long resultNumber = n, tempNumber;
        int iSmallest = 0;
        int jInsert = 0;
        int numberLength = stringNumber.length();

        for (int i = 0; i < numberLength; i++) {
            for (int j = 0; j < numberLength; j++) {
                if (i == j) {
                    continue;
                }
                tempNumber = convertIntoLongNumber(i, j, stringNumber);
                if (tempNumber < resultNumber) {
                    resultNumber = tempNumber;
                    iSmallest = i;
                    jInsert = j;
                }
            }
        }
        return new long[]{resultNumber, iSmallest, jInsert};
    }

    public static long convertIntoLongNumber(int i, int j, String number) {
        String newNumber = number.substring(0, i) + number.substring(i + 1);
        StringBuilder subString = new StringBuilder(newNumber);
        subString.insert(j, number.charAt(i));
        return Long.parseLong(subString.toString());
    }
}
