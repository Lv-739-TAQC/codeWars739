package com.org.ita.develop.kapustinIlya;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {

	public static void mainPage() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		System.out.println("1. List student");
		System.out.println("2. List level");
		System.out.println("0. Exit");
		int position = choosePosition(0, 2);
		switch (position) {
		case 2:
			levelPage();
			break;
		}
		System.out.println("/// Goodbya!!! ///");
	}

	private static void levelPage() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		List<String> levels = Controller.getLevels("src/main/java/com/org/ita/kata");
		// Collections.sort(levels);
		System.out.println("/// Levels: ///");
		for (int i = 0; i < levels.size(); i++) {
			System.out.printf("%d: %s\n", i + 1, levels.get(i));
		}
		System.out.println("0. Exit");
		System.out.println("-1. Main Page");
		int position = choosePosition(-1, levels.size());
		if (position > 0) {
			methodsPage(levels.get(position - 1).substring(0, levels.get(position - 1).indexOf(".")));
		} else if (position == -1) {
			mainPage();
		}

	}

	private static void methodsPage(String className)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		List<Method> methods = Controller.getNameMethods(className);

		System.out.println("/// Methods: ///");

		for (int i = 0; i < methods.size(); i++) {
			System.out.printf("%d: %s\n", i + 1, methods.get(i).getName());
		}

		System.out.println("0. Exit");
		System.out.println("-1. Level page");

		int position = choosePosition(-1, methods.size());
		if (position > 0) {
			implemPage(methods.get(position - 1), className);
		} else if (position == -1) {
			levelPage();
		}
	}

	private static void implemPage(Method method, String className)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		List<String> implems = Controller.getImplementation("src/main/java/com/org/ita/kata/implementation");

		System.out.println("///Implementation page: ///");

		for (int i = 0; i < implems.size(); i++) {
			System.out.printf("%d: %s\n", i + 1, implems.get(i));
		}

		System.out.println("0. Exit");
		System.out.println("-1. Methods page");

		int position = choosePosition(-1, implems.size());
		if (position > 0) {
			invokeMethodPage(method, className, implems.get(position - 1));
		} else if (position == -1) {
			methodsPage(className);
		}
	}

	private static void invokeMethodPage(Method method, String className, String implemPerson)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		System.out.printf("/// Invoke methods:\"%s\" by %s: ///\n", method.getName(), implemPerson);

		Object ourClass = Class.forName("com.org.ita.kata.implementation." + implemPerson + "." + className + "Impl")
				.getConstructor().newInstance();
		Parameter[] parametrs = method.getParameters();
		Object[] parametrsObject = new Object[parametrs.length];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < parametrs.length; i++) {
			String typeParametrs = parametrs[i].toString().substring(0, parametrs[i].toString().indexOf(" "));
			System.out.printf("Input next parametrs(%s): ", typeParametrs);
			String next = sc.nextLine();
			if (typeParametrs.contains("[]")) {
				String[] values = next.split(" ");
				switch (typeParametrs.substring(0, typeParametrs.indexOf("[]"))) {
					case "int":
						int[] valuesInt = new int[values.length];
						for (int j = 0; j < values.length; j++ ) {
							valuesInt[j] = Integer.parseInt(values[j]);
						}
						parametrsObject[i] = valuesInt;
						break;
					case "float":
						float[] valuesFloat = new float[values.length];
						for (int j = 0; j < values.length; j++ ) {
							valuesFloat[j] = Float.parseFloat(values[j]);
						}
						parametrsObject[i] = valuesFloat;
						break;
					case "double":
						double[] valuesDouble = new double[values.length];
						for (int j = 0; j < values.length; j++ ) {
							valuesDouble[j] = Double.parseDouble(values[j]);
						}
						parametrsObject[i] = valuesDouble;
						break;
					case "java.lang.String":
						parametrsObject[i] = values;
						break;
				}
				continue;
			}
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
		
		String typeReturnType = method.getReturnType().getSimpleName();
		if (typeReturnType.contains("[]")) {
			switch (typeReturnType.substring(0,typeReturnType.indexOf("[]"))) {
			case "int":
				System.out.println(Arrays.toString((int[]) method.invoke(ourClass, parametrsObject)));
				break;
			case "long":
				System.out.println(Arrays.toString((long[]) method.invoke(ourClass, parametrsObject)));
				break;
			case "float":
				System.out.println(Arrays.toString((float[]) method.invoke(ourClass, parametrsObject)));
				break;
			case "double":
				System.out.println(Arrays.toString((double[]) method.invoke(ourClass, parametrsObject)));
				break;
			case "String":
				System.out.println(Arrays.toString((String[]) method.invoke(ourClass, parametrsObject)));
				break;
			}
		} else {
			System.out.println(method.invoke(ourClass, parametrsObject));
		}
	
	}

	private static int choosePosition(int min, int max) {
		System.out.print("\nChoose position: ");
		int position = 0;
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt() && ((position = scanner.nextInt()) < min || position > max)) {
			position = 0;
			System.out.println("You choose wrong position");
		}
		System.out.println();
		return position;
	}
}
