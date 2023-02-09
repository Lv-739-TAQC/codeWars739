package com.org.ita.kata.menus;

import com.org.ita.kata.Four;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.Student;
import com.org.ita.kata.utils.NameMethod;

import java.util.HashMap;
import java.util.Map;

public class MenuFour extends MenuNumber {

    public MenuFour() {
    }

    public MenuFour(Student student) {
        super(student);
    }

    public String getCharacteristics(Four warrior) {
        Map<String, Object> aboutWarrior = new HashMap<>() {{
            put("level", warrior.level());
            put("experience", warrior.experience());
            put("rank", warrior.rank());
            put("achievements", warrior.achievements());
        }};

        return "Your current warrior : " + aboutWarrior;
    }

    @NameMethod(name = "The Greatest Warrior")
    public void getTheGreatestWarriorTask() {
        Four warrior = getStudentFourKataRealisation();

        System.out.println("This is [The Greatest Warrior] game !");
        System.out.println(getCharacteristics(warrior));

        System.out.println("> Train your warrior !");
        System.out.println("Enter description : ");
        String description = systemInput.input.nextLine();
        System.out.println("Enter training experience : ");
        int trainingExperience = systemInput.inputCorrectData();
        System.out.println("Enter training level : ");
        int trainingLevel = systemInput.inputCorrectData();
        System.out.println("Training result : " + warrior.training(description, trainingExperience, trainingLevel));
        System.out.println(getCharacteristics(warrior));

        System.out.println("> Have a battle !");
        System.out.println("Enter enemy's level : ");
        int enemyLevel = systemInput.inputCorrectData();
        System.out.println("Battle result : " + warrior.battle(enemyLevel));
        System.out.println(getCharacteristics(warrior));

        System.out.println("Wow, your warrior is on his way to success !");
    }
}
