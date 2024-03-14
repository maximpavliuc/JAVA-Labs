package lab1.arrays;

import java.util.Random;

public class MyArrayListUsage {
    public static void main(String[] args) {
        // Inițializare cu o capacitate de 5 elemente
        MyArrayList myList = new MyArrayList(5);

        // Inserarea a 10 elemente aleatoare utilizând doar metoda add
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            float randomValue = random.nextFloat() * 100; // Generare valoare aleatoare între 0 și 100
            myList.add(randomValue);
        }

        // Afișarea listei
        System.out.println("Lista inițială:");
        System.out.println(myList);

        // Căutarea a 5 valori aleatoare în vector
        System.out.println("\nCăutarea a 5 valori aleatoare în vector:");
        for (int i = 0; i < 5; i++) {
            float randomValueToSearch = random.nextFloat() * 100; // Generare valoare aleatoare pentru căutare
            boolean contains = myList.contains(randomValueToSearch);
            System.out.println("Valoarea " + randomValueToSearch + " este prezentă în listă: " + contains);
        }

        // Eliminarea a 5 valori aleatoare din vector
        System.out.println("\nEliminarea a 5 valori aleatoare din vector:");
        for (int i = 0; i < 5; i++) {
            int randomIndexToRemove = random.nextInt(myList.size()); // Generare index aleatoriu pentru eliminare
            System.out.println("Valoarea eliminată de la indexul " + randomIndexToRemove + " este: " + myList.get(randomIndexToRemove));
            myList.remove(randomIndexToRemove);
        }

        // Afișarea listei după eliminare
        System.out.println("\nLista după eliminare:");
        System.out.println(myList);
    }
}
