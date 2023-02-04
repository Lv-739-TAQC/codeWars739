package com.org.ita.kata.providers;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

import static com.org.ita.kata.providers.StudentProvider.combineDataWithStudent;

public class DataProviderFour {

    @DataProvider(name = "dpWarriorFirst")
    public static Object[][] dpWarriorFirst(Method method) {
        Object[][] data;
        switch (method.getName()) {
            case "testLevel1":
                data = new Object[][]{{1}};
                break;
            case "testExperience1":
                data = new Object[][]{{100}};
                break;
            case "testRank1":
                data = new Object[][]{{"Pushover"}};
                break;
            default:
                data = new Object[][]{{new ArrayList<String>()}};
                break;
        }
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpWarriorSecond")
    public static Object[][] dpWarriorSecond(Method method) {
        Object[][] data;
        switch (method.getName()) {
            case "testLevel2":
                data = new Object[][]{{91}};
                break;
            case "testExperience2":
                data = new Object[][]{{9100}};
                break;
            case "testRank2":
                data = new Object[][]{{"Master"}};
                break;
            default:
                data = new Object[][]{{List.of("Defeated Chuck Norris")}};
                break;
        }
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpWarriorBattle")
    public static Object[][] dpWarriorBattle() {
        Object[][] data = new Object[][]{
                {"Invalid level", -20},
                {"Invalid level", 0},
                {"Invalid level", 101},
                {"Invalid level", 200},
                {"Easy fight", 87},
                {"Easy fight", 88},
                {"Easy fight", 89},
                {"A good fight", 90},
                {"A good fight", 91},
                {"An intense fight", 92},
                {"An intense fight", 93},
                {"An intense fight", 94},
                {"An intense fight", 95},
                {"You've been defeated", 100},
        };
        return combineDataWithStudent(data);
    }

    @DataProvider(name = "dpWarriorTraining")
    public static Object[][] dpWarriorTraining() {
        Object[][] data = new Object[][]{
                {"Defeated Chuck Norris", "Defeated Chuck Norris", 9000, 1},
                {"Do the Hookie Pookie", "Do the Hookie Pookie", 8500, 1},
                {"Not strong enough", "Defeated Chuck Norris", 9000, 2},
                {"Not strong enough", "Do the Hookie Pookie", 8500, 4},
        };
        return combineDataWithStudent(data);
    }
}
