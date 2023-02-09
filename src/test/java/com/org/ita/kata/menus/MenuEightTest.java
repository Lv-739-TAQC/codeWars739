package com.org.ita.kata.menus;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.*;

public class MenuEightTest {

    private static final String CRLF = "\r\n";

    @Test
    public void testUiKeepHydratedTaskCorrect() {
        String input = "1802.44" + CRLF;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputArray = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputArray));

        // invoke UI of getKeepHydratedTask() method :
        (new MenuUi()).getMenuEight().getKeepHydratedTask();

        String expectedOutput = "Enter time number : " + CRLF + "Liters = 901" + CRLF;

        Assert.assertEquals(outputArray.toString(), expectedOutput);
    }

    @Test
    public void testUiKeepHydratedTaskIncorrect() {
        String input1 = "testing" + CRLF + "14.64" + CRLF;
        System.setIn(new ByteArrayInputStream(input1.getBytes()));

        ByteArrayOutputStream outputArray = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputArray));

        // invoke UI of getKeepHydratedTask() method :
        (new MenuUi()).getMenuEight().getKeepHydratedTask();

        String expectedOutput = "Enter time number : " + CRLF
                + "The required type is [double]" + CRLF
                + "Liters = 7" + CRLF;

        Assert.assertEquals(outputArray.toString(), expectedOutput);
    }
}
