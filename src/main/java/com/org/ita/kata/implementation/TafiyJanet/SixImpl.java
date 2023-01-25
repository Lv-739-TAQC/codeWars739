package com.org.ita.kata.implementation.TafiyJanet;

import com.org.ita.kata.Six;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long totalVolume = 0;
        int n = 0;
        while (totalVolume < m) {
            n++;
            totalVolume += (long) Math.pow(n, 3);
        }
        return totalVolume == m ? n : -1;
    }

    @Override
    public String balance(String book) {
        String[] lines = book.split("\n");
        StringBuilder report = new StringBuilder();
        double originalBalance = Double.parseDouble(lines[0].replaceAll("[^0-9.]", ""));
        double currentBalance = originalBalance;
        double totalExpense = 0;
        int numOfExpenses = 0;

        DecimalFormat df = new DecimalFormat("#.00");
        report.append("Original Balance: " + df.format(originalBalance) + "\\r\\n");

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].replaceAll("[^a-zA-Z0-9. ]", "");
            if (!line.isEmpty()) {
                String[] parts = line.split(" ");
                double expense = Double.parseDouble(parts[parts.length - 1]);
                currentBalance -= expense;
                totalExpense += expense;
                numOfExpenses++;
                String expenseLine = "";
                for (String j : parts) {
                    expenseLine += " " + j;
                    expenseLine = expenseLine.trim();
                }
                report.append(expenseLine + " Balance " + df.format(currentBalance) + "\\r\\n");
            }
        }
        report.append("Total expense  " + df.format(totalExpense) + "\\r\\n");
        report.append("Average expense  " + df.format(totalExpense / numOfExpenses));

        return report.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String, Integer> result = new HashMap<>();
        for (String letter : lstOf1stLetter) {
            result.put(letter, 0);
        }

        for (String item : lstOfArt) {
            String[] parts = item.split(" ");
            String code = parts[0];
            int quantity = Integer.parseInt(parts[1]);
            String category = code.substring(0, 1);
            if (result.containsKey(category)) {
                result.put(category, result.get(category) + quantity);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String letter : lstOf1stLetter) {
            sb.append("(" + letter + " : " + result.get(letter) + ")");
            if (!letter.equals(lstOf1stLetter[lstOf1stLetter.length - 1])) {
                sb.append(" - ");
            }
        }
        if (lstOfArt.length == 0){
            return "";
        }
        return sb.toString();
    }
}
