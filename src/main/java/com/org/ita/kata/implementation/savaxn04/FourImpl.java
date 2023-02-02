package com.org.ita.kata.implementation.savaxn04;

import com.org.ita.kata.Four;

import java.util.ArrayList;
import java.util.Arrays;

public class FourImpl implements Four {
    private final ArrayList<String> achievements;
    private final ArrayList<String> ranks = new ArrayList<>(Arrays.asList("Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest"));
    private int level;
    private int experience;
    private String rank;

    public FourImpl() {
        this.level = 1;
        this.experience = 100;
        this.rank = ranks.get(0);
        this.achievements = new ArrayList<String>();
    }

    public String battle(int level) {
        if (level > 0 && level <= 100) {
            if (this.level == level) {
                this.experience += 10;
                this.level = this.experience / 100;
                this.rank = ranks.get(this.level / 10);
                return "A good fight";
            } else if (this.level - 1 == level) {
                this.experience += 5;
                if (this.level <= 100) {
                    this.level = this.experience / 100;
                }
                this.rank = ranks.get(this.level / 10);
                return "A good fight";
            } else if (this.level - 2 >= level || ranks.indexOf(this.rank) > ranks.indexOf(ranks.get((level / 10)))) {
                return "Easy fight";
            } else if ((level - this.level) < 5 || ranks.indexOf(this.rank) >= ranks.indexOf(ranks.get((level / 10)))) {
                this.experience += 20 * (level - this.level) * (level - this.level);
                if (this.level <= 100) {
                    this.level = this.experience / 100;
                }
                this.rank = ranks.get(this.level / 10);
                return "An intense fight";
            } else {
                return "You've been defeated";
            }
        }
        return "Invalid level";
    }

    public String training(String train, int experience, int level) {
        if (this.level >= level) {
            if (this.experience + experience >= 10000) {
                this.experience = 10000;
            } else {
                this.experience += experience;
            }
            this.level = Math.min(this.experience / 100, 100);
            this.rank = ranks.get(this.level / 10);
            this.achievements.add(train);
            return train;
        }
        return "Not strong enough";
    }

    public int level() {
        return level;
    }

    public int experience() {
        return experience;
    }

    public String rank() {
        return rank;
    }

    public ArrayList<String> achievements() {
        return achievements;
    }
}
