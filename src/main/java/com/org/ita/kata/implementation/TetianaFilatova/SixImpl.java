package com.org.ita.kata.implementation.TetianaFilatova;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
            long i = 1;
            long sum = 0;
            long n = 0;

            do{
                sum += (long)Math.pow(i, 3);
                i++;
            } while (sum < m);

            if (sum == m){
                n = i - 1;
            } else if (sum > m){
                n = -1;
            }

            return n;
    }

    @Override
    public String balance(String book) {

        String str = book.replaceAll("[^a-zA-Z0-9.\\s]", "").replaceAll(" +", " ");
        String[] rows = str.split("\n");
        double origBalance = Double.parseDouble(rows[0]);
        String newLine = String.format("Original Balance: %.2f", origBalance);
        double totalEx = 0d;

        for(int i = 1; i < rows.length; i++){
            String row = rows[i].trim();
            double expense = Double.parseDouble(row.substring(row.lastIndexOf(' ')+1));
            totalEx += expense;
            origBalance -= expense;
            newLine += String.format("\\r\\n%s Balance %.2f", row, origBalance);
            
        }
        return newLine + String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", totalEx, totalEx / (rows.length - 1))
    }

    @Override
    public double f(double x) {
        return 0;
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
        return null;
    }
}
