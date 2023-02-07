package com.org.ita.kata.implementation.kapustinIlya;

import com.org.ita.kata.Four;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class FourImpl implements Four {

		  private final int MAX_LEVEL = 100;
	    private final int MAX_EXPERIENCE = 10000;
	  
	    private int level = 1;
	    private int experience = 100;
	  
	    private String easyFight = "Easy fight";
	    private String goodFight = "A good fight";
	    private String intenseFight = "An intense fight";
	    private String defeated = "You've been defeated";

	    private List<String> ranks = Arrays.asList("Pushover", "Novice", "Fighter", 
	                                               "Warrior", "Veteran","Sage", 
	                                               "Elite", "Conqueror", "Champion", 
	                                               "Master", "Greatest");
	  
	    private List<String> currentAchievements = new ArrayList<>();

	    public int level() {
	        return level;
	    }

	    public int experience() {
	        return experience;
	    }

	    public List<String> achievements() {
	        return currentAchievements;
	    }

	    public String rank() {
	        return ranks.get(level / 10);
	    }

	    public void updateLevel(int newExperience) {
	        experience += newExperience;
	        if (experience > MAX_EXPERIENCE) {
	            experience = MAX_EXPERIENCE;
	        }
	        level = experience / 100;
	     }

	    public String training(String enemy, int enemyExperience, int enemyLevel) {
	        if (enemyLevel > level) {
	            return "Not strong enough";
	        }
	        updateLevel(enemyExperience);
	        currentAchievements.add(enemy);
	        return enemy;
	    }

	    public String battle(int enemyLevel) {
	        
	        System.out.println (level + "///" + experience + "///" + enemyLevel);
	        
	        String resultOfBattle;
	        if(enemyLevel < 1 || enemyLevel > 100)
	            return "Invalid level";

	        if(level == enemyLevel) {
	            updateLevel(10);
	            resultOfBattle = "A good fight";
	        }
	        else if(level- enemyLevel == 1) {
	            updateLevel(5);
	            resultOfBattle = "A good fight";
	        }
	        else if(level - enemyLevel >= 2) {
	            resultOfBattle = "Easy fight";
	        }
	        else if((enemyLevel - level >= 5) && ((enemyLevel / 10) > (level / 10))) {
	            resultOfBattle = "You've been defeated";
	        }
	        else {
	            int diff = enemyLevel - level;
	            updateLevel(20 * diff * diff);
	            resultOfBattle = "An intense fight";
	        }
	        return resultOfBattle;
	    }
}
