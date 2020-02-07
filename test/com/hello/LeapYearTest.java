package com.hello;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LeapYearTest {

    LeapYear leapYear;

    @Mock
    InputFromFile inputFromFile;
    @Before
    public void mockFun() {
        inputFromFile = mock(InputFromFile.class);
        leapYear = new LeapYear();
        leapYear.setInputFromFile(inputFromFile);
    }

    @Test
    public void testYearValueFromFile() throws IOException {
        when(inputFromFile.getYear()).thenReturn(2002);
        boolean result = leapYear.fun();
        assertFalse(result);
    }

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
