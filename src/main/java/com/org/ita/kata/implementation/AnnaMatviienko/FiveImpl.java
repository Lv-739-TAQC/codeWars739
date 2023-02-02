package com.org.ita.kata.implementation.AnnaMatviienko;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.*;

public class FiveImpl implements Five {
    @Override
    public long[] gap(int g, long m, long n) {
        long[] primeGap = generator(m, n);
        for (int i = 0; i < primeGap.length - 1; i++) {
            if (primeGap[i] >= m && primeGap[i] == primeGap[i + 1] - g) {
                return Arrays.copyOfRange(primeGap, i, i + 2);
            }
        }
        return null;
    }

    private static long[] generator(long m, long n) {
        long[] primes = new long[(int) (n - m)];
        int numPrimes = 0;
        boolean prime;
        for (int i = (int) m; i < (int) n; i++) {
            prime = true;
            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                primes[numPrimes] = (long) i;
                numPrimes++;
            }
        }
        return Arrays.copyOfRange(primes, 0, numPrimes);
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

    public static ArrayList<Long> convertToList(long n) {
        ArrayList<Long> number = new ArrayList<>();
        do {
            number.add(0, n % 10);
            n = n / 10;
        } while (n != 0);
        return number;
    }

    public static long[] smallestFromList(ArrayList<Long> list) {
        long[] result = new long[3];
        Long move = Collections.min(list);
        String str = "";
        int startIndex = 0;
        int endIndex = 0;
        if (move == list.get(0)) {
            list.remove(0);
            result = smallestFromList(list);
            ArrayList<Long> temp = convertToList(result[0]);
            result[1]++;
            if (move != temp.get((int) result[2]))
                result[2]++;
            result[0] = Long.valueOf(move.toString() + result[0]);
            return result;
        } else if (move == list.get(1)) {
            startIndex = 0;
            endIndex = 1;
            endIndex = getEndIndex(list, endIndex);
            boolean moveFromEnd = false;
            boolean foundFromEnd = false;
            if (endIndex < list.size() - 1)
                moveFromEnd = ((list.get(0) <= list.get(endIndex + 1)) && ((endIndex - startIndex) == 1)) ||
                        (list.get(0) == list.get(2));
            if (moveFromEnd) {
                for (int i = list.size() - 1; i > endIndex; i--) {
                    if (move == list.get(i)) {
                        endIndex = i;
                        while (move == list.get(endIndex - 1)) {
                            endIndex--;
                        }
                        startIndex = 0;
                        foundFromEnd = true;
                        break;
                    }
                }
            }
            if (moveFromEnd && foundFromEnd) {
                int tempInd = startIndex;
                startIndex = endIndex;
                endIndex = tempInd;
            } else {
                move = list.get(0);
            }
            list.remove(startIndex);
            list.add(endIndex, move);
        } else {
            for (int i = list.size() - 1; i > 1; i--) {
                if (move == list.get(i)) {
                    startIndex = i;
                    while (move == list.get(startIndex - 1)) {
                        startIndex--;
                    }
                    endIndex = 0;
                    list.remove(startIndex);
                    list.add(endIndex, move);
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            str = sb.toString();
        }
        result[0] = Long.valueOf(str);
        result[1] = Long.valueOf(startIndex);
        result[2] = Long.valueOf(endIndex);
        return result;
    }

    private static int getEndIndex(ArrayList<Long> list, int endIndex) {
        while ((endIndex + 1 < list.size()) && (list.get(0) >= list.get(endIndex + 1))) {
            if ((list.get(0) == list.get(endIndex + 1)) && ((endIndex + 2) < list.size())) {
                if (list.get(0) < list.get(endIndex + 2)) {
                    return endIndex;
                } else {
                    endIndex++;
                }
            } else {
                endIndex++;
            }
        }
        return endIndex;
    }

    @Override
    public long[] smallest(long n) {
        return smallestFromList(convertToList(n));
    }
}
