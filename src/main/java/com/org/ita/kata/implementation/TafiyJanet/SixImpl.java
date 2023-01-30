package com.org.ita.kata.implementation.TafiyJanet;

import com.org.ita.kata.Six;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String[] records = strng.split("\n");
        double[] rainfallValues = getRainfallValuesForTown(town, records);
        if (rainfallValues == null) {
            return -1;
        }
        double sum = 0;
        for (double value : rainfallValues) {
            sum += value;
        }
        System.out.println(sum / rainfallValues.length);
        return sum / rainfallValues.length;
    }

    @Override
    public double variance(String town, String strng) {
        String[] records = strng.split("\n");
        double[] rainfallValues = getRainfallValuesForTown(town, records);
        if (rainfallValues == null) {
            return -1;
        }
        double mean = mean(town, strng);
        double variance = 0;
        for (double value : rainfallValues) {
            variance += Math.pow(value - mean, 2);
        }
        return variance / rainfallValues.length;
    }

    private static double[] getRainfallValuesForTown(String town, String[] records) {
        for (String record : records) {
            if (record.startsWith(town + ":")) {
                String[] values = record.split(":")[1].trim().split(",");
                double[] rainfallValues = new double[values.length];
                for (int i = 0; i < values.length; i++) {
                    String input = values[i];
                    String regex = "\\d+(\\.\\d+)";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(input);
                    if (matcher.find()) {
                        String cleanedRainfallData = matcher.group();
                        rainfallValues[i] = Double.parseDouble(cleanedRainfallData);
                    }
                }
                return rainfallValues;
            }
        }
        return null;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.equals("")) return "";
        String[] teams = new String[]{"Los Angeles Clippers", "Dallas Mavericks", "New York Knicks", "Atlanta Hawks", "Indiana Pacers", "Memphis Grizzlies",
                "Los Angeles Lakers", "Minnesota Timberwolves", "Phoenix Suns", "Portland Trail Blazers", "New Orleans Pelicans",
                "Sacramento Kings", "Los Angeles Clippers", "Houston Rockets", "Denver Nuggets", "Cleveland Cavaliers", "Milwaukee Bucks",
                "Oklahoma City Thunder", "San Antonio Spurs", "Boston Celtics", "Philadelphia 76ers", "Brooklyn Nets", "Chicago Bulls",
                "Detroit Pistons", "Utah Jazz", "Miami Heat", "Charlotte Hornets", "Toronto Raptors", "Orlando Magic", "Washington Wizards",
                "Golden State Warriors"};

        if (!Arrays.asList(teams).contains(toFind)) return toFind + ":This team didn't play!";

        String[] pairs = resultSheet.split(",");
        int wins = 0;
        int draws = 0;
        int loses = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        for (String s : pairs) {
            if (s.contains(".")) return "Error(float number):" + s;
            if (s.contains(toFind)) {
                int first = Integer.parseInt(s.substring(0, s.length() - 10).replaceAll("[\\D]", ""));
                String reversed = new StringBuilder(s).reverse().toString();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < reversed.length(); i++) {
                    if (Character.isDigit(reversed.charAt(i))) {
                        sb.insert(i, reversed.charAt(i));
                    } else {
                        break;
                    }
                }
                int second = Integer.parseInt(sb.reverse().toString());

                if (s.contains(toFind + " " + first)) {
                    scored += first;
                    conceded += second;
                    if (first > second) {
                        points += 3;
                        wins++;
                    }
                    if (first == second) {
                        points += 1;
                        draws++;
                    }
                    if (first < second) {
                        loses++;
                    }
                }
                if (s.contains(toFind + " " + second)) {
                    scored += second;
                    conceded += first;
                    if (second > first) {
                        points += 3;
                        wins++;
                    }
                    if (first == second) {
                        points += 1;
                        draws++;
                    }
                    if (second < first) {
                        loses++;
                    }
                }
            }
        }

        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + loses + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
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
        if (lstOfArt.length == 0) {
            return "";
        }
        return sb.toString();
    }
}
