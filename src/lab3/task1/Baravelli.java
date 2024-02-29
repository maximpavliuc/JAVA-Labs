package lab3.task1;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {
        super();
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public void printBaravelliDim() {
        System.out.println("Baravelli dimensions: Radius = " + radius + ", Height = " + height);
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public String toString() {
        return "The " + super.toString() + " has volume " + getVolume();
    }
}
