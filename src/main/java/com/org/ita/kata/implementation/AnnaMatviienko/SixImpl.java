package com.org.ita.kata.implementation.AnnaMatviienko;

import com.org.ita.kata.Six;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class SixImpl implements Six {
    public static DecimalFormat df = new DecimalFormat("0.000");
    public static HashMap<String, String> map = new HashMap<>();
    public static double meanValue = 0.0;
    public static double varianceValue = 0.0;

    public static Double formatting(double number) {
        return Double.valueOf(df.format(number));
    }

    @Override
    public long findNb(long m) {
        int count;
        for (int n = 0; ; n++) {
            if (m > 0) {
                long cubeVolume = (long) Math.pow(n + 1, 3);
                m = m - cubeVolume;
            } else if (m == 0) {
                count = n;
                break;
            } else if (m < 0) {
                count = -1;
                break;
            }
        }
        return count;
    }

    @Override
    public String balance(String book) {
        if (book.isEmpty()) {
            return "";
        }
        book = book.replaceAll("[^a-zA-Z0-9. \\n]", "");
        book = book.replaceAll("\\s+", " ");
        book = book.replaceAll("\\n", " ");

        String[] bookArray = book.split(" ");
        String result = "Original Balance: " + bookArray[0] + "\\r\\n";

        double tempBalance = Double.parseDouble(bookArray[0]);

        for (int i = 1; i < bookArray.length; i++) {
            result += bookArray[i];
            result += " ";
            if (i % 3 == 0) {
                tempBalance -= Double.parseDouble(bookArray[i]);
                result += "Balance ";
                result += String.format("%.2f", tempBalance) + "\\r\\n";
            }
        }

        double totalExpense = Double.parseDouble(bookArray[0]) - tempBalance;
        double average = formatting(totalExpense / ((bookArray.length - 1) / 3.0));

        result += "Total expense  ";
        result += String.format("%.2f", totalExpense);
        result += "\\r\\n";
        result += "Average expense  ";
        result += String.format("%.2f", average);

        return result;
    }

    @Override
    public double f(double x) {
        double result = Math.expm1(Math.log1p(x) / 2);
        return result;
    }

    @Override
    public double mean(String town, String strng) {
        meanValue = 0;
        varianceValue = 0;
        if (strng.indexOf((town + ":")) == -1) {
            return -1;
        } else {
            int cityLength = strng.indexOf(town) + town.length() + 1;
            strng = strng.substring(cityLength);
            int newLine = strng.indexOf('\n');
            if (newLine != -1) {
                strng = strng.substring(0, newLine);
            }
            strng = strng.replaceAll(",", " ");
            strng = strng.replaceAll("\\s+", " ");
            String[] rainfall = strng.split(" ");
            for (int i = 0; i < rainfall.length - 1; i += 2) {
                map.put(rainfall[i], rainfall[i + 1]);
            }
            for (Map.Entry<String, String> countMap : map.entrySet()) {
                meanValue = (meanValue + Double.parseDouble(countMap.getValue()));
            }
            double mapSize = map.size();
            meanValue = meanValue / mapSize;
        }
        return meanValue;
    }

    @Override
    public double variance(String town, String strng) {
        meanValue = 0;
        varianceValue = 0;
        if (strng.indexOf((town + ":")) == -1) {
            return -1;
        } else {
            int cityLength = strng.indexOf(town) + town.length() + 1;
            strng = strng.substring(cityLength);
            int newLine = strng.indexOf('\n');
            if (newLine != -1) {
                strng = strng.substring(0, newLine);
            }
            strng = strng.replaceAll(",", " ");
            strng = strng.replaceAll("\\s+", " ");
            String[] rainfall = strng.split(" ");
            for (int i = 0; i < rainfall.length - 1; i += 2) {
                map.put(rainfall[i], rainfall[i + 1]);
            }
            for (Map.Entry<String, String> countMap : map.entrySet()) {
                meanValue = (meanValue + Double.parseDouble(countMap.getValue()));
            }
            double mapSize = map.size();
            meanValue = meanValue / mapSize;
        }
        double mapSize = map.size();
        for (Map.Entry<String, String> countMap : map.entrySet()) {
            double value = Double.parseDouble(countMap.getValue());
            varianceValue += Math.pow((value - meanValue), 2);
        }
        varianceValue = varianceValue / mapSize;
        return varianceValue;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        String result = "";
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < lstOfArt.length; i++) {
            String[] temp;
            temp = lstOfArt[i].split(" ");
            System.out.println("temp[0] = " + temp[0] + "; temp[1] = " + temp[1]);
            map.put(temp[0], Integer.valueOf(temp[1]));
        }
        for (int j = 0; j < lstOf1stLetter.length; j++) {
            int sumBoost = 0;
            for (Map.Entry<String, Integer> countMap : map.entrySet()) {
                if (lstOf1stLetter[j].equals(String.valueOf(countMap.getKey().charAt(0)))) {
                    sumBoost += countMap.getValue();
                }
            }
            result += "(" + lstOf1stLetter[j] + " : " + sumBoost + ")" + " - ";
        }
        return result.substring(0, result.length() - 3);
    }
}
