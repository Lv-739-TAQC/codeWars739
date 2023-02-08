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

        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        if (!strng.contains(town + ":") || town == null || town.length() == 0
                || strng == null || strng.length() == 0) {
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

        if (!strng.contains(town + ":") || town == null || town.length() == 0
                || strng == null || strng.length() == 0) {
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
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    import java.util.*;

    public String nbaCup(String resultSheet, String toFind) {
        public static String nbaCup(String resultSheet, String toFind) {
            if (toFind == ""){

                return "";
            }

            if (!resultSheet.contains(toFind + " ")){

                return toFind + ":This team didn't play!";
            }

            //Splitting input by commas resulting in games array

            String arrGames[] = resultSheet.split(",");
            int teamWins = 0;
            int teamDraws = 0;
            int teamLosses = 0;
            int teamPoints = 0;
            int teamScored = 0;
            int teamConceded = 0;

            //Work on each game results
            for (int i = 0; i < arrGames.length; i++) {
                //Process result only if team of interest was participating in game
                if (arrGames[i].contains(toFind)) {

                    ArrayList<String> individualGameResult = new ArrayList<String>();

                    Pattern pattern = Pattern.compile("[?:A-Za-z0-9 ]*?[0-9.]+\\b");

                    Matcher matcher = pattern.matcher(arrGames[i]);

                    while (matcher.find()) {

                        individualGameResult.add(matcher.group().trim());
                    }

                    System.out.println("These teams were playing:" + individualGameResult);

                    //Let's get result for each team
                    int firstPoints = 0; //our team
                    int secondPoints = 0; // opponent points
                    int teamResult = 0;

                    for (int j = 0; j < individualGameResult.toArray().length; j++) {

                        String teamRes = individualGameResult.get(j);

                        String teamName = teamRes.substring(0, teamRes.lastIndexOf(" "));

                        try {

                            teamResult = Integer.parseInt(teamRes.substring(teamRes.lastIndexOf(" ")).trim());
                        } catch(NumberFormatException e) {

                            return "Error(float number):" + arrGames[i];
                        }

                        if (teamName.equals(toFind)) {

                            firstPoints = teamResult;
                        } else {

                            secondPoints = teamResult;
                        }
                    }

                    if (firstPoints > secondPoints) {

                        teamWins++;
                        teamScored += firstPoints;
                        teamConceded += secondPoints;
                        teamPoints += 3;

                    } else if (secondPoints > firstPoints) {

                        teamLosses++;
                        teamScored += firstPoints;
                        teamConceded += secondPoints;

                    } else if (secondPoints == firstPoints) {

                        teamDraws++;
                        teamPoints += 1;
                    }
                }
            }

            return toFind + ":W=" + teamWins + ";D=" + teamDraws + ";L=" + teamLosses
                    + ";Scored=" + teamScored + ";Conceded=" + teamConceded + ";Points=" + teamPoints + "";
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
