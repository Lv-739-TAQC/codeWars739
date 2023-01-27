package com.org.ita.kata.implementation.kapustinIlya;

import java.util.ArrayList;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
	@Override
	public int Liters(double time) {
		return (int) (Math.floor(time) * 0.5);
	}

	@Override
	public double getVolumeOfCuboid(double length, double width, double height) {
		if (length < 0.0 || width < 0.0 || height < 0.0) {
			throw new RuntimeException();
		}
		return length * width * height;
	}

	@Override
	public float mpgToKPM(float mpg) {
		return 0;
	}

	@Override
	public int[] squareOrSquareRoot(int[] array) {
		return new int[0];
	}

	@Override
	public int[] countPositivesSumNegatives(int[] input) {
		return new int[0];
	}

	@Override
	public int stringToNumber(String str) {
		return 0;
	}

	@Override
	public double TwoDecimalPlaces(double number) {
		return 0;
	}

	@Override
	public int[] divisibleBy(int[] numbers, int divider) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
	    for (int i : numbers){
	      if (i % divider == 0){
	    	  resultList.add(i);
	      }
	    }
	    int[] result = new int[resultList.size()];
	    for (int i = 0; i < resultList.size(); i++) {
	    	result[i] = resultList.get(i);
	    }
	    return result;
	}
}
