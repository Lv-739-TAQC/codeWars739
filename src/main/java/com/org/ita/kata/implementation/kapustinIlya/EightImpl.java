package com.org.ita.kata.implementation.kapustinIlya;

import java.util.ArrayList;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {

	@Override
	public int liters(double time) {
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
		return (float) Math.round(mpg/4.54609188f*1.609344f*100)/100f;  
	}

	@Override
	public int[] squareOrSquareRoot(int[] array) {
		if (array == null) {
			   throw new RuntimeException();
			}  
			for (int i = 0; i < array.length; i++) {
				if (array[i] < 0) {
					continue;
				}
				double sqrt = Math.sqrt(array[i]);
				if (Math.round(sqrt) == sqrt) {
					array[i] = (int) sqrt;
				} else {
					array[i] = array[i]*array[i]; 
				}
			}
		    return array;
	}

	@Override
	public int[] countPositivesSumNegatives(int[] input) {
		if (input == null || input.length == 0 ) {
			return new int[]{};
		}
		int countPositive = 0;
		int sumNegative = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				countPositive ++;
			} else if (input[i] < 0) {
				sumNegative +=input[i];
			}
		}
		return new int[] {countPositive,sumNegative};
	}

	@Override
	public int stringToNumber(String str) {
		return Integer.parseInt(str);
	}

	@Override
	public double TwoDecimalPlaces(double number) {
		return (double) Math.round(number*100.0)/100.0;
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
