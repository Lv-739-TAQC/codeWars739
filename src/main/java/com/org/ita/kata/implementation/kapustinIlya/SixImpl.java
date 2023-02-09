package com.org.ita.kata.implementation.kapustinIlya;

import com.org.ita.kata.Six;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long sum = 0;
        int i = 1;
        while (sum < m) {
            sum += (long) Math.pow(i++, 3);
        }
        if (sum != m) {
            return -1;
        }
        return --i;
    }

    @Override
    public String balance(String book) {
        StringBuffer result = new StringBuffer();
        String[] lines = book.split("\\n");
        lines[0] = lines[0].replaceAll("[^\\s\\d\\w\\.]", "");
        lines[0] = lines[0].strip();
        double balance = Double.parseDouble(lines[0]);
        double total = 0.00;
        result.append("Original Balance: ");
        result.append(lines[0]);
        result.append("\\r\\n");
        for (int i = 1; i < lines.length; i++) {
            lines[i] = lines[i].replaceAll("[^\\s\\d\\w\\.]", "");
            lines[i] = lines[i].strip();
            lines[i] = lines[i].replaceAll("[\\s]+", " ");
            double value = Double.parseDouble(lines[i].substring(lines[i].lastIndexOf(" ") + 1));
            balance -= value;
            total += value;
            result.append(lines[i]);
            result.append(" Balance ");
            result.append(String.format("%.2f", balance));
            result.append("\\r\\n");
        }
        result.append("Total expense  ");
        result.append(String.format("%.2f", total));
        result.append("\\r\\n");
        result.append("Average expense  ");
        result.append(String.format("%.2f", total / (lines.length - 1)));

        return result.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        if (!strng.contains(town + ":") || town == null || town.length() == 0 || strng == null || strng.length() == 0) {
            return -1.0;
        }

        int startIndex = strng.indexOf(town);
        int finishIndex = strng.indexOf("\n", startIndex) != -1 ? strng.indexOf("\n", startIndex) : strng.length();
        String[] months = strng.substring(startIndex + town.length() + 1, finishIndex).split(",");
        double sum = 0;
        for (String month : months) {
            sum += Double.parseDouble(month.substring(month.indexOf(" ")));
        }

        return sum / 12;
    }

    @Override
    public double variance(String town, String strng) {
        if (!strng.contains(town + ":") || town == null || town.length() == 0 || strng == null || strng.length() == 0) {
            return -1.0;
        }
        int startIndex = strng.indexOf(town);
        int finishIndex = strng.indexOf("\n", startIndex) != -1 ? strng.indexOf("\n", startIndex) : strng.length();
        String[] months = strng.substring(startIndex + town.length() + 1, finishIndex).split(",");
        double sum = 0;
        for (String month : months) {
            sum += Double.parseDouble(month.substring(month.indexOf(" ")));
        }
        double avr = sum / 12;
        double var = 0;
        for (String month : months) {
            var += Math.pow((Double.parseDouble(month.substring(month.indexOf(" "))) - avr), 2.0);
        }

        return var / 12;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind == null || toFind.length() == 0) {
            return "";
        }
        // your code
        System.out.println(toFind);
        StringBuffer result = new StringBuffer(toFind);
        result.append(":");

        String[] games = resultSheet.split(",");
        int wins = 0, draws = 0, losts = 0, scored = 0, conceded = 0, points = 0;

        for (String game : games) {
            if (game.contains(toFind) && game.charAt(game.indexOf(toFind) + toFind.length()) == ' ') {
                System.out.println(game);
                int indexSecondGol = game.lastIndexOf(" ");
                String secondGolString = game.substring(indexSecondGol + 1);

                if (secondGolString.contains(".")) {
                    return "Error(float number):" + game;
                }
                int secondGol = Integer.parseInt(secondGolString);

                Pattern pattern = Pattern.compile(" [0-9]+[.,]?[0-9]* ");

                Matcher matcher = pattern.matcher(game);
                matcher.find();
                int indexFirstGol = matcher.start();
                String firstGolString = game.substring(indexFirstGol + 1, game.indexOf(" ", indexFirstGol + 1));
                if (firstGolString.contains(".")) {
                    return "Error(float number):" + game;
                }
                int firstGol = Integer.parseInt(firstGolString);
                String firstTeam = game.substring(0, indexFirstGol);
                String secondTeam = game.substring(game.indexOf(" ", indexFirstGol + 1) + 1, indexSecondGol);
                System.out.println(firstTeam + " " + firstGol);
                System.out.println(secondTeam + " " + secondGol);
                if (firstTeam.equals(toFind)) {
                    System.out.println("first");
                    if (firstGol > secondGol) {
                        wins++;
                        System.out.println("wins " + wins);
                    } else if (firstGol == secondGol) {

                        draws++;
                        System.out.println("draws" + draws);
                    } else {

                        losts++;
                        System.out.println("losts" + losts);
                    }
                    scored += firstGol;
                    conceded += secondGol;
                } else {
                    System.out.println("second");
                    if (firstGol < secondGol) {

                        wins++;
                        System.out.println("wins " + wins);
                    } else if (firstGol == secondGol) {

                        draws++;
                        System.out.println("draws" + draws);
                    } else {

                        losts++;
                        System.out.println("losts" + losts);
                    }
                    scored += secondGol;
                    conceded += firstGol;
                }

            }
        }
        if (wins == 0 && draws == 0 && losts == 0) {
            result.append("This team didn't play!");
        } else {
            result.append("W=");
            result.append(wins);
            result.append(";D=");
            result.append(draws);
            result.append(";L=");
            result.append(losts);
            result.append(";Scored=");
            result.append(scored);
            result.append(";Conceded=");
            result.append(conceded);
            result.append(";Points=");
            result.append((wins * 3 + draws));
        }
        // System.out.println(result.toString());
        // System.out.println("/////////////////");
        return result.toString();
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOf1stLetter == null || lstOf1stLetter.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        int[] countCategory = new int[lstOf1stLetter.length];
        List<String> lstOf1stLetterList = Arrays.asList(lstOf1stLetter);
        String firstLetter;
        int indexInlstOf1stLetterList;
        for (String category : lstOfArt) {
            firstLetter = category.substring(0, 1);
            indexInlstOf1stLetterList = lstOf1stLetterList.indexOf(firstLetter);
            if (indexInlstOf1stLetterList >= 0) {
                countCategory[indexInlstOf1stLetterList] += Integer
                        .parseInt(category.substring(category.indexOf(" ") + 1));
            }
        }
        StringBuffer result = new StringBuffer();
        // (A : 20) - (B : 114) - (C : 50) - (W : 0)
        for (int i = 0; i < lstOf1stLetter.length - 1; i++) {
            result.append("(");
            result.append(lstOf1stLetter[i]);
            result.append(" : ");
            result.append(countCategory[i]);
            result.append(") - ");
        }
        result.append("(");
        result.append(lstOf1stLetter[lstOf1stLetter.length - 1]);
        result.append(" : ");
        result.append(countCategory[lstOf1stLetter.length - 1]);
        result.append(")");

        if (IntStream.of(countCategory).sum() == 0) {
            return "";
        }

        return result.toString();
    }
}
