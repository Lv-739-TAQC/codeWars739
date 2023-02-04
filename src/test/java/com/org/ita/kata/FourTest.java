package com.org.ita.kata;

import com.org.ita.kata.providers.DataProviderFour;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FourTest {

    /**
     * Test the initialized warrior (Warrior first)
     */
    @Test(dataProvider = "dpWarriorFirst", dataProviderClass = DataProviderFour.class)
    public void testLevel1(StudentRealisation studentRealisation, int expectedResult) {
        Assert.assertEquals(studentRealisation.implementationFourKata().level(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorFirst", dataProviderClass = DataProviderFour.class)
    public void testExperience1(StudentRealisation studentRealisation, int expectedResult) {
        Assert.assertEquals(studentRealisation.implementationFourKata().experience(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorFirst", dataProviderClass = DataProviderFour.class)
    public void testRank1(StudentRealisation studentRealisation, String expectedResult) {
        Assert.assertEquals(studentRealisation.implementationFourKata().rank(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorFirst", dataProviderClass = DataProviderFour.class)
    public void testAchievements1(StudentRealisation studentRealisation, List<String> expectedResult) {
        Assert.assertEquals(studentRealisation.implementationFourKata().achievements(), expectedResult);
    }

    /**
     * Test warrior after training (Warrior second)
     */
    @Test(dataProvider = "dpWarriorSecond", dataProviderClass = DataProviderFour.class)
    public void testLevel2(StudentRealisation studentRealisation, int expectedResult) {
        Four warrior2 = studentRealisation.implementationFourKata();
        warrior2.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warrior2.level(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorSecond", dataProviderClass = DataProviderFour.class)
    public void testExperience2(StudentRealisation studentRealisation, int expectedResult) {
        Four warrior2 = studentRealisation.implementationFourKata();
        warrior2.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warrior2.experience(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorSecond", dataProviderClass = DataProviderFour.class)
    public void testRank2(StudentRealisation studentRealisation, String expectedResult) {
        Four warrior2 = studentRealisation.implementationFourKata();
        warrior2.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warrior2.rank(), expectedResult);
    }

    @Test(dataProvider = "dpWarriorSecond", dataProviderClass = DataProviderFour.class)
    public void testAchievements2(StudentRealisation studentRealisation, List<String> expectedResult) {
        Four warrior2 = studentRealisation.implementationFourKata();
        warrior2.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warrior2.achievements(), expectedResult);
    }

    /**
     * Test the battles of warrior
     */
    @Test(dataProvider = "dpWarriorBattle", dataProviderClass = DataProviderFour.class)
    public void testBattles(StudentRealisation studentRealisation, String expectedResult, int enemyLevel) {
        Four warriorForBattle = studentRealisation.implementationFourKata();
        warriorForBattle.training("Defeated Chuck Norris", 9000, 1);
        Assert.assertEquals(warriorForBattle.battle(enemyLevel), expectedResult);
    }

    /**
     * Test the trainings of warrior
     */
}
