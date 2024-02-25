package lab1.Array;

public class Singleton {
    // Instanța Singleton
    private static Singleton instance;

    // Constructor privat pentru a împiedica crearea de instanțe noi
    private Singleton() {}

    // Metodă publică statică pentru a obține instanța Singleton
    public static Singleton getInstance() {
        // Dacă instanța nu a fost încă creată, o creăm
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
