package com.org.ita.kata.implementation.DenisPitsul;

import com.org.ita.kata.Four;

import java.util.ArrayList;
import java.util.List;

public class FourImpl implements Four {
    private final List<String> achievements = new ArrayList<>();
    private int experience = 100;

    public int level() {
        return experience / 100;
    }

    public int experience() {
        return experience;
    }

    public String rank() {
        if (level() >= 1 && level() < 10)
            return "Pushover";
        else if (level() >= 10 && level() < 20)
            return "Novice";
        else if (level() >= 20 && level() < 30)
            return "Fighter";
        else if (level() >= 30 && level() < 40)
            return "Warrior";
        else if (level() >= 40 && level() < 50)
            return "Veteran";
        else if (level() >= 50 && level() < 60)
            return "Sage";
        else if (level() >= 60 && level() < 70)
            return "Elite";
        else if (level() >= 70 && level() < 80)
            return "Conqueror";
        else if (level() >= 80 && level() < 90)
            return "Champion";
        else if (level() >= 90 && level() < 100)
            return "Master";
        else
            return "Greatest";
    }

    public List<String> achievements() {
        return achievements;
    }

    public String training(String description, int experiencePoints, int minLevel) {
        if (level() >= minLevel) {
            experience += experiencePoints;
            if (experience > 10000)
                experience = 10000;
            achievements.add(description);
            return description;
        } else
            return "Not strong enough";
    }

    public String battle(int enemyLevel) {
        String resultOfBattle = "";
        if (enemyLevel < 1 || enemyLevel > 100)
            return "Invalid level";

        if (level() == enemyLevel) {
            experience += 10;
            resultOfBattle = "A good fight";
        } else if (level() - enemyLevel == 1) {
            experience += 5;
            resultOfBattle = "A good fight";
        } else if (level() - enemyLevel >= 2) {
            resultOfBattle = "Easy fight";
        } else if (enemyLevel - level() >= 5 && enemyLevel / 10 > level() / 10) {
            resultOfBattle = "You've been defeated";
        } else {
            int diff = enemyLevel - level();
            experience += 20 * diff * diff;
            resultOfBattle = "An intense fight";
        }
        if (experience > 10000)
            experience = 10000;
        return resultOfBattle;
    }
}
