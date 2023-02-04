package com.org.ita.kata.implementation.dzobabohdan;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Gap in Primes
    @Override
    public long[] gap(int g, long m, long n) {
        ArrayList<Long> primes = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        for (int i = 0; i < primes.size() - 1; i++) {
            if (primes.get(i + 1) - primes.get(i) == g) {
                return new long[]{primes.get(i), primes.get(i + 1)};
            }
        }

        return null;
    }

    //Number of trailing zeros of N!
    @Override
    public int zeros(int n) {
        if (n == 0) return 0;
        int zeros = 0;
        int divisor = 5;
        while (n / divisor > 0) {
            zeros += n / divisor;
            divisor *= 5;
        }
        return zeros;
    }

    //Perimeter of squares in a rectangle
    @Override
    public BigInteger perimeter(BigInteger n) {
        if (n.intValue() == 0) return BigInteger.valueOf(1);
        if (n.intValue() == 0) return BigInteger.valueOf(1);
        if (n.intValue() == 1) return BigInteger.valueOf(2);
        List<BigInteger> cubes = new ArrayList<>();
        cubes.add(BigInteger.valueOf(1));
        cubes.add(BigInteger.valueOf(1));

        BigInteger result = BigInteger.valueOf(0);

        for (int i = 2; i < n.intValue() + 1; i++) {
            cubes.add(cubes.get(i - 1).add(cubes.get(i - 2)));
        }

        for (BigInteger bi : cubes) {
            result = result.add(bi);
        }

        return result.multiply(BigInteger.valueOf(4));
    }

    //Which x for that sum?
    @Override
    public double solve(double m) {
        double a = 2 * m + 1;
        double b = 4 * m + 1;
        return (a - Math.sqrt(b)) / (2 * m);
    }

    //Find the smallest
    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
