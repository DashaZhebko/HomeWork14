package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationsTest {

    Calculations calculation;

    @Before
    public void setUp() {
        calculation = new Calculations();
    }

    @After
    public void tearDown() {
        calculation = null;
    }

    @Test
    public void numJewelsInStonesInputNullJewelsAndStonesReturnedZero() {
        String jewels = null;
        String stones = null;

        int actual = calculation.numJewelsInStones(jewels, stones);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesInputNullJewelsReturnedZero() {
        String jewels = null;
        String stones = "aAAbbbb";

        int actual = calculation.numJewelsInStones(jewels, stones);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesInputNullStonesReturnedZero() {
        String jewels = "aA";
        String stones = null;

        int actual = calculation.numJewelsInStones(jewels, stones);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesInputEmptyJewelsReturnedZero() {
        String jewels = "";
        String stones = "aAAbbbb";

        int actual = calculation.numJewelsInStones(jewels, stones);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesInputEmptyStonesReturnedZero() {
        String jewels = "aA";
        String stones = "";

        int actual = calculation.numJewelsInStones(jewels, stones);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesInputEmptyJewelsAndStonesReturnedZero() {
        String jewels = "";
        String stones = "";

        int actual = calculation.numJewelsInStones(jewels, stones);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesInputCorrectReturnedZero() {
        String jewels = "abc";
        String stones = "frg";

        int actual = calculation.numJewelsInStones(jewels, stones);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesReturnedCorrectResult() {
        String jewels = "aA";
        String stones = "aAAbbbb";

        int actual = calculation.numJewelsInStones(jewels, stones);

        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsInputNullArrayReturnedZero() {
        int[] nums = null;

        int actual = calculation.numIdenticalPairs(nums);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsInputEmptyArrayReturnedZero() {
        int[] nums = new int[]{};

        int actual = calculation.numIdenticalPairs(nums);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsInputCorrectArrayReturnedCorrectResult() {
        int[] nums = new int[]{1, 1, 1, 1};

        int actual = calculation.numIdenticalPairs(nums);

        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsInputCorrectArrayReturnedZero() {
        int[] nums = new int[]{1, 2, 3};

        int actual = calculation.numIdenticalPairs(nums);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void maxNumberOfBalloonsInputCorrectTextReturnedCorrectResult() {
        String inputText = "nlaebolko";

        int result = calculation.maxNumberOfBalloons(inputText);

        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void maxNumberOfBalloonsInputTextNullReturnedZero() {
        String inputText = null;

        int result = calculation.maxNumberOfBalloons(inputText);

        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void maxNumberOfBalloonsInputEmptyTextReturnedZero() {
        String inputText = "";

        int result = calculation.maxNumberOfBalloons(inputText);

        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void maxNumberOfBalloonsInputCorrectTextReturnedZero() {
        String inputText = "dfdjfdfdf@%hgf";

        int actual = calculation.maxNumberOfBalloons(inputText);

        int expected = 0;
        assertEquals(expected, actual);
    }
}

