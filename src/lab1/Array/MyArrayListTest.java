package lab1.Array;

package arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        // Creăm o instanță a clasei MyArrayList cu o capacitate inițială de 3
        MyArrayList list = new MyArrayList(3);

        // Adăugăm 3 elemente la listă
        list.add(10.5f);
        list.add(20.3f);
        list.add(30.7f);

        // Testăm metoda get pentru a verifica dacă întoarce valorile corecte
        System.out.println("Elementul de la indexul 0 este: " + list.get(0)); // Așteptat: 10.5
        System.out.println("Elementul de la indexul 1 este: " + list.get(1)); // Așteptat: 20.3
        System.out.println("Elementul de la indexul 2 este: " + list.get(2)); // Așteptat: 30.7
    }
}
