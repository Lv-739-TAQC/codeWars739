package com.org.ita.kata;

import java.util.List;

public interface Four {
    int level();

    int experience();

    String rank();

    List<String> achievements();

    String training(String description, int trainingExperience, int trainingLevel);

    String battle(int enemyLevel);
}
