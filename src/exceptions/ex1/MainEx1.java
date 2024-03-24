package com.oop_pub.exceptions.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx1 {
    private static void readAndPrintLine() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine(); // Citirea unei linii de la stdin
            System.out.println("Linia citită: " + line); // Afișarea liniei citite
        } catch (IOException e) {
            System.err.println("A apărut o excepție la citirea sau afișarea liniei: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readAndPrintLine();
    }
}
