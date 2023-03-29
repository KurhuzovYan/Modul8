package modul8;

public class Quad extends Shape {
    private String name = "Quad";
    private double pointA;

    public Quad() {
    }

    public Quad(double pointA) {
        this.pointA = pointA;
    }

    @Override
    String getShape() {
        return new Quad().getName();
    }

    public String getName() {
        return name;
    }

    @Override
    double getArea() {
        return pointA * 2;
    }
}
