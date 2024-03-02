//import java.util.ArrayList;
//import java.util.List;
//
//public class Testare {
//    public static void main(String[] args) {
//        // Crearea obiectelor
//        Sat sat = new Sat("Sat1", 1000);
//        Regiune regiune = new Regiune("Regiune1", 10000, "NumeRegiune1");
//        Oras oras = new Oras("Oras1", 100000, "NumeRegiune1", "NumeOras1");
//        Metropola metropola = new Metropola("Metropola1", 1000000, "NumeRegiune1", "NumeOras1", "NumeMetropola1");
//
//        // Popularea obiectului sat cu obiecte ale clasei copil
//        List<Sat> sate = new ArrayList<>();
//        sate.add(regiune);
//        sate.add(oras);
//        sate.add(metropola);
//
//        // Filtrarea obiectelor dupa populatie
//        Sat satFiltrat = new Sat("SatFiltrat", 100000);
//        List<Sat> sateFiltrate = sat.filterByPopulatie(sate, satFiltrat.getPopulatie());
//        System.out.println("Sate filtrate dupa populatie: " + sateFiltrate);
//
//        // Filtrarea obiectelor dupa populatie si nume
//        List<Sat> sateFiltrate2 = sat.filterByPopulatieAndNume(sate, satFiltrat.getPopulatie(), satFiltrat.getNume());
//        System.out.println("Sate filtrate dupa populatie si nume: " + sateFiltrate2);
//
//        // Compararea obiectului copil cu obiectele din lista
//        for (Sat s : sate) {
//            if (s.equals(satFiltrat)) {
//                System.out.println("Coincide");
//            } else {
//                System.out.println("Nu coincide");
//            }
//        }
//    }
//}