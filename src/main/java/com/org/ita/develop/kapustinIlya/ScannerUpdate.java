package com.org.ita.develop.kapustinIlya;

import java.lang.reflect.Parameter;
import java.math.BigInteger;
import java.util.Scanner;

public class ScannerUpdate {

	private static Scanner scanner = new Scanner(System.in);

	public static int chooseMenuPosition(int min, int max) {
		System.out.print("Choose position: ");
		int position = 0;
		String line;
		while (true) {
			line = scanner.nextLine();
			try {
				position = Integer.valueOf(line);
				if (position >= min && position <= max) {
					break;
				} else {
				}
			} catch (NumberFormatException e) {
			}
			System.out.print("You choose wrong position. Try again. ");
		}
		return position;
	}

	public static Object[] inputMethodParametrs(Parameter[] parametrs) {

		Object[] parametrsObject = new Object[parametrs.length];

		for (int i = 0; i < parametrs.length; i++) {
			// parametrs[i].toString() => "int[] arg0" or "String arg1";
			String typeParametrs = parametrs[i].toString().substring(0, parametrs[i].toString().indexOf(" "));

			while (true) {
				try {
					System.out.printf("Input next parametrs(%s): ", typeParametrs);
					String next = scanner.nextLine();
					if (typeParametrs.contains("[]")) {
						String[] values = next.split(" ");
						switch (typeParametrs.substring(0, typeParametrs.indexOf("[]"))) {
						case "int":
							int[] valuesInt = new int[values.length];
							for (int j = 0; j < values.length; j++)
								valuesInt[j] = Integer.parseInt(values[j]);
							parametrsObject[i] = valuesInt;
							break;
						case "float":
							float[] valuesFloat = new float[values.length];
							for (int j = 0; j < values.length; j++)
								valuesFloat[j] = Float.parseFloat(values[j]);
							parametrsObject[i] = valuesFloat;
							break;
						case "double":
							double[] valuesDouble = new double[values.length];
							for (int j = 0; j < values.length; j++)
								valuesDouble[j] = Double.parseDouble(values[j]);
							parametrsObject[i] = valuesDouble;
							break;
						case "java.lang.String":
							parametrsObject[i] = values;
						}
					} else {
						switch (typeParametrs) {
						case "int":
							parametrsObject[i] = Integer.parseInt(next);
							break;
						case "long":
							parametrsObject[i] = Long.parseLong(next);
							break;
						case "float":
							parametrsObject[i] = Float.parseFloat(next);
							break;
						case "double":
							parametrsObject[i] = Double.parseDouble(next);
							break;
						case "java.math.BigInteger":
							parametrsObject[i] = new BigInteger(next);
							break;
						case "java.lang.String":
							parametrsObject[i] = next;
							break;
						}
					}
					break;
				} catch (NumberFormatException e) {
					System.out.print("You choose wrong Parameter. Try again. ");
				}
			}
		}
		return parametrsObject;
	}

}
