package com.org.ita.kata.implementation.IrenZh;

import com.org.ita.kata.Four;

import java.util.ArrayList;
import java.util.List;

public class FourImpl implements Four {
    final static private int MAX_LVL = 100,
            MAX_XPS = 10000,
            LVL_XP_RATIO = 100;

    final static private String[] RANKS = {"", "Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest"},
            STR_BATTLE = {"Easy fight", "A good fight", "An intense fight"};

    final static private String DEF_RET_ACHIEV = "Not strong enough",
            INVALID_BATTLE = "Invalid level",
            FAILED_BATTLE = "You've been defeated";
    private final List<String> achiev = new ArrayList<>();
    private int xps = LVL_XP_RATIO;

    public int experience() {
        return xps;
    }

    public int level() {
        return xps / LVL_XP_RATIO;
    }

    public String rank() {
        return RANKS[getRank(xps)];
    }

    public List<String> achievements() {
        return new ArrayList<>(achiev);
    }

    private int getRank(int xp) {
        return xp / 1000 + 1;
    }

    private void updateXps(int xp) {
        xps = Math.min(xps + xp, MAX_XPS);
    }


    public String battle(int oLvl) {

        if (oLvl < 1 || oLvl > MAX_LVL)
            return INVALID_BATTLE;

        int diff = oLvl - level();
        if (diff >= 5 && getRank(xps) < getRank(oLvl * LVL_XP_RATIO))
            return FAILED_BATTLE;

        int xpGain = diff > 0 ? 20 * diff * diff
                : Math.max(0, 10 + 5 * diff),
                iRet = diff == -1 ? 1
                        : diff < 0 ? 0
                        : diff > 0 ? 2 : 1;

        updateXps(xpGain);
        return STR_BATTLE[iRet];
    }

    public String training(String ach, int xpGain, int minLvl) {
        if (level() < minLvl) return DEF_RET_ACHIEV;
        updateXps(xpGain);
        achiev.add(ach);
        return ach;
    }
}
