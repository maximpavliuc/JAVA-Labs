//package lab1.Array;
//
//package arrays;
//
//import java.util.Random;
//
//public class MyArrayListUsage {
//    public static void main(String[] args) {
//        // Inițializăm o instanță a clasei MyArrayList cu o capacitate inițială de 5
//        MyArrayList list = new MyArrayList(5);
//
//        // Adăugăm 10 elemente aleatoare în listă
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            list.add(random.nextFloat() * 100); // Adaugă un număr aleatoriu între 0 și 100
//        }
//
//        // Căutăm 5 valori aleatoare în listă
//        for (int i = 0; i < 5; i++) {
//            float valueToFind = random.nextFloat() * 100; // Generează o valoare aleatoare între 0 și 100
//            if (list.contains(valueToFind)) {
//                System.out.println("Valoarea " + valueToFind + " a fost găsită în listă.");
//            } else {
//                System.out.println("Valoarea " + valueToFind + " nu a fost găsită în listă.");
//            }
//        }
//
//        // Eliminăm 5 valori aleatoare din listă
//        for (int i = 0; i < 5; i++) {
//            int indexToRemove = random.nextInt(list.size()); // Generează un index aleatoriu între 0 și size-1
//            float removedValue = list.get(indexToRemove); // Obține valoarea de la indexul generat
//            list.remove(indexToRemove); // Elimină valoarea de la indexul generat
//            System.out.println("Valoarea " + removedValue + " a fost eliminată din listă.");
//        }
//    }
//}
