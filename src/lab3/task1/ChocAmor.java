package lab3.task1;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor() {
        super();
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor dimensions: Length = " + length);
    }

    @Override
    public float getVolume() {
        return (float) Math.pow(length, 3);
    }

    @Override
    public String toString() {
        return "The " + super.toString() + " has volume " + getVolume();
    }
}
