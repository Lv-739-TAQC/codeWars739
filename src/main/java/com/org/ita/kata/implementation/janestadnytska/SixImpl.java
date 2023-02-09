package com.org.ita.kata.implementation.janestadnytska;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        long pile = 0;
        while (pile < m) {
            n++;
            pile += n * n * n;
        }
        if (pile == m) {
            return n;
        } else {
            return -1;
        }
    }

    @Override
    public String balance(String book) {
        String cleanStr = book.replaceAll("[^a-zA-Z0-9.\\s]", "").replaceAll(" +", " ");
        String[] lines = cleanStr.split("\n");
        double balance = Double.parseDouble(lines[0]);
        String bookNew = String.format("Original Balance: %.2f", balance);
        double total = 0d;
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].trim();
            double amount = Double.parseDouble(line.substring(line.lastIndexOf(' ') + 1));
            total += amount;
            balance -= amount;
            bookNew += String.format("\\r\\n%s Balance %.2f", line, balance);
        }
        return bookNew + String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total,
                total / (lines.length - 1));
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1.00 + x) + 1.00);
    }

    @Override
    public double mean(String townName, String megaString) {
        if (townName == null || townName.length() == 0 || megaString == null || megaString.length() == 0) return -1;
        if (!megaString.contains(townName + ":")) return -1;
        final int monthsQuantity = 12;
        String[] towns = megaString.split("\n");
        String townNameCopy = "";
        for (String town : towns) {
            if (town.split(":")[0].equals(townName))
                townNameCopy = town;
        }
        double avg = 0;
        String[] t = townNameCopy.split(" ");
        for (int i = 1; i < t.length; i++) {
            avg += Double.parseDouble(t[i].split(",")[0]);
        }
        return avg / monthsQuantity;
    }

    @Override
    public double variance(String townName, String megaString) {
        if (townName == null || townName.length() == 0 || megaString == null || megaString.length() == 0) return -1;
        if (!megaString.contains(townName + ":")) return -1;
        final int monthsQuantity = 12;
        String[] towns = megaString.split("\n");
        String townNameCopy = "";
        for (String town : towns) {
            if (town.split(":")[0].equals(townName))
                townNameCopy = town;
        }
        if (townNameCopy.equals("")) {
            return -1.0;
        }
        double squaresSum = 0;
        String[] t = townNameCopy.split(" ");
        for (int i = 1; i < t.length; i++) {
            squaresSum += Math.pow((Double.parseDouble(t[i].split(",")[0])
                    - mean(townName, megaString)), 2);
        }
        return squaresSum / monthsQuantity;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.equals("")) return "";
        if (!resultSheet.contains(toFind + " ")) return toFind + ":This team didn't play!";
        String res = toFind + ":";
        int victories = 0;
        int draws = 0;
        int lost = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;

        String[] teams = resultSheet.split(",");
        int score;
        int concede;
        for (String team : teams) {
            if (team.contains(toFind)) {
                int j = team.indexOf(toFind);
                try {
                    String[] splitTeams = team.split(" ");
                    if (j == 0) {
                        score = Integer.parseInt(splitTeams[toFind.split(" ").length]);
                        concede = Integer.parseInt(splitTeams[splitTeams.length - 1]);
                    } else {
                        concede = Integer.parseInt(splitTeams[splitTeams.length - toFind.split(" ").length - 2]);
                        score = Integer.parseInt(splitTeams[splitTeams.length - 1]);
                    }
                } catch (NumberFormatException e) {
                    return "Error(float number):" + team;
                }
                scored += score;
                conceded += concede;
                if (score > concede) {
                    victories++;
                    points += 3;
                } else if (score == concede) {
                    draws++;
                    points++;
                } else {
                    lost++;
                }
            }
        }
        return res + "W=" + victories + ";D=" + draws + ";L=" + lost + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
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
            report = report + " - (" + letter + " : " + quantity + ")";
        }
        return report.substring(3);
    }
}
