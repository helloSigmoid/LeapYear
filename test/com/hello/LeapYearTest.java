package com.hello;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class LeapYearTest {

    LeapYear leapYear, sLeapYear;

    @Mock
    InputFromFile inputFromFile;

    @Spy
    InputFromFile sInputFromFile;

    @Before
    public void mockFun() {
        inputFromFile = mock(InputFromFile.class);
        leapYear = new LeapYear();
        leapYear.setInputFromFile(inputFromFile);

        sInputFromFile = spy(new InputFromFile());
        sLeapYear = new LeapYear();
        sLeapYear.setInputFromFile(sInputFromFile);

    }

    @Test
    public void testYearValueFromFile() throws IOException {
        when(inputFromFile.getYear()).thenReturn(2002);
        boolean result = leapYear.fun();
        assertFalse(result);
    }

    @Test
    public void testyearValueFromFile2() throws IOException {
        doReturn(2002).when(sInputFromFile).getYear();
        boolean result = leapYear.fun();
        assertFalse(result);
    }

    @Test
    public void leapYear() {

        boolean result = leapYear.isLeapYear(2012);
        assertTrue(result);

        result = leapYear.isLeapYear(1992);
        assertTrue(result);
    }

    @Test
    public void leapYearOn100YearInterval() {

        boolean result = leapYear.isLeapYear(2100);
        assertFalse(result);

        result = leapYear.isLeapYear(1700);
        assertFalse(result);

        result = leapYear.isLeapYear(1800);
        assertFalse(result);

        result = leapYear.isLeapYear(1900);
        assertFalse(result);
    }

    @Test
    public void leapYearOn400YearInterval() {

        boolean result = leapYear.isLeapYear(2000);
        assertTrue(result);

        result = leapYear.isLeapYear(1600);
        assertTrue(result);

        result = leapYear.isLeapYear(2400);
        assertTrue(result);
    }

    @Test
    public void checkNotLeapYear() {

        boolean result = leapYear.isLeapYear(2019);
        assertFalse(result);

        result = leapYear.isLeapYear(2013);
        assertFalse(result);
    }
}
