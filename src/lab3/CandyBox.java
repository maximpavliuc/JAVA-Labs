package lab3;

import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;

    // Constructor fără parametri
    public CandyBox() {
    }

    // Constructor ce inițializează toate câmpurile
    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    // Metoda getVolume() care returnează valoarea 0
    public float getVolume() {
        return 0;
    }

    // Metoda toString() care returnează flavor-ul și origin-ul cutiei de bomboane
    @Override
    public String toString() {
        return "Flavor: " + flavor + ", Origin: " + origin;
    }

    // Getters and setters (optional)
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CandyBox other = (CandyBox) obj;
        return Objects.equals(flavor, other.flavor) &&
                Objects.equals(origin, other.origin);
    }
}
