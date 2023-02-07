package com.org.ita.kata.implementation.kapustinIlya;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
	@Override
	public long[] gap(int g, long m, long n) {
		long first = -1;
		for (long i = m; i <= n; i++) {
			long j = 2;
			for (; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (first != -1 && i == j && (j - first) == g) {
				return new long[] { first, j };
			} else if (i == j && (j - first) != g) {
				first = j;
			}
		}

		return null;
	}

	@Override
	public int zeros(int n) {
		int[] decimal = { 5, 25, 125, 625, 3125, 15625, 78125, 390625, 1953125, 9765625, 48828125, 244140625 };
		int result = 0;
		for (int i = 0; i <= 11; i++) {
			result = result + n / decimal[i];
		}
		return result;
	}

	@Override
	public BigInteger perimeter(BigInteger n) {
		BigInteger sum = new BigInteger("2");
		BigInteger n0 = new BigInteger("1");
		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("2");
		BigInteger i = new BigInteger("2");
		while (i.compareTo(n) <= 0) {
			i = i.add(new BigInteger("1"));
			// System.out.println(n2);
			n2 = n1.add(n0);
			sum = sum.add(n2);
			n0 = n1;
			n1 = n2;
		}
		return sum.multiply(new BigInteger("4"));
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
		return new long[] { min, indexGet, indexPut };
	}
}
