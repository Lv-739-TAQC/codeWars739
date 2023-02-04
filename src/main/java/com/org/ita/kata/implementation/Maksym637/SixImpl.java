package com.org.ita.kata.implementation.Maksym637;

import com.org.ita.kata.Six;

import java.util.*;

public class SixImpl implements Six {

    public static final String REGEX_WORDS = "[^a-zA-Z']+";
    public static final String ROUNDING_1 = "%.2f";

    public static final String ERROR_MESSAGE_1 = ":This team didn't play!";
    public static final String ERROR_MESSAGE_2 = "Error(float number):";

    public static String processingString(String string) {
        return string.replaceAll("([^\\n. \\da-zA-Z])", "")
                .replace("\n", " ")
                .replace("\r", "");
    }

    public static boolean invalidData(Map<String, List<Double>> citiesMap, String town) {
        return !(citiesMap.containsKey(town) && citiesMap.get(town).size() != 0);
    }

    public static Map<String, List<Double>> parseString(String data) {
        Map<String, List<Double>> citiesMap = new HashMap<>();

        String[] citiesRows = data.split("\n");

        for (String cityRow : citiesRows) {
            List<Double> cityRainfalls = new ArrayList<>();
            String city = cityRow.substring(0, cityRow.indexOf(":"));
            List<String> cityRainfallsString = Arrays.asList(cityRow.replace(city + ":", "").split(","));
            if (cityRainfallsString.size() == 12) {
                for (String cityRainfallString : cityRainfallsString) {
                    cityRainfalls.add(Double.parseDouble(Arrays.asList(cityRainfallString.split(" ")).get(1)));
                }
            }
            citiesMap.put(city, cityRainfalls);
        }
        return citiesMap;
    }

    public static boolean validateInput(String resultSheet, String toFind) {
        String updatedResultSheet = resultSheet.replaceAll(",", " ");
        List<String> resultSheetAll = Arrays.asList(updatedResultSheet.split(" "));
        List<String> toFindCommand = Arrays.asList(toFind.split(" "));
        return resultSheetAll.containsAll(toFindCommand);
    }

    public static boolean teamStartsFirst(String battles, String toFind) {
        return battles.indexOf(toFind) == 0;
    }

    public static int convertToInt(String number) {
        return Integer.parseInt(number);
    }

