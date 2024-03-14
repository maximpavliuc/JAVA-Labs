//package lab3.task1;
//
//public class Area {
//    private CandyBag candyBag;
//    private int number;
//    private String street;
//
//    public Area() {
//        this.candyBag = new CandyBag();
//    }
//
//    public Area(CandyBag candyBag, int number, String street) {
//        this.candyBag = candyBag;
//        this.number = number;
//        this.street = street;
//    }
//
//    public String getBirthdayCard() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Adresa: ").append(number).append(" ").append(street).append("\n");
//        sb.append("Mesaj de la multi ani!").append("\n");
//        return sb.toString();
//    }
//
//    public void printCandyBoxes() {
//        for (CandyBox candyBox : candyBag.getCandyBoxes()) {
//            System.out.println(candyBox);
//        }
//    }
//
//    public void printCandyBoxDimensions() {
//        for (CandyBox candyBox : candyBag.getCandyBoxes()) {
//            if (candyBox instanceof Lindt) {
//                ((Lindt) candyBox).printLindtDim();
//            } else if (candyBox instanceof Baravelli) {
//                ((Baravelli) candyBox).printBaravelliDim();
//            } else if (candyBox instanceof ChocAmor) {
//                ((ChocAmor) candyBox).printChocAmorDim();
//            }
//        }
//    }
//}
