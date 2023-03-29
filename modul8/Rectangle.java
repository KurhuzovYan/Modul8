package modul8;

public class Rectangle extends Shape{
    private double pointA;
    private double pointB;
    public Rectangle(double pointA, double pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }
    @Override
    void nameOfFigure() {
        System.out.println("This is Rectangle");
    }
    @Override
    double getArea() {
        return pointA * pointB;
    }
}
