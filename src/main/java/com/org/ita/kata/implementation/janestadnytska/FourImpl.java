package com.org.ita.kata.implementation.janestadnytska;

import com.org.ita.kata.Four;

import java.util.ArrayList;
import java.util.List;

public class FourImpl implements Four {
    private final String[] RANKINGS = {"Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest"};
    private static final String[] FEEDBACKABOUTFIGHT = new String[] { "Easy fight", "A good fight", "An intense fight" };
    private int currentLevel = 1;
    private int currentExperience = 100;
    private ArrayList<String> achievement = new ArrayList<>();
    public int level() {
        return currentLevel;
    }
    public int experience() {
        return currentExperience;
    }
    public String rank() {
        return RANKINGS[currentLevel / 10];
    }
    public List<String> achievements() {
        return achievement;
    }
    public String training(String description, int trainingExperience, int trainingLevel) {
        if (currentLevel >= trainingLevel) {
            currentExperience += trainingExperience;
            if (currentExperience > 10000)
                currentExperience = 10000;
            currentLevel = currentExperience / 100;
            achievement.add(description);
            return description;
        } else {
            return "Not strong enough";
        }
    }
    public String battle(int opponentLevel) {
        if (opponentLevel < 1 || opponentLevel > 100)
            return "Invalid level";
        if (currentLevel >= opponentLevel + 2)
            return FEEDBACKABOUTFIGHT[0];
        else if ((currentLevel == opponentLevel) || (currentLevel == (opponentLevel + 1))) {
            if (currentLevel == opponentLevel) {
                currentExperience += 10;
                currentLevel = currentExperience / 100;
            } else {
                currentExperience += 5;
                currentLevel = currentExperience / 100;
            }
            if (currentExperience > 10000) {
                currentExperience = 10000;
            }
            return FEEDBACKABOUTFIGHT[1];
        } else {
            int difference = opponentLevel - currentLevel;
            int opponentRanking = opponentLevel / 10;
            int ranking = currentLevel / 10;
            int rankDifference = opponentRanking - ranking;
            if (rankDifference >= 1 && difference >= 5)
                return "You've been defeated";
            else {
                currentExperience += (20 * difference * difference);
                if (currentExperience > 10000)
                    currentExperience = 10000;
                currentLevel = currentExperience / 100;
                return FEEDBACKABOUTFIGHT[2];
            }
        }
    }
}
