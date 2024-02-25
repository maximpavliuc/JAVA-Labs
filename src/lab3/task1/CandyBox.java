package lab3.task1;

public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox() {
        // Constructor fără parametri
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Flavor: " + flavor + ", Origin: " + origin;
    }

    public static void main(String[] args) {
        CandyBox candyBox = new CandyBox("Chocolate", "Switzerland");
        System.out.println(candyBox.toString());
    }
}
