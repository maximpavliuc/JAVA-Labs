package lab1.arrays;

import java.util.Arrays;

public class MyArrayList {
    private float[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor fara parametri
    public MyArrayList() {
        array = new float[DEFAULT_CAPACITY];
        size = 0;
    }

    // Constructor cu un parametru pentru dimensiunea initiala
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Dimensiunea initiala nu poate fi negativa: " + initialCapacity);
        }
        array = new float[initialCapacity];
        size = 0;
    }

    // Metoda pentru adaugarea unei valori la finalul vectorului
    public void add(float value) {
        if (size == array.length) {
            // Redimensionare automată la o capacitate dublă
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
        array[size++] = value;
    }

    // Metoda pentru verificarea daca o valoare exista in vector
    public boolean contains(float value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    // Metoda pentru eliminarea unei valori la un anumit index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indexul este invalid: " + index);
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Metoda pentru a obtine valoarea de la un anumit index
    public float get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indexul este invalid: " + index);
        }
        return array[index];
    }

    // Metoda pentru a obtine numarul de elemente din vector
    public int size() {
        return size;
    }

    // Metoda pentru a returna o reprezentare a vectorului sub forma de string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}