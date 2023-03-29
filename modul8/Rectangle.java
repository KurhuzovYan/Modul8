package modul8;

public class Rectangle extends Shape {
    private String name = "Rectangle";
    private double pointA;
    private double pointB;

    public Rectangle() {
    }

    public Rectangle(double pointA, double pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public String getName() {
        return name;
    }

    @Override
    String getShape() {
        return new Rectangle().getName();
    }

    @Override
    double getArea() {
        return pointA * pointB;
    }
}
