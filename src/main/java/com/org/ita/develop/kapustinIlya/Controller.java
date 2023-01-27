package com.org.ita.develop.kapustinIlya;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Controller {
	public static List<String> getLevels(String namePackageLevel) {
		File packageInterface = new File(namePackageLevel);
		return Stream.of(packageInterface.listFiles()).filter(File::isFile).map(File::getName).toList();
	}
	public static List<Method> getNameMethods(String className) throws ClassNotFoundException {
		Class<?> typeClass = Class.forName("com.org.ita.kata." + className);
		return Arrays.asList(typeClass.getMethods());
	}
	public static List<String> getImplementation(String namePackageImplementation) {
		File packageInterface = new File(namePackageImplementation);
		return Stream.of(packageInterface.listFiles()).filter(File::isDirectory).map(File::getName).toList();
	}
}