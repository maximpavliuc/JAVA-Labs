package lab3;

import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> candyBoxes;

    public CandyBag() {
        candyBoxes = new ArrayList<>();
    }

    public void addCandyBox(CandyBox candyBox) {
        candyBoxes.add(candyBox);
    }

    public ArrayList<CandyBox> getCandyBoxes() {
        return candyBoxes;
    }

    public static void main(String[] args) {
        // Crearea unui obiect de tip CandyBag
        CandyBag candyBag = new CandyBag();

        // Adăugarea unor cutii de bomboane de tip Lindt
        candyBag.addCandyBox(new Lindt("Chocolate", "Switzerland", 10, 5, 3));
        candyBag.addCandyBox(new Lindt("Vanilla", "France", 8, 4, 2));

        // Testarea egalității obiectelor de tip Lindt
        ArrayList<CandyBox> candyBoxes = candyBag.getCandyBoxes();
        if (candyBoxes.size() >= 2 && candyBoxes.get(0) instanceof Lindt && candyBoxes.get(1) instanceof Lindt) {
            Lindt lindt1 = (Lindt) candyBoxes.get(0);
            Lindt lindt2 = (Lindt) candyBoxes.get(1);
            System.out.println("Are Lindt1 equal to Lindt2? " + lindt1.equals(lindt2));
        } else {
            System.out.println("Not enough Lindt boxes found for comparison.");
        }
    }
}

