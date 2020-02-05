package com.hello;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    @Test
    public void checkLeapYear() {
        LeapYear checkLeapYear = new LeapYear();

        boolean result = checkLeapYear.isLeapYear(2012);
        assertTrue(result);

        result = checkLeapYear.isLeapYear(1992);
        assertTrue(result);
    }

    @Test
    public void checkLeapYearOn100YearInterval() {
        LeapYear checkLeapYear = new LeapYear();

        boolean result = checkLeapYear.isLeapYear(2100);
        assertFalse(result);

        result = checkLeapYear.isLeapYear(1700);
        assertFalse(result);

        result = checkLeapYear.isLeapYear(1800);
        assertFalse(result);

        result = checkLeapYear.isLeapYear(1900);
        assertFalse(result);
    }

    @Test
    public void checkLeapYearOn400YearInterval() {
        LeapYear checkLeapYear = new LeapYear();

        boolean result = checkLeapYear.isLeapYear(2000);
        assertTrue(result);

        result = checkLeapYear.isLeapYear(1600);
        assertTrue(result);

        result = checkLeapYear.isLeapYear(2400);
        assertTrue(result);
    }

    @Test
    public void checkNotLeapYear() {
        LeapYear checkLeapYear = new LeapYear();

        boolean result = checkLeapYear.isLeapYear(2019);
        assertFalse(result);

        result = checkLeapYear.isLeapYear(2013);
        assertFalse(result);
    }
}
