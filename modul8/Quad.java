package modul8;

public class Quad extends Shape {
    private double pointA;

    public Quad(double pointA) {
        this.pointA = pointA;
    }
    @Override
    Shape nameOfFigure() {
        System.out.println("This is Quad");
        return null;
    }

    @Override
    double getArea() {
        return pointA * 2;
    }
}
