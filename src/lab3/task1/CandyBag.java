//package lab3.task1;
//
//import java.util.ArrayList;
//
//public class CandyBag {
//    private ArrayList<CandyBox> candyBoxes;
//
//    public CandyBag() {
//        candyBoxes = new ArrayList<>();
//    }
//
//    public void addCandyBox(CandyBox candyBox) {
//        candyBoxes.add(candyBox);
//    }
//
//    public boolean testLindtEquality(Lindt lindt1, Lindt lindt2) {
//        return lindt1.equals(lindt2);
//    }
//
//    public static void main(String[] args) {
//        CandyBag candyBag = new CandyBag();
//        Lindt lindt1 = new Lindt("Chocolate", "Switzerland", 1.0f, 2.0f, 3.0f);
//        Lindt lindt2 = new Lindt("Chocolate", "Switzerland", 1.0f, 2.0f, 3.0f);
//        candyBag.addCandyBox(lindt1);
//        candyBag.addCandyBox(lindt2);
//
//        System.out.println("Are lindt1 and lindt2 equal? " + candyBag.testLindtEquality(lindt1, lindt2));
//    }
//}
