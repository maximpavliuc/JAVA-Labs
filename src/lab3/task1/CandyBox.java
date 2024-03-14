//package lab3.task1;
//
//import java.util.Objects;
//
//public class CandyBox {
//    private String flavor;
//    private String origin;
//
//    public CandyBox() {
//        // Constructor fără parametri
//    }
//
//    public CandyBox(String flavor, String origin) {
//        this.flavor = flavor;
//        this.origin = origin;
//    }
//
//    public float getVolume() {
//        return 0;
//    }
//
//    @Override
//    public String toString() {
//        return "Flavor: " + flavor + ", Origin: " + origin;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        CandyBox other = (CandyBox) obj;
//        return Objects.equals(this.flavor, other.flavor) && Objects.equals(this.origin, other.origin);
//    }
//
//
//
//}
//public class Main {
//    public static void main(String[] args) {
//
//        CandyBox candyBox = new CandyBox("Chocolate", "Switzerland");
//        Lindt lindt = new Lindt("Chocolate", "Switzerland", 2.5f, 3.0f, 4.0f);
//        Baravelli baravelli = new Baravelli("Mint", "Italy", 1.5f, 5.0f);
//        ChocAmor chocAmor = new ChocAmor("Strawberry", "France", 2.0f);
//
//        System.out.println(candyBox.toString());
//        System.out.println(lindt);
//        System.out.println(baravelli);
//        System.out.println(chocAmor);
//    }
//}
