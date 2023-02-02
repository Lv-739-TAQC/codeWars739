package com.org.ita.kata.menus;

import com.org.ita.kata.Four;
import com.org.ita.kata.MenuNumber;
import com.org.ita.kata.students.delegator.StudentRealisationFactory;

import com.org.ita.kata.utils.SystemInput;

import java.util.HashMap;
import java.util.Map;

public class MenuFour implements MenuNumber {

    private StudentRealisationFactory studentRealisationFactory;
    private String allTasks = "1.) The Greatest Warrior";

    public MenuFour(StudentRealisationFactory studentRealisationFactory) {
        this.studentRealisationFactory = studentRealisationFactory;
    }

    @Override
    public Object whoImplemented() {
        return this.studentRealisationFactory.setUpImplementation().getClass();
    }

    public Four getStudentFourKataRealisation() {
        return this.studentRealisationFactory.setUpImplementation().implementationFourKata();
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

    public void getTheGreatestWarriorTask() {
        Four warrior = getStudentFourKataRealisation();

        System.out.println("This is [The Greatest Warrior] game !");
        System.out.println(getCharacteristics(warrior));

        System.out.println("> Train your warrior !");
        System.out.println("Enter description : ");
        String description = SystemInput.input.nextLine();
        System.out.println("Enter training experience : ");
        int trainingExperience = SystemInput.inputCorrectData();
        System.out.println("Enter training level : ");
        int trainingLevel = SystemInput.inputCorrectData();
        System.out.println("Training result : " + warrior.training(description, trainingExperience, trainingLevel));
        System.out.println(getCharacteristics(warrior));

        System.out.println("> Have a battle !");
        System.out.println("Enter enemy's level : ");
        int enemyLevel = SystemInput.inputCorrectData();
        System.out.println("Battle result : " + warrior.battle(enemyLevel));
        System.out.println(getCharacteristics(warrior));

        System.out.println("Wow, your warrior is on his way to success !");
    }

    @Override
    public void getAllTasks() {
        System.out.println("\n[IMPLEMENTED BY : " + whoImplemented() + "]\n");
        while (true) {
            System.out.println("[ALL TASKS]\n" + allTasks);
            System.out.println("2.) Go back\n");
            System.out.println("Enter number of task : ");
            String taskNumber = SystemInput.input.nextLine();
            switch (taskNumber) {
                case "1":
                    getTheGreatestWarriorTask();
                    break;
                case "2":
                    System.out.println(GO_BACK);
                    return;
                default:
                    System.out.println(INCORRECT_INPUT);
                    break;
            }
        }
    }
}
