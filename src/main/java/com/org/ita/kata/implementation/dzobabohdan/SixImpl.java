package com.org.ita.kata.implementation.dzobabohdan;

import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SixImpl implements Six {

    // Build a pile of Cubes
    @Override
    public long findNb(long m) {
        long result = 0;
        long i = 0;

        while (result < m) {
            i++;
            result += i*i*i;
        }
        return result == m ? i : -1;
    }

    // Easy Balance Checking
    @Override
    public String balance(String book) {
        String[] lines = book.split("\n");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].replaceAll("[^\\w\\d\\.\\s]", "").replaceAll("  "," ").trim();
        }

        DecimalFormat df = new DecimalFormat("#.00");
        int i = 1;
        int whitespaceIndex;
        double[] expense = new double[lines.length-1];
        double totalExpense;
        double averageExpense;
        double actualBalance = Double.parseDouble(lines[0]);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Original Balance: ").append(lines[0]);

        while (i < lines.length) {

            whitespaceIndex = lines[i].lastIndexOf(" ");
            expense[i-1] = Double.parseDouble(lines[i].substring(whitespaceIndex));
            actualBalance = actualBalance - expense[i-1];

            stringBuilder.append("\\r\\n")
                    .append(lines[i])
                    .append(" Balance ")
                    .append(df.format(actualBalance));
            i++;
        }

        totalExpense = Arrays.stream(expense).sum();
        averageExpense = totalExpense/expense.length;

        stringBuilder.append("\\r\\nTotal expense  ")
                .append(df.format(totalExpense))
                .append("\\r\\nAverage expense  ")
                .append(df.format((double) Math.round(averageExpense * 100) / 100));

        return stringBuilder.toString();
    }

    // Floating-point Approximation (I)
    @Override
    public double f(double x) {
        BigDecimal xBigDecimal = new BigDecimal(x).setScale(40, RoundingMode.HALF_UP);
        BigDecimal oneBigDecimal = new BigDecimal(1).setScale(40, RoundingMode.HALF_UP);
        MathContext mc = new MathContext(40);
        BigDecimal result = (oneBigDecimal.add(xBigDecimal).sqrt(mc).subtract(oneBigDecimal));
        return result.doubleValue();
    }

    // Rainfall
    @Override
    public double mean(String town, String strng) {
        boolean isPresent = false;

        for (String oneTown: towns(strng)) {
            if (oneTown.equals(town)) {
                isPresent = true;
                break;
            }
        }
        if (!isPresent) return -1;

        double[] data = allDataByTown(town, strng);
        return Arrays.stream(data).average().orElse(-1);
    }

    @Override
    public double variance(String town, String strng) {
        boolean isPresent = false;

        for (String oneTown: towns(strng)) {
            if (oneTown.equals(town)) {
                isPresent = true;
                break;
            }
        }
        if (!isPresent) return -1;

        double[] data = allDataByTown(town, strng);
        double mean = mean(town, strng);
        return Arrays.stream(data).map(x -> x - mean).map(x -> x * x).average().orElse(-1);
    }

    private static double[] allDataByTown(String town, String strng) {

        String lineWithTown = Arrays.stream(strng.split("\n")).filter(line -> line.contains(town)).collect(Collectors.joining());
        String[] parts = lineWithTown.split("[^\\d.-]+");
        double[] data = new double[parts.length - 1];

        for (int i = 0; i < parts.length-1; i++) {
            data[i] = Double.parseDouble(parts[i+1]);
        }

        return data;
    }

    private static String[] towns(String strng) {
        return Arrays.stream(strng.split("\n"))
                .map(s -> s.split(":")[0])
                .toArray(String[]::new);
    }

    //Ranking NBA teams
    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.equals("")) return "";
        String firstTeamScore;
        String secondTeamScore;
        int diff;
        int wins = 0;
        int draws = 0;
        int loses = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;

        //String[] teams = getAllTeams(resultSheet);
        if (!resultSheet.contains(toFind + " ")) return toFind + ":This team didn't play!";

        String[] matches = Arrays.stream(resultSheet.split(",")).filter(match -> match.contains(toFind)).toArray(String[]::new);

        Pattern pattern = Pattern.compile("\\d+(?:\\.\\d+)?");
        Matcher matcher;

        int index;
        for (String match: matches) {

            index = match.indexOf(toFind);
            if (index != 0) matcher = pattern.matcher(match.substring(index));
            else matcher = pattern.matcher(match.substring(0, toFind.length() + 5));

            //find score of toFind team

            if (matcher.find()) {
                firstTeamScore = matcher.group();
                if (Float.parseFloat(firstTeamScore) % 1 != 0) return "Error(float number):" + match;
                scored += Integer.parseInt(firstTeamScore);
            } else {
                return "Error(float number):" + match;
            }

            if (index != 0) matcher = pattern.matcher(match.substring(0, index));
            else matcher = pattern.matcher(match.substring(match.length() - 5));

            if (matcher.find()) {
                secondTeamScore = matcher.group();
                if (Float.parseFloat(secondTeamScore) % 1 != 0) return "Error(float number):" + match;
                conceded += Integer.parseInt(secondTeamScore);
            } else {
                return "Error(float number):" + match;
            }

            diff = Integer.parseInt(firstTeamScore) - Integer.parseInt(secondTeamScore);
            if (diff == 0) draws++;
            if (diff < 0) loses++;
            if (diff > 0) wins++;
        }

        points = wins*3 + draws;

        return toFind + ":W=" + wins + ";D=" + draws +";L=" + loses + ";Scored=" + scored + ";Conceded=" + conceded +";Points=" + points;
    }

    // Help the bookseller !
    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        HashMap<String, Integer> quantities = new HashMap<>();
        for (String category : lstOf1stLetter) {
            quantities.put(category, 0);
        }
        for (String book : lstOfArt) {
            String category = book.substring(0, 1);
            if (quantities.containsKey(category)) {
                int quantity = Integer.parseInt(book.substring(book.indexOf(" ") + 1));
                quantities.put(category, quantities.get(category) + quantity);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            result.append("(" + category + " : " + quantities.get(category) + ") - ");
        }
        return result.substring(0, result.length() - 3);
    }
}
