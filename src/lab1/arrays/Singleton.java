package lab1.arrays;

public class Singleton {
    // Singura instanță statică
    private static Singleton instance;

    // Constructor privat pentru a împiedica crearea de instanțe directe
    private Singleton() {}

    // Metodă publică pentru accesarea instanței
    public static Singleton getInstance() {
        // Verificăm dacă instanța nu există și o creăm la prima apelare
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}