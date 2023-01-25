package com.org.ita.kata.implementation.TafiyJanet;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public long[] gap(int g, long m, long n) {
        boolean primeFound = false;
        long lastPrime = 0;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (primeFound) {
                    if (i - lastPrime == g) {
                        return new long[]{lastPrime, i};
                    }
                } else {
                    primeFound = true;
                }
                lastPrime = i;
            }
        }
        return null;
    }

    private static boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c;
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i <= n.intValue(); i++) {
            c = a.add(b);
            sum = sum.add(a.multiply(BigInteger.valueOf(4)));
            a = b;
            b = c;
        }
        return sum;
    }

    @Override
    public double solve(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        String num = Long.toString(n);
        long smallestNum = n;
        int removeIndex = -1;
        int insertIndex = -1;

        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                if (i == j) {
                    continue;
                }
                StringBuilder newNum = new StringBuilder();
                newNum.append(num.substring(0, i));
                newNum.append(num.substring(i + 1));
                newNum.insert(j, num.charAt(i));
                long newLong = Long.parseLong(newNum.toString());
                if (newLong < smallestNum) {
                    smallestNum = newLong;
                    removeIndex = i;
                    insertIndex = j;
                }
            }
        }
        return new long[]{smallestNum, removeIndex, insertIndex};
    }
}
