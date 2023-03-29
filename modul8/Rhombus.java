package modul8;

public class Rhombus extends Shape{
    private double diagonal1;
    private double diagonal2;
    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    @Override
    void nameOfFigure() {
        System.out.println("This is Rhombus");
    }
    @Override
    double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}
