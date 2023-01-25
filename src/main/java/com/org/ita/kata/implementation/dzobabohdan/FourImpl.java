package com.org.ita.kata.implementation.dzobabohdan;

import com.org.ita.kata.Four;

import java.util.ArrayList;
import java.util.List;

public class FourImpl implements Four {

    // info
    enum Rank {
        Pushover(0),
        Novice(10),
        Fighter(20),
        Warrior(30),
        Veteran(40),
        Sage(50),
        Elite(60),
        Conqueror(70),
        Champion(80),
        Master(90),
        Greatest(100);

        public final int rank;

        public static Rank getByLevel(int level) {

            while (level % 10 != 0) level--;
            for (Rank r: values()) {
                if (r.getRank() == level) {
                    return r;
                }
            }
            return null;
        }

        private Rank(int rank) {
            this.rank = rank;
        }

        public int getRank() {
            return rank;
        }
    }

    private int level = 1;
    private Rank rank;
    private int exp = 100;
    private final List<String> achievements = new ArrayList<>();

    // getters

    public int level() {
        level = exp/100;
        if (level > 100) level = 100;
        return level;
    }

    public int experience() {
        if (exp > 10000) {this.exp = 10000;}
        return exp;
    }

    public String rank() {
        this.rank = Rank.getByLevel(level());
        return rank.toString();
    }

    public List<String> achievements() {
        return achievements;
    }

    // fighting system

    public String training(String achievement, int exp, int level) {

        if (level <= level()) {
            achievements().add(achievement);
            this.exp = this.exp + exp;
            return achievement;
        }

        return "Not strong enough";
    }

    public String battle(int enemyLevel) {

        if (enemyLevel > 100 || enemyLevel < 1) return "Invalid level";

        if (enemyLevel - level() >= 5 && !Rank.getByLevel(enemyLevel).equals(Rank.getByLevel(level()))) {
            return "You've been defeated";
        }

        if (level() - enemyLevel >= 2) {return "Easy fight";}

        int dif = enemyLevel - level();
        switch (dif) {
            case (-1):
                this.exp = exp + 5;
                return "A good fight";
            case (0):
                this.exp = exp + 10;
                return "A good fight";
            default:
                this.exp = exp + 20 * dif * dif;
                return "An intense fight";
        }
    }

}
