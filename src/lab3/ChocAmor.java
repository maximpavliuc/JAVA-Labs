package lab3;

// Clasa ChocAmor - cutie în formă de cub
public class ChocAmor extends CandyBox {
    private float length;

    // Constructor fără parametri
    public ChocAmor() {
    }

    // Constructor care inițializează membrii
    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin); // Apelăm constructorul clasei de bază
        this.length = length;
    }

    // Suprascrierea metodei getVolume() pentru a calcula volumul specific cutiei ChocAmor
    @Override
    public float getVolume() {
        return length * length * length;
    }

    // Suprascrierea metodei toString() pentru a utiliza implementarea din clasa de bază și a returna un mesaj formatat specific cutiei ChocAmor
    @Override
    public String toString() {
        return super.toString(); // Folosim implementarea metodei toString() din clasa de bază
    }

    // Metoda pentru a afișa dimensiunile lungimii pentru cutia de tip ChocAmor
    public void printChocAmorDim() {
        System.out.println("ChocAmor dimensions: Length = " + length);
    }
}