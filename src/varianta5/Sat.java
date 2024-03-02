//import java.util.ArrayList;
//import java.util.List;
//
//// Clasa de baza
//class Sat {
//    private String nume;
//    private int populatie;
//
//    public Sat(String nume, int populatie) {
//        this.nume = nume;
//        this.populatie = populatie;
//    }
//
//    public String getNume() {
//        return nume;
//    }
//
//    public void setNume(String nume) {
//        this.nume = nume;
//    }
//
//    public int getPopulatie() {
//        return populatie;
//    }
//
//    public void setPopulatie(int populatie) {
//        this.populatie = populatie;
//    }
//
//    // Metoda de filtrare pentru populatie
//    public List<Sat> filterByPopulatie(List<Sat> sate, int populatie) {
//        List<Sat> result = new ArrayList<>();
//        for (Sat sat : sate) {
//            if (sat.getPopulatie() > populatie) {
//                result.add(sat);
//            }
//        }
//        return result;
//    }
//
//    // Metoda de filtrare pentru populatie si nume
//    public List<Sat> filterByPopulatieAndNume(List<Sat> sate, int populatie, String nume) {
//        List<Sat> result = new ArrayList<>();
//        for (Sat sat : sate) {
//            if (sat.getPopulatie() > populatie && sat.getNume().equals(nume)) {
//                result.add(sat);
//            }
//        }
//        return result;
//    }
//
//    // Suprascrierea metodei toString
//    @Override
//    public String toString() {
//        return "Sat{" +
//                "nume='" + nume + '\'' +
//                ", populatie=" + populatie +
//                '}';
//    }
//}