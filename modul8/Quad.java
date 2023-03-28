package modul8;

public class Quad extends Shape {
    private double pointA;

    public Quad(double pointA) {
        this.pointA = pointA;
    }
    @Override
    void nameOfFigure() {
        System.out.println("This is Quad");
    }

    @Override
    double getArea() {
        return pointA * 2;
    }
}
