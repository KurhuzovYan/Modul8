package modul8;

public class Triangle extends Shape {
    private double pointA;
    private double pointB;
    private double pointC;
    @Override
    void nameOfFigure() {
        System.out.println("This is Triangle");
    }
    public Triangle(double pointA, double pointB, double pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }
    private double getPerimeter() {
        return (pointA + pointB + pointC) / 2;
    }
    @Override
    double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - pointA) * (getPerimeter() - pointB) * (getPerimeter() - pointC));
    }
}
