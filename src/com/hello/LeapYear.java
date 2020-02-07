package com.hello;

import java.io.IOException;

public class LeapYear {

    private InputFromFile inputFromFile;

    public void setInputFromFile(InputFromFile inputFromFile) {
        this.inputFromFile = inputFromFile;
    }

    public boolean fun() throws IOException {
        int year = inputFromFile.getYear();

        return isLeapYear(year);
    }

    public boolean isLeapYear(int year) {
        if(year % 400 == 0) {
            return true;
        } else if(year % 100 == 0) {
            return false;
        } else if(year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
