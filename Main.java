package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            Number n = new Number("C:\\Users\\mihai\\OneDrive\\Desktop\\nimbz.xlsx", "C:\\Users\\mihai\\OneDrive\\Desktop\\dzd.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}