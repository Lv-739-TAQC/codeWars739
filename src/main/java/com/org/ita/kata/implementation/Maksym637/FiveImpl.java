package com.org.ita.kata.implementation.Maksym637;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static long[] deleteZeros(long[] array) {
        int targetIndex = 0;
        for (int sourceIndex = 0; sourceIndex < array.length; sourceIndex++) {
            if (array[sourceIndex] != 0)
                array[targetIndex++] = array[sourceIndex];
        }
        long[] newArray = new long[targetIndex];
        System.arraycopy(array, 0, newArray, 0, targetIndex);
        return newArray;
    }

    public static long convertIntoLongNumber(int i, int j, String number) {
        String newNumber = number.substring(0, i) + number.substring(i + 1);
        StringBuilder subString = new StringBuilder(newNumber);
        subString.insert(j, number.charAt(i));
        return Long.parseLong(subString.toString());
    }

    @Override
    public long[] gap(int g, long m, long n) {
        int sizePrimeNumbers = (int) (n - m), sizeResultNumbers = 2;
        int i = (int) m, mMod = (int) m, j = 0;

        long[] primeNumbersWithZeros = new long[sizePrimeNumbers];
        long[] result = new long[sizeResultNumbers];

        while (i < n) {
            if (isPrime(i)) {
                primeNumbersWithZeros[i - mMod] = i;
            }
            i += 1;
        }

        long[] primeNumbers = deleteZeros(primeNumbersWithZeros);

        while (j < primeNumbers.length - 1) {
            if ((primeNumbers[j + 1] - primeNumbers[j]) == g) {
                result[0] = primeNumbers[j];
                result[1] = primeNumbers[j + 1];
                break;
            }
            j += 1;
        }

        if (result[0] == result[1]) {
            return null;
        }

        return result;
    }

    @Override
    public int zeros(int n) {
        if (n < 0) {
            return -1;
        }

        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {

        BigInteger a, b = BigInteger.ONE, c = BigInteger.ONE, sum = BigInteger.ZERO;

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

        /*
        Function : U(n, x) = x + 2x**2 + 3x**3 + ... + nx**n, where |x| < 1;

        We have to find sum of this function S(x) :
        S(x) - x*S(x) = x + x**2 + x**3 + ... + x**n;
        S(x) = x / (1 - x)**2;

        After that we have to find x, where S(x) = m:
        m*x**2 - (2m + 1)*x + m = 0; | a*x**2 + b*x + c = 0;
         */

        double a = m, b = (2 * m + 1), D = 4 * m + 1;
        return (b - Math.sqrt(D)) / (2 * a);
    }

    @Override
    public long[] smallest(long n) {
        String stringNumber = String.valueOf(n);
        long resultNumber = n, tempNumber;
        int iSmallest = 0, jInsert = 0, numberLength = stringNumber.length();

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
}
