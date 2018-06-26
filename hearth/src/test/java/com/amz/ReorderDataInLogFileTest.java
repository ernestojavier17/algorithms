package com.amz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReorderDataInLogFileTest {

    private ReorderDataInLogFile target;

    @Before
    public void setUp() {
        target = new ReorderDataInLogFile();
    }

    @Test
    public void solution1_test() {
        String[] logLines = new String[5];

        String l1 = "al 9 2 3 1";
        String l2 = "g1 Act car";
        String l3 = "zo 8 4 7";
        String l4 = "abl off key dog";
        String l5 = "a8 act zoo";

        logLines[0] = l1;
        logLines[1] = l2;
        logLines[2] = l3;
        logLines[3] = l4;
        logLines[4] = l5;

        target.solution1(logLines.length, logLines);
    }

    @Test
    public void onlyLetter_testOnlyLetters() {
        String word = "Act";
        Assert.assertTrue(target.onlyLetter(word));
    }

    @Test
    public void onlyLetter_testLettersAndNumbers() {
        String word = "Act1";
        Assert.assertFalse(target.onlyLetter(word));
    }

    @Test
    public void onlyLetter_testNumbers() {
        String word = "Act1";
        Assert.assertFalse(target.onlyLetter(word));
    }
}
