package lab1.arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        testGetMethod();
    }

    public static void testGetMethod() {
        MyArrayList myList = new MyArrayList();
        // Adăugăm 3 elemente în listă
        myList.add(10.5f);
        myList.add(20.3f);
        myList.add(30.8f);

        // Verificăm dacă valorile întoarse de metoda get corespund pozițiilor din vectorul intern
        if (myList.get(0) == 10.5f && myList.get(1) == 20.3f && myList.get(2) == 30.8f) {
            System.out.println("Metoda get a returnat valorile corect.");
        } else {
            System.out.println("Metoda get NU a returnat valorile corect.");
        }
    }
}