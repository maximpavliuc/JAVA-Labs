package lab3;

import java.util.ArrayList;

public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    // Constructor fără parametri
    public Area() {
        candyBag = new CandyBag();
    }

    // Constructor ce inițializează toate câmpurile
    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    // Metoda pentru a obține felicitarea pentru ziua de naștere
    public String getBirthdayCard() {
        StringBuilder birthdayCard = new StringBuilder();
        birthdayCard.append("Address: ").append(number).append(", ").append(street).append("\n");
        birthdayCard.append("Happy Birthday!");
        return birthdayCard.toString();
    }

    // Parcurgerea array-ului și afișarea elementelor utilizând metoda toString()
    public void printCandyBag() {
        for (CandyBox candyBox : candyBag.getCandyBoxes()) {
            System.out.println(candyBox);
        }
    }

    // Parcurgerea array-ului și apelarea metodelor specifice fiecărei clase
    public void printCandyBoxDetails() {
        for (CandyBox candyBox : candyBag.getCandyBoxes()) {
            if (candyBox instanceof Lindt) {
                ((Lindt) candyBox).printLindtDim();
            } else if (candyBox instanceof Baravelli) {
                ((Baravelli) candyBox).printBaravelliDim();
            } else if (candyBox instanceof ChocAmor) {
                ((ChocAmor) candyBox).printChocAmorDim();
            }
        }
    }

    // Parcurgerea array-ului și apelarea metodelor specifice fiecărei clase fără instanceof
    public void printCandyBoxDetailsWithoutInstanceof() {
        for (CandyBox candyBox : candyBag.getCandyBoxes()) {
            if (candyBox.getClass().equals(Lindt.class)) {
                ((Lindt) candyBox).printLindtDim();
            } else if (candyBox.getClass().equals(Baravelli.class)) {
                ((Baravelli) candyBox).printBaravelliDim();
            } else if (candyBox.getClass().equals(ChocAmor.class)) {
                ((ChocAmor) candyBox).printChocAmorDim();
            }
        }
    }
}
