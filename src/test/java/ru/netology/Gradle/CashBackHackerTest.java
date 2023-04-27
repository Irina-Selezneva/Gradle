package ru.netology.Gradle;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {

    CashBackHacker service = new CashBackHacker();

    @Test
    public void testRemain100() {

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test

    public void testRemain1000() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemain999() {
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void testRemain500() {
        int amount = 2500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void testRemainNull() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    }
