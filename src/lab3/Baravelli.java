package lab3;

// Clasa Baravelli - cutie în formă de cilindru
public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    // Constructor fără parametri
    public Baravelli() {
    }

    // Constructor care inițializează membrii
    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin); // Apelăm constructorul clasei de bază
        this.radius = radius;
        this.height = height;
    }

    // Suprascrierea metodei getVolume() pentru a calcula volumul specific cutiei Baravelli
    @Override
    public float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }

    // Suprascrierea metodei toString() pentru a utiliza implementarea din clasa de bază și a returna un mesaj formatat specific cutiei Baravelli
    @Override
    public String toString() {
        return super.toString(); // Folosim implementarea metodei toString() din clasa de bază
    }

    // Metoda pentru a afișa dimensiunile razei și înălțimii pentru cutia de tip Baravelli
    public void printBaravelliDim() {
        System.out.println("Baravelli dimensions: Radius = " + radius + ", Height = " + height);
    }
}