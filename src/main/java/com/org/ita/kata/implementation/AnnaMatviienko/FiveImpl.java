package com.org.ita.kata.implementation.AnnaMatviienko;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FiveImpl implements Five {
    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        HashMap<BigInteger, BigInteger> fibonachyList = new HashMap<>();
        BigInteger zero = BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.TWO;
        fibonachyList.put(zero, zero);
        fibonachyList.put(one, one);
        for (BigInteger i = two; i.compareTo(n.add(one)) <= 0; i = i.add(one)) {
            fibonachyList.put(i, (fibonachyList.get(i.subtract(one)).add(fibonachyList.get(i.subtract(two)))));
        }
        BigInteger sumOfPerimeters = zero;
        for (Map.Entry<BigInteger, BigInteger> entry : fibonachyList.entrySet()) {
            sumOfPerimeters = sumOfPerimeters.add(entry.getValue());
        }
        return sumOfPerimeters.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        double x = -2 * m - 1;
        return (-x - Math.sqrt(Math.pow(x, 2) - 4 * m * m)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
