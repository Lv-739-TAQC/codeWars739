package com.org.ita.kata.implementation.IrenZh;

import com.org.ita.kata.Six;
import static java.util.stream.Collectors.averagingDouble;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) { long mm = 0, n = 0;
        while (mm < m) mm += ++n * n * n;
        return mm == m ? n : -1;
    }

    @Override
    public String balance(String book) { String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = t.split("[\\n]+");
        double current = Double.parseDouble(arr[0]);
        double total = 0;
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            count++;
            String[] line = arr[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String u = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(u);
        }
        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total, total / count));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return Math.expm1(Math.log1p(x) / 2);
    }

    @Override
    public double mean(String town, String strng) {
        return parseTemp(town, strng).stream()
                .collect(averagingDouble(n -> n));
    }

    @Override
    public double variance(String town, String strng) {
        double mean = mean(town, strng);
        if (mean == -1.0) return -1.0;

        return parseTemp(town, strng).stream()
                .collect(averagingDouble(n -> (n - mean) * (n - mean)));

    }

    private static List<Double> parseTemp(String town, String strng) {
        List<Double> temps = new ArrayList<>();
        for (String line : strng.split("\\n")) {
            String[] data = line.split(":");
            if (town.equals(data[0])) {
                for (String weather : data[1].split(",")) {
                    String[] temp = weather.split("\\s");
                    temps.add(Double.parseDouble(temp[1]));
                }
                break;
            }
        }

        if (temps.isEmpty()) temps.add(-1.0);

        return temps;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
            if (toFind.equals("")) return "";
            String[] teams = new String[]{"Los Angeles Clippers", "Dallas Mavericks", "New York Knicks",
                    "Atlanta Hawks", "Indiana Pacers", "Memphis Grizzlies",
                    "Los Angeles Lakers", "Minnesota Timberwolves", "Phoenix Suns", "Portland Trail Blazers",
                    "New Orleans Pelicans", "Sacramento Kings", "Los Angeles Clippers", "Houston Rockets",
                    "Denver Nuggets", "Cleveland Cavaliers", "Milwaukee Bucks", "Oklahoma City Thunder",
                    "San Antonio Spurs", "Boston Celtics", "Philadelphia 76ers", "Brooklyn Nets", "Chicago Bulls",
                    "Detroit Pistons", "Utah Jazz", "Miami Heat", "Charlotte Hornets", "Toronto Raptors",
                    "Orlando Magic", "Washington Wizards", "Golden State Warriors"};

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

            return toFind + ":W=" + wins + ";D=" + draws + ";L=" + loses + ";Scored=" + scored +
                    ";Conceded=" + conceded + ";Points=" + points;

    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String report = "";
        if ((lstOfArt.length == 0) || (lstOf1stLetter.length == 0)) {
            return report;
        }
        for (String letter : lstOf1stLetter) {
            int quantity = 0;
            for (String stockLetter : lstOfArt) {
                if (stockLetter.substring(0, 1).equals(letter)) {
                    quantity += Integer.parseInt(stockLetter.replaceAll("[^0-9]", ""));
                } else quantity += 0;
            }
            report += " - (" + letter + " : " + quantity + ")";
        }
        return report.substring(3);
    }
}
