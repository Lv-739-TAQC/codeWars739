package com.org.ita.develop.kapustinIlya;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class View {

	public static void mainPage() {

		System.out.println("/// Main page ///");
		System.out.println("1. List student");
		System.out.println("2. List level");
		System.out.println("0. Exit");

		int position = ScannerUpdate.chooseMenuPosition(0, 2);
		switch (position) {
		case 2:
			levelPage();
			break;
		}

		System.out.println("/// Goodbya!!! ///");
	}

	private static void levelPage() {

		List<String> levels = Controller.getLevels("src/main/java/com/org/ita/kata");
		String chosenLevel = null;

		System.out.println("/// Levels page ///");
		for (int i = 0; i < levels.size(); i++) {
			chosenLevel = levels.get(i).substring(0, levels.get(i).indexOf("."));
			System.out.printf("%d: %s\n", i + 1, chosenLevel);
		}
		System.out.println("0. Exit");
		System.out.println("-1. Main Page");

		int position = ScannerUpdate.chooseMenuPosition(-1, levels.size());

		if (position > 0) {
			chosenLevel = levels.get(position - 1).substring(0, levels.get(position - 1).indexOf("."));
			methodsPage(chosenLevel);
		} else if (position == -1) {
			mainPage();
		}

	}

	private static void methodsPage(String className) {
		try {
			List<Method> methods = Controller.getNameMethods(className);
			Method chosenMethod = null;

			System.out.println("/// Methods: ///");
			for (int i = 0; i < methods.size(); i++) {
				chosenMethod = methods.get(i);
				System.out.printf("%d: %s\n", i + 1, chosenMethod.getName());
			}
			System.out.println("0. Exit");
			System.out.println("-1. Level page");

			int position = ScannerUpdate.chooseMenuPosition(-1, methods.size());

			if (position > 0) {
				chosenMethod = methods.get(position - 1);
				implemPage(chosenMethod, className);
			} else if (position == -1) {
				levelPage();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Something was wrong. Try Again.");
			mainPage();
		}
	}

	private static void implemPage(Method method, String className) {
		List<String> implems = Controller.getImplementation("src/main/java/com/org/ita/kata/implementation");
		String chosenImplem = null;

		System.out.println("///Implementation page: ///");
		for (int i = 0; i < implems.size(); i++) {
			chosenImplem = implems.get(i);
			System.out.printf("%d: %s\n", i + 1, chosenImplem);
		}
		System.out.println("0. Exit");
		System.out.println("-1. Methods page");

		int position = ScannerUpdate.chooseMenuPosition(-1, implems.size());

		if (position > 0) {
			chosenImplem = implems.get(position - 1);
			try {
				invokeMethodPage(method, className, chosenImplem);
			} catch (Exception e) {
				System.out.println("Something was wrong. Try Again.");
				mainPage();
			}

		} else if (position == -1) {
			methodsPage(className);
		}
	}

	private static void invokeMethodPage(Method method, String className, String implemPerson)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		System.out.printf("/// Invoke methods:\"%s\" by %s: ///\n", method.getName(), implemPerson);

		Object result = Controller.getInvokeMethod(method, className, implemPerson);
		String typeReturnType = method.getReturnType().getSimpleName();

		System.out.print("Result chosen methods is ");
		if (typeReturnType.contains("[]")) {
			switch (typeReturnType.substring(0, typeReturnType.indexOf("[]"))) {
			case "int":
				System.out.println(Arrays.toString((int[]) result));
				break;
			case "long":
				System.out.println(Arrays.toString((long[]) result));
				break;
			case "float":
				System.out.println(Arrays.toString((float[]) result));
				break;
			case "double":
				System.out.println(Arrays.toString((double[]) result));
				break;
			case "String":
				System.out.println(Arrays.toString((String[]) result));
				break;
			}
		} else {
			System.out.println(result);
		}

	}

}
