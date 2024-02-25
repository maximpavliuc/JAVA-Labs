package lab2.task3;

public class Polygon {
    private Point[] points;

    public Polygon(int n) {
        points = new Point[n];
    }

    public Polygon(float[] coords) {
        int n = coords.length / 2;
        points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(coords[2 * i], coords[2 * i + 1]);
        }
    }

    public void display() {
        for (Point point : points) {
            point.display();
        }
    }
}
