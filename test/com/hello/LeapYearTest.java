package com.hello;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    @Test
    public void checkLeapYear() {
        LeapYear checkLeapYear = new LeapYear();
        boolean result = checkLeapYear.isLeapYear(1990);
        assertTrue(result);
    }
}