    @Override
    public long findNb(long m) {
        long result = 1;
        long check = 0;
        while (check <= m) {
            check += (long) Math.pow(result, 3);
            if (check == m) {
                return result;
            }
            result += 1;
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        List<String> digitsFromText = new ArrayList<>(Arrays.asList(processingString(book).split(" ")));
        List<String> wordsFromText = new ArrayList<>(List.of(processingString(book).split(REGEX_WORDS)));
        List<String> rows = new ArrayList<>();
        List<Double> prices = new ArrayList<>();

        for (int i = 0; i < wordsFromText.size(); i++) {
            digitsFromText.remove(wordsFromText.get(i));
        }

        wordsFromText.removeIf(String::isEmpty);
        digitsFromText.removeIf(String::isEmpty);

        for (int i = 0; i < digitsFromText.size(); i++) {
            if (i % 2 != 0) {
                rows.add(digitsFromText.get(i));
            } else {
                prices.add(Double.parseDouble(digitsFromText.get(i)));
            }
        }

        double totalExpense = 0;

        for (int i = 1; i < prices.size(); i++) {
            totalExpense += prices.get(i);
        }

        double averageExpense = totalExpense / (prices.size() - 1);

        StringBuilder tmpString = new StringBuilder();
        StringBuilder resString = new StringBuilder();

        double sum = 0;

        for (int i = 0; i < rows.size(); i++) {
            tmpString.append(rows.get(i))
                    .append(" ").append(wordsFromText.get(i)).append(" ")
                    .append(String.format(ROUNDING_1, prices.get(i + 1)))
                    .append(" Balance ")
                    .append(String.format(ROUNDING_1, (prices.get(0) - prices.get(i + 1) - sum)))
                    .append("\\r\\n");
            sum += prices.get(i + 1);
        }

        System.out.println(tmpString);

        resString.append("Original Balance: ")
                .append(String.format(ROUNDING_1, prices.get(0)))
                .append("\\r\\n")
                .append(tmpString)
                .append("Total expense  ")
                .append(String.format(ROUNDING_1, totalExpense))
                .append("\\r\\n")
                .append("Average expense  ")
                .append(String.format(ROUNDING_1, averageExpense));

        return resString.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        Map<String, List<Double>> citiesMap = parseString(strng);
        if (invalidData(citiesMap, town)) {
            return -1.0;
        }
        List<Double> rainfalls = citiesMap.get(town);
        double sum = 0, n = rainfalls.size(), mean = 0;
        for (Double rainfall : rainfalls) {
            sum += rainfall;
        }
        mean = sum / n;
        return mean;
    }

    @Override
    public double variance(String town, String strng) {
        Map<String, List<Double>> citiesMap = parseString(strng);
        if (invalidData(citiesMap, town)) {
            return -1.0;
        }
        List<Double> rainfalls = citiesMap.get(town);
        double sum = 0, n = rainfalls.size(), mean = mean(town, strng), variance = 0;
        for (Double rainfall : rainfalls) {
            sum += Math.pow(mean - rainfall, 2);
        }
        variance = sum / n;
        return variance;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        String[] listOfAllBattles = resultSheet.split(",");
        List<String> listOfOccurBattles = new ArrayList<>();
        int W, D, L, Scored, Conceded, Points;
        W = D = L = Scored = Conceded = Points = 0;

        if (toFind.isEmpty()) {
            return "";
        }

        if (!validateInput(resultSheet, toFind)
                || Arrays.asList(toFind.split(" ")).size() == 1) {
            return toFind + ERROR_MESSAGE_1;
        }

        for (String occurBattle : listOfAllBattles) {
            if (occurBattle.contains(toFind)) {
                listOfOccurBattles.add(occurBattle);
            }
        }

        for (String occurBattle : listOfOccurBattles) {
            List<String> battle = Arrays.asList(occurBattle.replace(toFind + " ", "").split(" "));
            if (teamStartsFirst(occurBattle, toFind)) {
                try {
                    int firstValue = convertToInt(battle.get(0));
                    int secondValue = convertToInt(battle.get(battle.size() - 1));
                    if (firstValue > secondValue) {
                        W += 1;
                        Points += 3;
                    } else if (firstValue < secondValue) {
                        L += 1;
                    } else {
                        D += 1;
                        Points += 1;
                    }
                    Conceded += secondValue;
                    Scored += firstValue;
                } catch (Exception e) {
                    return ERROR_MESSAGE_2 + occurBattle;
                }
            } else {
                try {
                    int firstValue = convertToInt(battle.get(battle.size() - 1));
                    int secondValue = convertToInt(battle.get(battle.size() - 2));
                    if (firstValue > secondValue) {
                        W += 1;
                        Points += 3;
                    } else if (firstValue < secondValue) {
                        L += 1;
                    } else {
                        D += 1;
                        Points += 1;
                    }
                    Conceded += secondValue;
                    Scored += firstValue;
                } catch (Exception e) {
                    return ERROR_MESSAGE_2 + occurBattle;
                }
            }
        }
        return toFind + ":" + "W=" + W + ";D=" + D + ";L=" + L + ";Scored="
                + Scored + ";Conceded=" + Conceded + ";Points=" + Points;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String, Integer> dictionary = new HashMap<>();
        StringBuilder output = new StringBuilder();
        int sum = 0;

        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0) {
            return "";
        }

        for (String letter : lstOf1stLetter) {
            dictionary.put(letter, 0);
            for (String label : lstOfArt) {
                String[] tmpArr = label.split(" ");
                if (letter.equals(label.substring(0, 1))) {
                    sum += Integer.parseInt(tmpArr[tmpArr.length - 1]);
                    dictionary.put(letter, sum);
                }
            }
            sum = 0;
        }

        for (Map.Entry<String, Integer> pair : dictionary.entrySet()) {
            output.append("(").append(pair.getKey()).append(" : ")
                    .append(pair.getValue()).append(")").append(" - ");
        }

        output.delete(output.length() - 3, output.length());

        return output.toString();
    }
}
