package exceptions.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx1 {
    private static void readAndPrintLine() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("A apărut o excepție la citirea sau afișarea liniei:");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readAndPrintLine();
    }
}
