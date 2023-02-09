package com.org.ita.kata.implementation.Maksym637;

import com.org.ita.kata.Four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourImpl implements Four {

    private static final String Battle_Easy = "Easy fight";
    private static final String Battle_Good = "A good fight";
    private static final String Battle_Intense = "An intense fight";
    private static final String Battle_Defeated = "You've been defeated";

    private static final int MAX_LEVEL = 100;
    private static final int MAX_EXPERIENCE = 10000;
    private final List<String> currentAchievements = new ArrayList<>();
    private final List<String> ranks = Arrays.asList("Pushover", "Novice", "Fighter", "Warrior", "Veteran",
            "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest");
    private int currentLevel = 1;
    private int currentExperience = 100;

    public int level() {
        return Math.min(this.currentLevel, MAX_LEVEL);
    }

    public int experience() {
        return Math.min(this.currentExperience, MAX_EXPERIENCE);
    }

    public List<String> achievements() {
        return this.currentAchievements;
    }

    public String rank() {
        return ranks.get(this.currentLevel / 10);
    }

    public void updateLevel(int newExperience) {
        this.currentExperience += newExperience;
        if (this.currentExperience > MAX_EXPERIENCE) {
            this.currentExperience = MAX_EXPERIENCE;
        }
        this.currentLevel = this.currentExperience / 100;
    }

    public String training(String description, int trainingExperience, int trainingLevel) {
        if (trainingLevel > this.currentLevel) {
            return "Not strong enough";
        }
        this.updateLevel(trainingExperience);
        this.currentAchievements.add(description);
        return description;
    }

    public String battle(int enemyLevel) {
        String resultOfBattle = "";
        int diff = enemyLevel - this.currentLevel;

        if (enemyLevel < 1 || enemyLevel > 100) {
            return "Invalid level";
        }

        if (diff == 0) {
            this.updateLevel(10);
            resultOfBattle = Battle_Good;
        } else if (diff == -1) {
            this.updateLevel(5);
            resultOfBattle = Battle_Good;
        } else if (diff < -1) {
            this.updateLevel(0);
            resultOfBattle = Battle_Easy;
        } else if (diff >= 5 && enemyLevel / 10 > this.currentLevel / 10) {
            resultOfBattle = Battle_Defeated;
        } else {
            this.updateLevel(20 * diff * diff);
            resultOfBattle = Battle_Intense;
        }

        return resultOfBattle;
    }
}
