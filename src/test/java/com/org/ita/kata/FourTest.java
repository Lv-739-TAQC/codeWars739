package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderFour;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FourTest extends DataProviderFour {

    /**
     * Test the initialized warrior (The first warrior)
     */
    @Test(dataProvider = "dpWarriorFirst")
    public void testLevel1(StudentRealisation studentRealisation, int expectedResult) {
        Assert.assertEquals(studentRealisation.implementationFourKata().level(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorFirst")
    public void testExperience1(StudentRealisation studentRealisation, int expectedResult) {
        Assert.assertEquals(studentRealisation.implementationFourKata().experience(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorFirst")
    public void testRank1(StudentRealisation studentRealisation, String expectedResult) {
        Assert.assertEquals(studentRealisation.implementationFourKata().rank(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorFirst")
    public void testAchievements1(StudentRealisation studentRealisation, List<String> expectedResult) {
        Assert.assertEquals(studentRealisation.implementationFourKata().achievements(), expectedResult);
    }

    /**
     * Test warrior after training (The second warrior)
     */
    @Test(dataProvider = "dpWarriorSecond")
    public void testLevel2(StudentRealisation studentRealisation, int expectedResult) {
        Four warrior2 = studentRealisation.implementationFourKata();
        warrior2.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warrior2.level(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorSecond")
    public void testExperience2(StudentRealisation studentRealisation, int expectedResult) {
        Four warrior2 = studentRealisation.implementationFourKata();
        warrior2.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warrior2.experience(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorSecond")
    public void testRank2(StudentRealisation studentRealisation, String expectedResult) {
        Four warrior2 = studentRealisation.implementationFourKata();
        warrior2.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warrior2.rank(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorSecond")
    public void testAchievements2(StudentRealisation studentRealisation, List<String> expectedResult) {
        Four warrior2 = studentRealisation.implementationFourKata();
        warrior2.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warrior2.achievements(), expectedResult);
    }

    /**
     * Test the battles of warrior
     */
    @Test(dataProvider = "dpWarriorBattle")
    public void testBattles(StudentRealisation studentRealisation, String expectedResult, int enemyLevel) {
        Four warriorForBattle = studentRealisation.implementationFourKata();
        warriorForBattle.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warriorForBattle.battle(enemyLevel), expectedResult);
    }

    /**
     * Test the trainings of warrior
     */
    @Test(dataProvider = "dpWarriorTraining")
    public void testTrainings(StudentRealisation studentRealisation,
                              String expectedResult,
                              String description,
                              int trainingExperience,
                              int trainingLevel) {
        Assert.assertEquals(
                studentRealisation.implementationFourKata().training(description, trainingExperience, trainingLevel),
                expectedResult
        );
    }
}
