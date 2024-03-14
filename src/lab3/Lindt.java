package lab3;

// Clasa Lindt - cutie în formă de paralelipiped dreptunghic
public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    // Constructor fără parametri
    public Lindt() {
    }

    // Constructor care inițializează membrii
    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin); // Apelăm constructorul clasei de bază
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Suprascrierea metodei getVolume() pentru a calcula volumul specific cutiei Lindt
    @Override
    public float getVolume() {
        return length * width * height;
    }

    // Suprascrierea metodei toString() pentru a utiliza implementarea din clasa de bază și a returna un mesaj formatat specific cutiei Lindt
    @Override
    public String toString() {
        return super.toString(); // Folosim implementarea metodei toString() din clasa de bază
    }

    // Metoda pentru a afișa dimensiunile lungimii, lățimii și înălțimii pentru cutia de tip Lindt
    public void printLindtDim() {
        System.out.println("Lindt dimensions: Length = " + length + ", Width = " + width + ", Height = " + height);
    }
}