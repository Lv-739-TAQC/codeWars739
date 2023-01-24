package com.org.ita.kata.implementation.savaxn04;

import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 1;
        while(m>0){
            m -= n*n*n;
            n++;
        }
        if(m==0){
            return n-1;
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        List<String> books = List.of(book.replaceAll("[^a-zA-Z0-9.\n]", " ").split("\n"));
        StringBuilder result = new StringBuilder("Original Balance: " + books.get(0).trim()+"\\r\\n");
        double balance = Double.parseDouble(books.get(0).trim());
        List<Double> prices = new ArrayList<>();

        for (int i = 1; i < books.size(); i++) {
            List<String> tempStr = List.of(books.get(i).split(" "));
            for (String str: tempStr) {
                if(!str.equals("")){
                    result.append(str.trim()).append(" ");
                    if(str.contains(".")){
                        prices.add(Double.parseDouble(str.trim()));
                        balance -= Double.parseDouble(str.trim());
                        result.append("Balance ").append(String.format("%.2f", Math.round(balance * 100.0) / 100.0));
                    }
                }
            }
            result.append("\\r\\n");
        }
        result.append("Total expense  ")
                .append(String.format("%.2f",prices.stream().mapToDouble(Double::doubleValue).sum()))
                .append("\\r\\nAverage expense  ")
                .append(String.format("%.2f", Math.round(prices.stream().mapToDouble(Double::doubleValue).average().getAsDouble()* 100.0)/ 100.0));
        return result.toString();
    }

    @Override
    public double f(double x) {
        MathContext mc = new MathContext(100);
        BigDecimal number = BigDecimal.valueOf(x+1);
        BigDecimal result = number.sqrt(mc).subtract(BigDecimal.valueOf(1));
        System.out.println(result);
        return result.doubleValue();
    }

    @Override
    public double mean(String town, String strng) {
        if (townInString(town, strng)) return -1;
        for (String s : List.of(strng.split("\n"))) {
            if (s.contains(town)) {
                return Arrays.stream(s.replaceAll("[^0-9.]", " ").trim().replaceAll(" +", " ").trim().split(" ")).mapToDouble(Double::parseDouble).boxed().toList().stream().mapToDouble(a -> a).average().getAsDouble();
            }
        }
        return -1;
    }

    @Override
    public double variance(String town, String strng) {
        if (townInString(town, strng)) return -1;
        double average = mean(town, strng);
        double avgDisp = 0;
        for (String s : List.of(strng.split("\n"))) {
            if (s.contains(town)) {
                for (double number : Arrays.stream(s.replaceAll("[^0-9.]", " ").trim().replaceAll(" +", " ").trim().split(" ")).mapToDouble(Double::parseDouble).boxed().toList()) {
                    avgDisp += Math.pow(number - average, 2);
                }
                return avgDisp/12;
            }
        }
        return -1;
    }

    private static boolean townInString(String town, String strng) {
        List<String> towns = new ArrayList<>();
        for (String s : List.of(strng.split("\n"))) {
            towns.add(s.split(":")[0]);
        }
        return !towns.contains(town);
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if(toFind.length() == 0){
            return "";
        }
        int j = 0;
        List<String> matches = Arrays.stream(resultSheet.split(",")).toList();
        int wins = 0, draws = 0, loses = 0, scored = 0, conceded = 0, points = 0;
        int counter = 0;
        String tempTeam = "";
        List<String> matchArray;
        List<Integer>  matchScore = new ArrayList<>();
        List<String> matchMembers = new ArrayList<>();
        StringBuilder builder = new StringBuilder(toFind + ":");
        for (String match : matches) {
            if(match.contains(toFind)){
                matchArray = Arrays.stream(match.split(" ")).toList();
                for(int i = 0; i < matchArray.size(); i++) {
                    if(matchArray.get(i).matches("-?\\d+(\\.\\d+)?")){
                        if(matchArray.get(i).contains(".")){
                            return "Error(float number):" + match;
                        } else {
                            while(j < counter){
                                tempTeam += matchArray.get(j) + " ";
                                if(j == counter - 1){
                                    j = i;
                                }
                                j++;
                            }
                            matchMembers.add(tempTeam.trim());
                            matchScore.add(Integer.valueOf(matchArray.get(i)));
                            tempTeam = "";
                        }
                    }
                    counter++;
                }
                if(matchMembers.contains(toFind)){
                    int ourTeamNum = matchMembers.indexOf(toFind);
                    int enemyTeamNum = 1;
                    if(matchMembers.indexOf(toFind) == 1){
                        enemyTeamNum = 0;
                    }

                    if(matchScore.get(ourTeamNum) > matchScore.get(enemyTeamNum)){
                        wins++;
                        scored += matchScore.get(ourTeamNum);
                        conceded +=matchScore.get(enemyTeamNum);
                        points += 3;
                    } else if (matchScore.get(ourTeamNum) < matchScore.get(enemyTeamNum)) {
                        loses++;
                        scored += matchScore.get(ourTeamNum);
                        conceded +=matchScore.get(enemyTeamNum);
                    } else {
                        points++;
                        draws++;
                        scored += matchScore.get(ourTeamNum);
                        conceded +=matchScore.get(enemyTeamNum);
                    }
                    counter = 0;
                    matchMembers.clear();
                    matchScore.clear();
                    j=0;
                } else {
                    counter = 0;
                    matchMembers.clear();
                    matchScore.clear();
                    j=0;
                }


            }

        }
        if(wins == 0 && draws == 0 && loses == 0){
            return toFind + ":This team didn't play!";
        }
        return builder.append("W="+wins+";D="+draws+";L="+loses+";Scored="+scored+";Conceded="+conceded+";Points="+points).toString();
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOfArt == null || lstOfArt.length == 0 || lstOf1stLetter == null || lstOf1stLetter.length == 0){
            return "";
        }
        Map<Character, Integer> resultMap = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        for (String s : lstOfArt) {
            if (!resultMap.containsKey(s.charAt(0))) {
                resultMap.put(s.charAt(0), Integer.parseInt(s.replaceAll("[^0-9]", "")));
            } else {
                resultMap.put(s.charAt(0), Integer.parseInt(s.replaceAll("[^0-9]", "")) + resultMap.get(s.charAt(0)));
            }
        }
        for(String x : lstOf1stLetter){
            if(resultMap.containsKey(x.charAt(0))){
                result.append("(").append(x.charAt(0)).append(" : ").append(resultMap.get(x.charAt(0))).append(") - ");
            } else {
                result.append("(").append(x.charAt(0)).append(" : ").append(0).append(") - ");
            }
        }
        return result.delete(result.length() - 3, result.length()).toString();
    }
}
