package com.org.ita.kata.implementation.savaxn04;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public long[] gap(int g, long m, long n) {
        long firstValue = 0;
        long secondValue = 0;
        for(; m<=n; m++){
            if(isPrime(m)){
                if(firstValue < m){
                    secondValue = m;
                    if(secondValue-firstValue == g){
                        return new long[]{firstValue, secondValue};
                    }
                }
                firstValue = m;
            }
        }
        return null;
    }

    private static boolean isPrime(long number){
        if(number<=1) {
            return false;
        }
        for(long i=2;i<=number/2;i++) {
            if((number%i)==0)
                return  false;
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger temp = BigInteger.valueOf(0);
        BigInteger first = BigInteger.valueOf(2);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger result = BigInteger.valueOf(2);
        for(int i = 1; i < n.intValue(); i++){
            result = result.add(first);
            temp = first;
            first = first.add(second);
            second = temp;
        }
        return result.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solve(double m) {
        return (1 - Math.sqrt(4 * m + 1))/(2 * m) + 1;
    }

    @Override
    public long[] smallest(long n) {
        long min = n;
        int indexFrom = 0;
        int indexTo = 0;
        String number = String.valueOf(n);
        for (int i=0; i<number.length(); i++) {
            for (int j=0; j<number.length(); j++) {
                if (i!=j && makeNewLong(number, i, j) < min) {
                    min = makeNewLong(number, i, j);
                    indexFrom = i;
                    indexTo = j;
                }
            }
        }
        return new long[]{min, indexFrom, indexTo};
    }

    private static long makeNewLong(String s, int i, int j) {
        StringBuilder tempString = new StringBuilder(s);
        char c = tempString.charAt(i);
        tempString.deleteCharAt(i);
        tempString.insert(j, c);
        return Long.parseLong(tempString.toString());
    }
}
