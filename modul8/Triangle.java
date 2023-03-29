package modul8;

public class Triangle extends Shape {
    private String name = "Triangle";
    private double pointA;
    private double pointB;
    private double pointC;

    public String getName() {
        return name;
    }

    public Triangle() {
    }

    public Triangle(double pointA, double pointB, double pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    String getShape() {
        return new Triangle().getName();
    }

    private double getPerimeter() {
        return (pointA + pointB + pointC) / 2;
    }

    @Override
    double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - pointA) * (getPerimeter() - pointB) * (getPerimeter() - pointC));
    }
}
