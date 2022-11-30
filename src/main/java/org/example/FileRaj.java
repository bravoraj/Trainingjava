package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRaj {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("Data.csv");
             BufferedReader br = new BufferedReader(reader)) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

}





















