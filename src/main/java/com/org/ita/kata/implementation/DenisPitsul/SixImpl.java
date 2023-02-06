package com.org.ita.kata.implementation.DenisPitsul;

import com.org.ita.kata.Six;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SixImpl implements Six {

    private static final String teams = "Los Angeles Clippers,Dallas Mavericks,New York Knicks,Atlanta Hawks,Indiana Pacers,Memphis Grizzlies,"
            + "Los Angeles Lakers,Minnesota Timberwolves,Phoenix Suns,Portland Trail Blazers,New Orleans Pelicans,"
            + "Sacramento Kings,Los Angeles Clippers,Houston Rockets,Denver Nuggets,Cleveland Cavaliers,Milwaukee Bucks,"
            + "Oklahoma City Thunder,San Antonio Spurs,Boston Celtics,Philadelphia 76ers,Brooklyn Nets,Chicago Bulls,"
            + "Detroit Pistons,Utah Jazz,Miami Heat,Charlotte Hornets,Toronto Raptors,Orlando Magic,Washington Wizards,"
            + "Golden State Warriors,Dallas Mavericks";

    private static double[] getTownTemp(String town, String strng) {
        String[] lines = strng.split("\n");
        String resultLine = null;
        for (String line : lines) {
            if (line.startsWith(String.format("%s:", town))) {
                resultLine = line;
                break;
            }
        }

        List<Double> temps = new ArrayList<>();
        if (resultLine != null) {
            resultLine = resultLine.replace(',', ' ');
            Scanner scanner = new Scanner(resultLine);
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    temps.add(scanner.nextDouble());
                } else {
                    scanner.next();
                }
            }
        }
        double[] resultArray = new double[temps.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = temps.get(i);
        }
        return resultArray;
    }

    private static String sumStatistics(List<String> matchesOfUniqueTeam, String toFind) {
        int winners = 0;
        int draws = 0;
        int losses = 0;
        int scored = 0;
        int conceded = 0;
        int points;
        final List<String> teamsArray = Arrays.asList(teams.split(","));
        if (!teamsArray.contains(toFind))
            return toFind + ":This team didn't play!";
        for (String match : matchesOfUniqueTeam) {
            if (match.contains("."))
                return "Error(float number):" + match;
            final Result result = getResult(match);
            if (result.winLocal() && result.isLocal(toFind)) {
                winners++;
                scored = scored + result.getLocalResultTeam();
                conceded = conceded + result.getVisitorResultTeam();

            } else if (result.winVisitor() && result.isLocal(toFind)) {
                losses++;
                scored = scored + result.getLocalResultTeam();
                conceded = conceded + result.getVisitorResultTeam();

            } else if (result.winLocal() && result.isVisitor(toFind)) { // Soy visitante y gana visitante
                losses++;
                scored = scored + result.getVisitorResultTeam();
                conceded = conceded + result.getLocalResultTeam();
            } else if (result.winVisitor() && result.isVisitor(toFind)) { // Soy visitante y pierde visitante
                winners++;
                scored = scored + result.getVisitorResultTeam();
                conceded = conceded + result.getLocalResultTeam();

            } else {
                draws++;
                scored = scored + result.getLocalResultTeam();
                conceded = conceded + result.getLocalResultTeam();

            }
        }
        points = winners * 3 + draws;
        return toFind + ":W=" + winners + ";D=" + draws + ";L=" + losses + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }

    private static Result getResult(String line) {
        String localTeam = null;
        int localResultTeam = 0;
        String visitorTeam = null;
        int visitorResultTeam = 0;
        final String[] teamsStr = teams.split(",");
        for (String team : teamsStr) {
            if (line.contains(team)) {
                if (localTeam == null) {
                    localTeam = team;
                    String number = line.substring(line.indexOf(localTeam) + localTeam.length() + 1).split(" ")[0];
                    localResultTeam = Integer.parseInt(number);
                } else if (!team.equals(localTeam)) {
                    visitorTeam = team;
                    String number = line.substring(line.indexOf(visitorTeam) + visitorTeam.length() + 1).split(" ")[0];
                    visitorResultTeam = Integer.parseInt(number);
                    break;
                }
            }
        }
        return new Result(localTeam, localResultTeam, visitorTeam, visitorResultTeam);
    }

    @Override
    public long findNb(long m) {
        long total = 0;
        int counter = 0;

        while (total < m) {
            counter++;
            total = total + (long) Math.pow(counter, 3);
        }

        if (m == total)
            return counter;
        return -1;
    }

    @Override
    public String balance(String book) {
        book = book.replaceAll("[!=:%?,{}()$#;_-]", "");
        String[] lines = book.split("\n");
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat(".00");
        double balance = 0;
        double totalExpense = 0;
        int balanceDecreaseCount = 0;
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split("[ ]+");
            if (i == 0) {
                balance = Double.parseDouble(line[0]);
                sb.append("Original Balance: ").append(line[0]).append("\\r\\n");
            } else {
                balance -= Double.parseDouble(line[2]);
                totalExpense += Double.parseDouble(line[2]);
                balanceDecreaseCount++;
                String strBalance = df.format(balance).replace(",", ".");
                sb.append(line[0]).append(" ").append(line[1]).append(" ").append(line[2])
                        .append(" Balance ").append(strBalance).append("\\r\\n");
            }
        }
        String strTotalExpense = df.format(totalExpense).replace(",", ".");
        sb.append("Total expense  ").append(strTotalExpense).append("\\r\\n");
        double averageExpense = totalExpense / balanceDecreaseCount;
        String strAverageExpense = df.format(averageExpense).replace(",", ".");
        sb.append("Average expense  ").append(strAverageExpense);
        return sb.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || strng == null) {
            return 0d;
        }
        double[] townTemp = getTownTemp(town, strng);
        if (townTemp.length == 0) {
            return -1d;
        }
        return Arrays.stream(townTemp).average().getAsDouble();
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || strng == null) {
            return 0d;
        }
        double[] townTemp = getTownTemp(town, strng);
        if (townTemp.length == 0) {
            return -1d;
        }
        double average = Arrays.stream(townTemp).average().getAsDouble();
        double variance = Arrays.stream(townTemp)
                .map(p -> Math.pow(p - average, 2))
                .sum() / townTemp.length;
        return variance;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (resultSheet == null || resultSheet.isEmpty() || toFind == null || toFind.isEmpty())
            return "";
        String[] matches = resultSheet.split(",");
        List<String> matchesOfUniqueTeam = Arrays.stream(matches)
                .filter(m -> m.contains(toFind))
                .collect(Collectors.toList());
        System.out.println(matchesOfUniqueTeam);

        return sumStatistics(matchesOfUniqueTeam, toFind);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : lstOf1stLetter) {
            map.put(s, 0);
            for (String item : lstOfArt) {
                String key = item.charAt(0) + "";
                int value = Integer.parseInt(item.split(" ")[1]);
                if (key.equals(s))
                    map.put(key, map.get(key) + value);
            }
        }

        StringBuilder output = new StringBuilder();
        boolean in = false;
        if (map.size() == 0)
            return output.toString();
        for (String key : map.keySet()) {
            if (map.get(key) > 0)
                in = true;
            output.append("(").append(key).append(" : ").append(map.get(key)).append(") - ");
        }
        output = new StringBuilder(output.substring(0, output.length() - 3));
        if (!in)
            return "";
        return output.toString();
    }

    private static class Result {
        private final String localTeam;
        private final int localResultTeam;
        private final String visitorTeam;
        private final int visitorResultTeam;

        Result(String localTeam, int localResultTeam, String visitorTeam, int visitorResultTeam) {
            this.localTeam = localTeam;
            this.localResultTeam = localResultTeam;
            this.visitorTeam = visitorTeam;
            this.visitorResultTeam = visitorResultTeam;
        }

        boolean isLocal(String team) {
            return localTeam.equals(team);
        }

        boolean isVisitor(String team) {
            return visitorTeam.equals(team);
        }

        boolean winLocal() {
            return localResultTeam > visitorResultTeam;
        }

        boolean winVisitor() {
            return localResultTeam < visitorResultTeam;
        }

        int getLocalResultTeam() {
            return localResultTeam;
        }

        int getVisitorResultTeam() {
            return visitorResultTeam;
        }
    }
}
