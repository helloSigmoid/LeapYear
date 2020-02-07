package com.hello;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputFromFile {
    public int getYear() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        return Integer.parseInt(br.readLine());
    }
}
