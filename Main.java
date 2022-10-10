package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            Num n = new Num("C:\\Users\\mihai\\OneDrive\\Desktop\\nimbz.xlsx", "C:\\Users\\mihai\\OneDrive\\Desktop\\dzd.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
